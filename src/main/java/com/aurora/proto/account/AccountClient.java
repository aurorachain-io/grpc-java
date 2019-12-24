package com.aurora.proto.account;

import com.aurora.proto.config.Config;
import com.aurora.proto.utils.CommonProto;
import com.aurora.proto.utils.Utils;
import com.google.protobuf.ByteString;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class AccountClient {
    public static void main(String[] args) {
        AccountClient client = new AccountClient(Config.HOST, Config.PORT);
        client.accounts();
    }

    private final ManagedChannel channel;
    private AccountGrpc.AccountBlockingStub blockingStub;

    public AccountClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        blockingStub = AccountGrpc.newBlockingStub(channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public List<ByteString> accounts() {
        CommonProto.AccountsRequest request = CommonProto.AccountsRequest.newBuilder().build();
        CommonProto.AccountsReply reply = blockingStub.accounts(request);
        if (reply == null) {
            return null;
        }

        List<ByteString> accounts = reply.getAccountsList();
        for (ByteString account : accounts) {
            System.out.println(Utils.byteStringToHex(account));
        }
        return accounts;
    }

}
