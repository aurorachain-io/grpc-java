package com.aurora.proto.aurora;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.21.0)",
    comments = "Source: aurora.proto")
public final class AuroraGrpc {

  private AuroraGrpc() {}

  public static final String SERVICE_NAME = "aurora.Aurora";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.GasPriceRequest,
      com.aurora.proto.aurora.AuroraProto.GasPriceReply> getGasPriceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "gasPrice",
      requestType = com.aurora.proto.aurora.AuroraProto.GasPriceRequest.class,
      responseType = com.aurora.proto.aurora.AuroraProto.GasPriceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.GasPriceRequest,
      com.aurora.proto.aurora.AuroraProto.GasPriceReply> getGasPriceMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.GasPriceRequest, com.aurora.proto.aurora.AuroraProto.GasPriceReply> getGasPriceMethod;
    if ((getGasPriceMethod = AuroraGrpc.getGasPriceMethod) == null) {
      synchronized (AuroraGrpc.class) {
        if ((getGasPriceMethod = AuroraGrpc.getGasPriceMethod) == null) {
          AuroraGrpc.getGasPriceMethod = getGasPriceMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.aurora.AuroraProto.GasPriceRequest, com.aurora.proto.aurora.AuroraProto.GasPriceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aurora.Aurora", "gasPrice"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.aurora.AuroraProto.GasPriceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.aurora.AuroraProto.GasPriceReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AuroraMethodDescriptorSupplier("gasPrice"))
                  .build();
          }
        }
     }
     return getGasPriceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest,
      com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply> getProtocolVersionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "protocolVersion",
      requestType = com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest.class,
      responseType = com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest,
      com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply> getProtocolVersionMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest, com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply> getProtocolVersionMethod;
    if ((getProtocolVersionMethod = AuroraGrpc.getProtocolVersionMethod) == null) {
      synchronized (AuroraGrpc.class) {
        if ((getProtocolVersionMethod = AuroraGrpc.getProtocolVersionMethod) == null) {
          AuroraGrpc.getProtocolVersionMethod = getProtocolVersionMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest, com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aurora.Aurora", "protocolVersion"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AuroraMethodDescriptorSupplier("protocolVersion"))
                  .build();
          }
        }
     }
     return getProtocolVersionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.SyncingRequest,
      com.aurora.proto.aurora.AuroraProto.SyncingReply> getSyncingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "syncing",
      requestType = com.aurora.proto.aurora.AuroraProto.SyncingRequest.class,
      responseType = com.aurora.proto.aurora.AuroraProto.SyncingReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.SyncingRequest,
      com.aurora.proto.aurora.AuroraProto.SyncingReply> getSyncingMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.aurora.AuroraProto.SyncingRequest, com.aurora.proto.aurora.AuroraProto.SyncingReply> getSyncingMethod;
    if ((getSyncingMethod = AuroraGrpc.getSyncingMethod) == null) {
      synchronized (AuroraGrpc.class) {
        if ((getSyncingMethod = AuroraGrpc.getSyncingMethod) == null) {
          AuroraGrpc.getSyncingMethod = getSyncingMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.aurora.AuroraProto.SyncingRequest, com.aurora.proto.aurora.AuroraProto.SyncingReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "aurora.Aurora", "syncing"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.aurora.AuroraProto.SyncingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.aurora.AuroraProto.SyncingReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AuroraMethodDescriptorSupplier("syncing"))
                  .build();
          }
        }
     }
     return getSyncingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AuroraStub newStub(io.grpc.Channel channel) {
    return new AuroraStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AuroraBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AuroraBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AuroraFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AuroraFutureStub(channel);
  }

  /**
   */
  public static abstract class AuroraImplBase implements io.grpc.BindableService {

    /**
     */
    public void gasPrice(com.aurora.proto.aurora.AuroraProto.GasPriceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.GasPriceReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGasPriceMethod(), responseObserver);
    }

    /**
     */
    public void protocolVersion(com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply> responseObserver) {
      asyncUnimplementedUnaryCall(getProtocolVersionMethod(), responseObserver);
    }

    /**
     */
    public void syncing(com.aurora.proto.aurora.AuroraProto.SyncingRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.SyncingReply> responseObserver) {
      asyncUnimplementedUnaryCall(getSyncingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGasPriceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.aurora.AuroraProto.GasPriceRequest,
                com.aurora.proto.aurora.AuroraProto.GasPriceReply>(
                  this, METHODID_GAS_PRICE)))
          .addMethod(
            getProtocolVersionMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest,
                com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply>(
                  this, METHODID_PROTOCOL_VERSION)))
          .addMethod(
            getSyncingMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.aurora.AuroraProto.SyncingRequest,
                com.aurora.proto.aurora.AuroraProto.SyncingReply>(
                  this, METHODID_SYNCING)))
          .build();
    }
  }

  /**
   */
  public static final class AuroraStub extends io.grpc.stub.AbstractStub<AuroraStub> {
    private AuroraStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuroraStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuroraStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuroraStub(channel, callOptions);
    }

    /**
     */
    public void gasPrice(com.aurora.proto.aurora.AuroraProto.GasPriceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.GasPriceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGasPriceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void protocolVersion(com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getProtocolVersionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void syncing(com.aurora.proto.aurora.AuroraProto.SyncingRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.SyncingReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSyncingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AuroraBlockingStub extends io.grpc.stub.AbstractStub<AuroraBlockingStub> {
    private AuroraBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuroraBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuroraBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuroraBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aurora.proto.aurora.AuroraProto.GasPriceReply gasPrice(com.aurora.proto.aurora.AuroraProto.GasPriceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGasPriceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply protocolVersion(com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest request) {
      return blockingUnaryCall(
          getChannel(), getProtocolVersionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.aurora.AuroraProto.SyncingReply syncing(com.aurora.proto.aurora.AuroraProto.SyncingRequest request) {
      return blockingUnaryCall(
          getChannel(), getSyncingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AuroraFutureStub extends io.grpc.stub.AbstractStub<AuroraFutureStub> {
    private AuroraFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AuroraFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AuroraFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AuroraFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.aurora.AuroraProto.GasPriceReply> gasPrice(
        com.aurora.proto.aurora.AuroraProto.GasPriceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGasPriceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply> protocolVersion(
        com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getProtocolVersionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.aurora.AuroraProto.SyncingReply> syncing(
        com.aurora.proto.aurora.AuroraProto.SyncingRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSyncingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GAS_PRICE = 0;
  private static final int METHODID_PROTOCOL_VERSION = 1;
  private static final int METHODID_SYNCING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AuroraImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AuroraImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GAS_PRICE:
          serviceImpl.gasPrice((com.aurora.proto.aurora.AuroraProto.GasPriceRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.GasPriceReply>) responseObserver);
          break;
        case METHODID_PROTOCOL_VERSION:
          serviceImpl.protocolVersion((com.aurora.proto.aurora.AuroraProto.ProtocolVersionRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.ProtocolVersionReply>) responseObserver);
          break;
        case METHODID_SYNCING:
          serviceImpl.syncing((com.aurora.proto.aurora.AuroraProto.SyncingRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.aurora.AuroraProto.SyncingReply>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class AuroraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AuroraBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aurora.proto.aurora.AuroraProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Aurora");
    }
  }

  private static final class AuroraFileDescriptorSupplier
      extends AuroraBaseDescriptorSupplier {
    AuroraFileDescriptorSupplier() {}
  }

  private static final class AuroraMethodDescriptorSupplier
      extends AuroraBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AuroraMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (AuroraGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AuroraFileDescriptorSupplier())
              .addMethod(getGasPriceMethod())
              .addMethod(getProtocolVersionMethod())
              .addMethod(getSyncingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
