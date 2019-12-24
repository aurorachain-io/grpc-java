package com.aurora.proto.blockchain;

import com.aurora.proto.account.AccountClient;
import com.aurora.proto.config.Config;
import com.aurora.proto.utils.Utils;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class BlockChainClient {
    public static void main(String[] args) {
        BlockChainClient client = new BlockChainClient(Config.HOST, Config.PORT);
        client.blockNumber();

        AccountClient accountClient = new AccountClient(Config.HOST, Config.PORT);
        List<ByteString> accounts = accountClient.accounts();
        if (accounts != null && !accounts.isEmpty()) {
            System.out.println("\n");
            client.getBalance(accounts.get(0));
            System.out.println("\n");
            client.getDetailBalance(accounts.get(0));
        }
    }

    private final ManagedChannel channel;
    private BlockChainGrpc.BlockChainBlockingStub blockingStub;

    private BlockChainClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        blockingStub = BlockChainGrpc.newBlockingStub(channel);
    }

    private void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    private void blockNumber() {
        BlockChainProto.BlockNumberRequest request = BlockChainProto.BlockNumberRequest.newBuilder().build();

        BlockChainProto.BlockNumberReply reply = blockingStub.blockNumber(request);
        if (reply != null) {
            BigInteger blockNumber = Utils.byteStringToBigInteger(reply.getBlockNumber());
            System.out.println(blockNumber);
        }
    }

    private void getBalance(ByteString account) {
        BlockChainProto.BalanceRequest request = BlockChainProto.BalanceRequest.newBuilder()
                .setAddress(account).build();

        BlockChainProto.BalanceReply reply = blockingStub.getBalance(request);
        if (reply != null) {
            BigInteger balance = Utils.byteStringToBigInteger(reply.getBalance());
            System.out.println("balance: " + balance);
        }
    }

    private void getDetailBalance(ByteString account) {
        BlockChainProto.DetailBalanceRequest request = BlockChainProto.DetailBalanceRequest.newBuilder()
                .setAddress(account).build();

        BlockChainProto.DetailBalanceReply reply = blockingStub.getDetailBalance(request);
        if (reply != null) {
            BigInteger balance = Utils.byteStringToBigInteger(reply.getBalance());
            BigInteger lockBalance = Utils.byteStringToBigInteger(reply.getLockBalance());
            BigInteger totalBalance = Utils.byteStringToBigInteger(reply.getTotalBalance());
            System.out.println("balance: " + balance);
            System.out.println("lockBalance: " + lockBalance);
            System.out.println("totalBalance: " + totalBalance);
        }
    }

}
