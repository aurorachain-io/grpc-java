package com.aurora.proto.aurora;

import com.aurora.proto.config.Config;
import com.aurora.proto.utils.Utils;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class AuroraClient {
    public static void main(String[] args) {
        AuroraClient client = new AuroraClient(Config.HOST, Config.PORT);
        client.gasPrice();
        client.protocolVersion();
        client.syncing();
    }

    private final ManagedChannel channel;
    private AuroraGrpc.AuroraBlockingStub blockingStub;

    private AuroraClient(String host, int port) {
        channel = ManagedChannelBuilder.forAddress(host, port)
                .usePlaintext()
                .build();

        blockingStub = AuroraGrpc.newBlockingStub(channel);
    }

    private void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    private void gasPrice() {
        AuroraProto.GasPriceRequest request = AuroraProto.GasPriceRequest.newBuilder().build();

        AuroraProto.GasPriceReply reply = blockingStub.gasPrice(request);
        if (reply != null) {
            BigInteger sum = Utils.byteStringToBigInteger(reply.getPrice());
            System.out.println(sum);
        }
    }

    private void protocolVersion() {
        AuroraProto.ProtocolVersionRequest request = AuroraProto.ProtocolVersionRequest.newBuilder().build();

        AuroraProto.ProtocolVersionReply reply = blockingStub.protocolVersion(request);
        if (reply != null) {
            System.out.println(reply.getVersion());
        }
    }

    private void syncing() {
        AuroraProto.SyncingRequest request = AuroraProto.SyncingRequest.newBuilder().build();

        AuroraProto.SyncingReply reply = blockingStub.syncing(request);
        if (reply != null) {
            System.out.println(reply.getSyncing());
        }
    }
}
