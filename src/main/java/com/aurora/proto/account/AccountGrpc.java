package com.aurora.proto.account;

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
    comments = "Source: account/account.proto")
public final class AccountGrpc {

  private AccountGrpc() {}

  public static final String SERVICE_NAME = "account.Account";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.utils.CommonProto.AccountsRequest,
      com.aurora.proto.utils.CommonProto.AccountsReply> getAccountsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "accounts",
      requestType = com.aurora.proto.utils.CommonProto.AccountsRequest.class,
      responseType = com.aurora.proto.utils.CommonProto.AccountsReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.utils.CommonProto.AccountsRequest,
      com.aurora.proto.utils.CommonProto.AccountsReply> getAccountsMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.utils.CommonProto.AccountsRequest, com.aurora.proto.utils.CommonProto.AccountsReply> getAccountsMethod;
    if ((getAccountsMethod = AccountGrpc.getAccountsMethod) == null) {
      synchronized (AccountGrpc.class) {
        if ((getAccountsMethod = AccountGrpc.getAccountsMethod) == null) {
          AccountGrpc.getAccountsMethod = getAccountsMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.utils.CommonProto.AccountsRequest, com.aurora.proto.utils.CommonProto.AccountsReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "account.Account", "accounts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.utils.CommonProto.AccountsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.utils.CommonProto.AccountsReply.getDefaultInstance()))
                  .setSchemaDescriptor(new AccountMethodDescriptorSupplier("accounts"))
                  .build();
          }
        }
     }
     return getAccountsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountStub newStub(io.grpc.Channel channel) {
    return new AccountStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new AccountBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new AccountFutureStub(channel);
  }

  /**
   */
  public static abstract class AccountImplBase implements io.grpc.BindableService {

    /**
     */
    public void accounts(com.aurora.proto.utils.CommonProto.AccountsRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.utils.CommonProto.AccountsReply> responseObserver) {
      asyncUnimplementedUnaryCall(getAccountsMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAccountsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.utils.CommonProto.AccountsRequest,
                com.aurora.proto.utils.CommonProto.AccountsReply>(
                  this, METHODID_ACCOUNTS)))
          .build();
    }
  }

  /**
   */
  public static final class AccountStub extends io.grpc.stub.AbstractStub<AccountStub> {
    private AccountStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountStub(channel, callOptions);
    }

    /**
     */
    public void accounts(com.aurora.proto.utils.CommonProto.AccountsRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.utils.CommonProto.AccountsReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountBlockingStub extends io.grpc.stub.AbstractStub<AccountBlockingStub> {
    private AccountBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aurora.proto.utils.CommonProto.AccountsReply accounts(com.aurora.proto.utils.CommonProto.AccountsRequest request) {
      return blockingUnaryCall(
          getChannel(), getAccountsMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountFutureStub extends io.grpc.stub.AbstractStub<AccountFutureStub> {
    private AccountFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private AccountFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new AccountFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.utils.CommonProto.AccountsReply> accounts(
        com.aurora.proto.utils.CommonProto.AccountsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAccountsMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_ACCOUNTS = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_ACCOUNTS:
          serviceImpl.accounts((com.aurora.proto.utils.CommonProto.AccountsRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.utils.CommonProto.AccountsReply>) responseObserver);
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

  private static abstract class AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aurora.proto.account.AccountProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Account");
    }
  }

  private static final class AccountFileDescriptorSupplier
      extends AccountBaseDescriptorSupplier {
    AccountFileDescriptorSupplier() {}
  }

  private static final class AccountMethodDescriptorSupplier
      extends AccountBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountFileDescriptorSupplier())
              .addMethod(getAccountsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
