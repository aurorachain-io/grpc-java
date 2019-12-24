package com.aurora.proto.blockchain;

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
    comments = "Source: blockchain/blockchain.proto")
public final class BlockChainGrpc {

  private BlockChainGrpc() {}

  public static final String SERVICE_NAME = "blockchain.BlockChain";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest,
      com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply> getBlockNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "blockNumber",
      requestType = com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest,
      com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply> getBlockNumberMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest, com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply> getBlockNumberMethod;
    if ((getBlockNumberMethod = BlockChainGrpc.getBlockNumberMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getBlockNumberMethod = BlockChainGrpc.getBlockNumberMethod) == null) {
          BlockChainGrpc.getBlockNumberMethod = getBlockNumberMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest, com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "blockNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("blockNumber"))
                  .build();
          }
        }
     }
     return getBlockNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BalanceRequest,
      com.aurora.proto.blockchain.BlockChainProto.BalanceReply> getGetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBalance",
      requestType = com.aurora.proto.blockchain.BlockChainProto.BalanceRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.BalanceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BalanceRequest,
      com.aurora.proto.blockchain.BlockChainProto.BalanceReply> getGetBalanceMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BalanceRequest, com.aurora.proto.blockchain.BlockChainProto.BalanceReply> getGetBalanceMethod;
    if ((getGetBalanceMethod = BlockChainGrpc.getGetBalanceMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetBalanceMethod = BlockChainGrpc.getGetBalanceMethod) == null) {
          BlockChainGrpc.getGetBalanceMethod = getGetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.BalanceRequest, com.aurora.proto.blockchain.BlockChainProto.BalanceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BalanceReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getBalance"))
                  .build();
          }
        }
     }
     return getGetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest,
      com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply> getGetAssetBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAssetBalance",
      requestType = com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest,
      com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply> getGetAssetBalanceMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest, com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply> getGetAssetBalanceMethod;
    if ((getGetAssetBalanceMethod = BlockChainGrpc.getGetAssetBalanceMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetAssetBalanceMethod = BlockChainGrpc.getGetAssetBalanceMethod) == null) {
          BlockChainGrpc.getGetAssetBalanceMethod = getGetAssetBalanceMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest, com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getAssetBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getAssetBalance"))
                  .build();
          }
        }
     }
     return getGetAssetBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest,
      com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply> getGetDetailBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDetailBalance",
      requestType = com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest,
      com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply> getGetDetailBalanceMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest, com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply> getGetDetailBalanceMethod;
    if ((getGetDetailBalanceMethod = BlockChainGrpc.getGetDetailBalanceMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetDetailBalanceMethod = BlockChainGrpc.getGetDetailBalanceMethod) == null) {
          BlockChainGrpc.getGetDetailBalanceMethod = getGetDetailBalanceMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest, com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getDetailBalance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getDetailBalance"))
                  .build();
          }
        }
     }
     return getGetDetailBalanceMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest,
      com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getGetDelegateListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDelegateList",
      requestType = com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.DelegateListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest,
      com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getGetDelegateListMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest, com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getGetDelegateListMethod;
    if ((getGetDelegateListMethod = BlockChainGrpc.getGetDelegateListMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetDelegateListMethod = BlockChainGrpc.getGetDelegateListMethod) == null) {
          BlockChainGrpc.getGetDelegateListMethod = getGetDelegateListMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest, com.aurora.proto.blockchain.BlockChainProto.DelegateListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getDelegateList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DelegateListReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getDelegateList"))
                  .build();
          }
        }
     }
     return getGetDelegateListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest,
      com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getGetTopDelegateListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getTopDelegateList",
      requestType = com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.DelegateListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest,
      com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getGetTopDelegateListMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest, com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getGetTopDelegateListMethod;
    if ((getGetTopDelegateListMethod = BlockChainGrpc.getGetTopDelegateListMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetTopDelegateListMethod = BlockChainGrpc.getGetTopDelegateListMethod) == null) {
          BlockChainGrpc.getGetTopDelegateListMethod = getGetTopDelegateListMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest, com.aurora.proto.blockchain.BlockChainProto.DelegateListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getTopDelegateList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DelegateListReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getTopDelegateList"))
                  .build();
          }
        }
     }
     return getGetTopDelegateListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateRequest,
      com.aurora.proto.blockchain.BlockChainProto.DelegateReply> getGetDelegateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getDelegate",
      requestType = com.aurora.proto.blockchain.BlockChainProto.DelegateRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.DelegateReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateRequest,
      com.aurora.proto.blockchain.BlockChainProto.DelegateReply> getGetDelegateMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.DelegateRequest, com.aurora.proto.blockchain.BlockChainProto.DelegateReply> getGetDelegateMethod;
    if ((getGetDelegateMethod = BlockChainGrpc.getGetDelegateMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetDelegateMethod = BlockChainGrpc.getGetDelegateMethod) == null) {
          BlockChainGrpc.getGetDelegateMethod = getGetDelegateMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.DelegateRequest, com.aurora.proto.blockchain.BlockChainProto.DelegateReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getDelegate"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DelegateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.DelegateReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getDelegate"))
                  .build();
          }
        }
     }
     return getGetDelegateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest,
      com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply> getGetVotesNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVotesNumber",
      requestType = com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest,
      com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply> getGetVotesNumberMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest, com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply> getGetVotesNumberMethod;
    if ((getGetVotesNumberMethod = BlockChainGrpc.getGetVotesNumberMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetVotesNumberMethod = BlockChainGrpc.getGetVotesNumberMethod) == null) {
          BlockChainGrpc.getGetVotesNumberMethod = getGetVotesNumberMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest, com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getVotesNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getVotesNumber"))
                  .build();
          }
        }
     }
     return getGetVotesNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.VotesListRequest,
      com.aurora.proto.blockchain.BlockChainProto.VotesListReply> getGetVotesListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getVotesList",
      requestType = com.aurora.proto.blockchain.BlockChainProto.VotesListRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.VotesListReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.VotesListRequest,
      com.aurora.proto.blockchain.BlockChainProto.VotesListReply> getGetVotesListMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.VotesListRequest, com.aurora.proto.blockchain.BlockChainProto.VotesListReply> getGetVotesListMethod;
    if ((getGetVotesListMethod = BlockChainGrpc.getGetVotesListMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetVotesListMethod = BlockChainGrpc.getGetVotesListMethod) == null) {
          BlockChainGrpc.getGetVotesListMethod = getGetVotesListMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.VotesListRequest, com.aurora.proto.blockchain.BlockChainProto.VotesListReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getVotesList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.VotesListRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.VotesListReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getVotesList"))
                  .build();
          }
        }
     }
     return getGetVotesListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockRequest,
      com.aurora.proto.blockchain.BlockChainProto.BlockReply> getGetBlockByNumberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockByNumber",
      requestType = com.aurora.proto.blockchain.BlockChainProto.BlockRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.BlockReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockRequest,
      com.aurora.proto.blockchain.BlockChainProto.BlockReply> getGetBlockByNumberMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockRequest, com.aurora.proto.blockchain.BlockChainProto.BlockReply> getGetBlockByNumberMethod;
    if ((getGetBlockByNumberMethod = BlockChainGrpc.getGetBlockByNumberMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetBlockByNumberMethod = BlockChainGrpc.getGetBlockByNumberMethod) == null) {
          BlockChainGrpc.getGetBlockByNumberMethod = getGetBlockByNumberMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.BlockRequest, com.aurora.proto.blockchain.BlockChainProto.BlockReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getBlockByNumber"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BlockReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getBlockByNumber"))
                  .build();
          }
        }
     }
     return getGetBlockByNumberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockRequest,
      com.aurora.proto.blockchain.BlockChainProto.BlockReply> getGetBlockByHashMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBlockByHash",
      requestType = com.aurora.proto.blockchain.BlockChainProto.BlockRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.BlockReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockRequest,
      com.aurora.proto.blockchain.BlockChainProto.BlockReply> getGetBlockByHashMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.BlockRequest, com.aurora.proto.blockchain.BlockChainProto.BlockReply> getGetBlockByHashMethod;
    if ((getGetBlockByHashMethod = BlockChainGrpc.getGetBlockByHashMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetBlockByHashMethod = BlockChainGrpc.getGetBlockByHashMethod) == null) {
          BlockChainGrpc.getGetBlockByHashMethod = getGetBlockByHashMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.BlockRequest, com.aurora.proto.blockchain.BlockChainProto.BlockReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getBlockByHash"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BlockRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.BlockReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getBlockByHash"))
                  .build();
          }
        }
     }
     return getGetBlockByHashMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.CodeRequest,
      com.aurora.proto.blockchain.BlockChainProto.CodeReply> getGetCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCode",
      requestType = com.aurora.proto.blockchain.BlockChainProto.CodeRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.CodeReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.CodeRequest,
      com.aurora.proto.blockchain.BlockChainProto.CodeReply> getGetCodeMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.CodeRequest, com.aurora.proto.blockchain.BlockChainProto.CodeReply> getGetCodeMethod;
    if ((getGetCodeMethod = BlockChainGrpc.getGetCodeMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetCodeMethod = BlockChainGrpc.getGetCodeMethod) == null) {
          BlockChainGrpc.getGetCodeMethod = getGetCodeMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.CodeRequest, com.aurora.proto.blockchain.BlockChainProto.CodeReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getCode"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.CodeRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.CodeReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getCode"))
                  .build();
          }
        }
     }
     return getGetCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AbiRequest,
      com.aurora.proto.blockchain.BlockChainProto.AbiReply> getGetAbiMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAbi",
      requestType = com.aurora.proto.blockchain.BlockChainProto.AbiRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.AbiReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AbiRequest,
      com.aurora.proto.blockchain.BlockChainProto.AbiReply> getGetAbiMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AbiRequest, com.aurora.proto.blockchain.BlockChainProto.AbiReply> getGetAbiMethod;
    if ((getGetAbiMethod = BlockChainGrpc.getGetAbiMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetAbiMethod = BlockChainGrpc.getGetAbiMethod) == null) {
          BlockChainGrpc.getGetAbiMethod = getGetAbiMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.AbiRequest, com.aurora.proto.blockchain.BlockChainProto.AbiReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getAbi"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.AbiRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.AbiReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getAbi"))
                  .build();
          }
        }
     }
     return getGetAbiMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.StorageRequest,
      com.aurora.proto.blockchain.BlockChainProto.StorageReply> getGetStorageAtMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStorageAt",
      requestType = com.aurora.proto.blockchain.BlockChainProto.StorageRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.StorageReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.StorageRequest,
      com.aurora.proto.blockchain.BlockChainProto.StorageReply> getGetStorageAtMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.StorageRequest, com.aurora.proto.blockchain.BlockChainProto.StorageReply> getGetStorageAtMethod;
    if ((getGetStorageAtMethod = BlockChainGrpc.getGetStorageAtMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetStorageAtMethod = BlockChainGrpc.getGetStorageAtMethod) == null) {
          BlockChainGrpc.getGetStorageAtMethod = getGetStorageAtMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.StorageRequest, com.aurora.proto.blockchain.BlockChainProto.StorageReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getStorageAt"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.StorageRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.StorageReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getStorageAt"))
                  .build();
          }
        }
     }
     return getGetStorageAtMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.CallRequest,
      com.aurora.proto.blockchain.BlockChainProto.CallReply> getCallMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "call",
      requestType = com.aurora.proto.blockchain.BlockChainProto.CallRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.CallReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.CallRequest,
      com.aurora.proto.blockchain.BlockChainProto.CallReply> getCallMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.CallRequest, com.aurora.proto.blockchain.BlockChainProto.CallReply> getCallMethod;
    if ((getCallMethod = BlockChainGrpc.getCallMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getCallMethod = BlockChainGrpc.getCallMethod) == null) {
          BlockChainGrpc.getCallMethod = getCallMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.CallRequest, com.aurora.proto.blockchain.BlockChainProto.CallReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "call"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.CallRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.CallReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("call"))
                  .build();
          }
        }
     }
     return getCallMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest,
      com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply> getEstimateGasMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "estimateGas",
      requestType = com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest,
      com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply> getEstimateGasMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest, com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply> getEstimateGasMethod;
    if ((getEstimateGasMethod = BlockChainGrpc.getEstimateGasMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getEstimateGasMethod = BlockChainGrpc.getEstimateGasMethod) == null) {
          BlockChainGrpc.getEstimateGasMethod = getEstimateGasMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest, com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "estimateGas"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("estimateGas"))
                  .build();
          }
        }
     }
     return getEstimateGasMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest,
      com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply> getGetAssetInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getAssetInfo",
      requestType = com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest.class,
      responseType = com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest,
      com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply> getGetAssetInfoMethod() {
    io.grpc.MethodDescriptor<com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest, com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply> getGetAssetInfoMethod;
    if ((getGetAssetInfoMethod = BlockChainGrpc.getGetAssetInfoMethod) == null) {
      synchronized (BlockChainGrpc.class) {
        if ((getGetAssetInfoMethod = BlockChainGrpc.getGetAssetInfoMethod) == null) {
          BlockChainGrpc.getGetAssetInfoMethod = getGetAssetInfoMethod = 
              io.grpc.MethodDescriptor.<com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest, com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "blockchain.BlockChain", "getAssetInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply.getDefaultInstance()))
                  .setSchemaDescriptor(new BlockChainMethodDescriptorSupplier("getAssetInfo"))
                  .build();
          }
        }
     }
     return getGetAssetInfoMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BlockChainStub newStub(io.grpc.Channel channel) {
    return new BlockChainStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BlockChainBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new BlockChainBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BlockChainFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new BlockChainFutureStub(channel);
  }

  /**
   */
  public static abstract class BlockChainImplBase implements io.grpc.BindableService {

    /**
     */
    public void blockNumber(com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply> responseObserver) {
      asyncUnimplementedUnaryCall(getBlockNumberMethod(), responseObserver);
    }

    /**
     */
    public void getBalance(com.aurora.proto.blockchain.BlockChainProto.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BalanceReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getAssetBalance(com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getDetailBalance(com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDetailBalanceMethod(), responseObserver);
    }

    /**
     */
    public void getDelegateList(com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegateListMethod(), responseObserver);
    }

    /**
     */
    public void getTopDelegateList(com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetTopDelegateListMethod(), responseObserver);
    }

    /**
     */
    public void getDelegate(com.aurora.proto.blockchain.BlockChainProto.DelegateRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetDelegateMethod(), responseObserver);
    }

    /**
     */
    public void getVotesNumber(com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVotesNumberMethod(), responseObserver);
    }

    /**
     */
    public void getVotesList(com.aurora.proto.blockchain.BlockChainProto.VotesListRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.VotesListReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetVotesListMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByNumber(com.aurora.proto.blockchain.BlockChainProto.BlockRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByNumberMethod(), responseObserver);
    }

    /**
     */
    public void getBlockByHash(com.aurora.proto.blockchain.BlockChainProto.BlockRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetBlockByHashMethod(), responseObserver);
    }

    /**
     */
    public void getCode(com.aurora.proto.blockchain.BlockChainProto.CodeRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.CodeReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetCodeMethod(), responseObserver);
    }

    /**
     */
    public void getAbi(com.aurora.proto.blockchain.BlockChainProto.AbiRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AbiReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAbiMethod(), responseObserver);
    }

    /**
     */
    public void getStorageAt(com.aurora.proto.blockchain.BlockChainProto.StorageRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.StorageReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetStorageAtMethod(), responseObserver);
    }

    /**
     */
    public void call(com.aurora.proto.blockchain.BlockChainProto.CallRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.CallReply> responseObserver) {
      asyncUnimplementedUnaryCall(getCallMethod(), responseObserver);
    }

    /**
     */
    public void estimateGas(com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply> responseObserver) {
      asyncUnimplementedUnaryCall(getEstimateGasMethod(), responseObserver);
    }

    /**
     */
    public void getAssetInfo(com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply> responseObserver) {
      asyncUnimplementedUnaryCall(getGetAssetInfoMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getBlockNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest,
                com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply>(
                  this, METHODID_BLOCK_NUMBER)))
          .addMethod(
            getGetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.BalanceRequest,
                com.aurora.proto.blockchain.BlockChainProto.BalanceReply>(
                  this, METHODID_GET_BALANCE)))
          .addMethod(
            getGetAssetBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest,
                com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply>(
                  this, METHODID_GET_ASSET_BALANCE)))
          .addMethod(
            getGetDetailBalanceMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest,
                com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply>(
                  this, METHODID_GET_DETAIL_BALANCE)))
          .addMethod(
            getGetDelegateListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest,
                com.aurora.proto.blockchain.BlockChainProto.DelegateListReply>(
                  this, METHODID_GET_DELEGATE_LIST)))
          .addMethod(
            getGetTopDelegateListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest,
                com.aurora.proto.blockchain.BlockChainProto.DelegateListReply>(
                  this, METHODID_GET_TOP_DELEGATE_LIST)))
          .addMethod(
            getGetDelegateMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.DelegateRequest,
                com.aurora.proto.blockchain.BlockChainProto.DelegateReply>(
                  this, METHODID_GET_DELEGATE)))
          .addMethod(
            getGetVotesNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest,
                com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply>(
                  this, METHODID_GET_VOTES_NUMBER)))
          .addMethod(
            getGetVotesListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.VotesListRequest,
                com.aurora.proto.blockchain.BlockChainProto.VotesListReply>(
                  this, METHODID_GET_VOTES_LIST)))
          .addMethod(
            getGetBlockByNumberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.BlockRequest,
                com.aurora.proto.blockchain.BlockChainProto.BlockReply>(
                  this, METHODID_GET_BLOCK_BY_NUMBER)))
          .addMethod(
            getGetBlockByHashMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.BlockRequest,
                com.aurora.proto.blockchain.BlockChainProto.BlockReply>(
                  this, METHODID_GET_BLOCK_BY_HASH)))
          .addMethod(
            getGetCodeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.CodeRequest,
                com.aurora.proto.blockchain.BlockChainProto.CodeReply>(
                  this, METHODID_GET_CODE)))
          .addMethod(
            getGetAbiMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.AbiRequest,
                com.aurora.proto.blockchain.BlockChainProto.AbiReply>(
                  this, METHODID_GET_ABI)))
          .addMethod(
            getGetStorageAtMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.StorageRequest,
                com.aurora.proto.blockchain.BlockChainProto.StorageReply>(
                  this, METHODID_GET_STORAGE_AT)))
          .addMethod(
            getCallMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.CallRequest,
                com.aurora.proto.blockchain.BlockChainProto.CallReply>(
                  this, METHODID_CALL)))
          .addMethod(
            getEstimateGasMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest,
                com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply>(
                  this, METHODID_ESTIMATE_GAS)))
          .addMethod(
            getGetAssetInfoMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest,
                com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply>(
                  this, METHODID_GET_ASSET_INFO)))
          .build();
    }
  }

  /**
   */
  public static final class BlockChainStub extends io.grpc.stub.AbstractStub<BlockChainStub> {
    private BlockChainStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockChainStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockChainStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockChainStub(channel, callOptions);
    }

    /**
     */
    public void blockNumber(com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getBlockNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBalance(com.aurora.proto.blockchain.BlockChainProto.BalanceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BalanceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetBalance(com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDetailBalance(com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDetailBalanceMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegateList(com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegateListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getTopDelegateList(com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetTopDelegateListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getDelegate(com.aurora.proto.blockchain.BlockChainProto.DelegateRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetDelegateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVotesNumber(com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVotesNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getVotesList(com.aurora.proto.blockchain.BlockChainProto.VotesListRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.VotesListReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetVotesListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByNumber(com.aurora.proto.blockchain.BlockChainProto.BlockRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByNumberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getBlockByHash(com.aurora.proto.blockchain.BlockChainProto.BlockRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetBlockByHashMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCode(com.aurora.proto.blockchain.BlockChainProto.CodeRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.CodeReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetCodeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAbi(com.aurora.proto.blockchain.BlockChainProto.AbiRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AbiReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAbiMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStorageAt(com.aurora.proto.blockchain.BlockChainProto.StorageRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.StorageReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetStorageAtMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void call(com.aurora.proto.blockchain.BlockChainProto.CallRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.CallReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void estimateGas(com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getEstimateGasMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAssetInfo(com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest request,
        io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetAssetInfoMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BlockChainBlockingStub extends io.grpc.stub.AbstractStub<BlockChainBlockingStub> {
    private BlockChainBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockChainBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockChainBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockChainBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply blockNumber(com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getBlockNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.BalanceReply getBalance(com.aurora.proto.blockchain.BlockChainProto.BalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply getAssetBalance(com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply getDetailBalance(com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDetailBalanceMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.DelegateListReply getDelegateList(com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegateListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.DelegateListReply getTopDelegateList(com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetTopDelegateListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.DelegateReply getDelegate(com.aurora.proto.blockchain.BlockChainProto.DelegateRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetDelegateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply getVotesNumber(com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVotesNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.VotesListReply getVotesList(com.aurora.proto.blockchain.BlockChainProto.VotesListRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetVotesListMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.BlockReply getBlockByNumber(com.aurora.proto.blockchain.BlockChainProto.BlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByNumberMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.BlockReply getBlockByHash(com.aurora.proto.blockchain.BlockChainProto.BlockRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetBlockByHashMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.CodeReply getCode(com.aurora.proto.blockchain.BlockChainProto.CodeRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetCodeMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.AbiReply getAbi(com.aurora.proto.blockchain.BlockChainProto.AbiRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAbiMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.StorageReply getStorageAt(com.aurora.proto.blockchain.BlockChainProto.StorageRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetStorageAtMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.CallReply call(com.aurora.proto.blockchain.BlockChainProto.CallRequest request) {
      return blockingUnaryCall(
          getChannel(), getCallMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply estimateGas(com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest request) {
      return blockingUnaryCall(
          getChannel(), getEstimateGasMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply getAssetInfo(com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetAssetInfoMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BlockChainFutureStub extends io.grpc.stub.AbstractStub<BlockChainFutureStub> {
    private BlockChainFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private BlockChainFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BlockChainFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new BlockChainFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply> blockNumber(
        com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getBlockNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.BalanceReply> getBalance(
        com.aurora.proto.blockchain.BlockChainProto.BalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply> getAssetBalance(
        com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply> getDetailBalance(
        com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDetailBalanceMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getDelegateList(
        com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegateListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply> getTopDelegateList(
        com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetTopDelegateListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.DelegateReply> getDelegate(
        com.aurora.proto.blockchain.BlockChainProto.DelegateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetDelegateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply> getVotesNumber(
        com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVotesNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.VotesListReply> getVotesList(
        com.aurora.proto.blockchain.BlockChainProto.VotesListRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetVotesListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.BlockReply> getBlockByNumber(
        com.aurora.proto.blockchain.BlockChainProto.BlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByNumberMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.BlockReply> getBlockByHash(
        com.aurora.proto.blockchain.BlockChainProto.BlockRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetBlockByHashMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.CodeReply> getCode(
        com.aurora.proto.blockchain.BlockChainProto.CodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetCodeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.AbiReply> getAbi(
        com.aurora.proto.blockchain.BlockChainProto.AbiRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAbiMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.StorageReply> getStorageAt(
        com.aurora.proto.blockchain.BlockChainProto.StorageRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetStorageAtMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.CallReply> call(
        com.aurora.proto.blockchain.BlockChainProto.CallRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCallMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply> estimateGas(
        com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getEstimateGasMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply> getAssetInfo(
        com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetAssetInfoMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_BLOCK_NUMBER = 0;
  private static final int METHODID_GET_BALANCE = 1;
  private static final int METHODID_GET_ASSET_BALANCE = 2;
  private static final int METHODID_GET_DETAIL_BALANCE = 3;
  private static final int METHODID_GET_DELEGATE_LIST = 4;
  private static final int METHODID_GET_TOP_DELEGATE_LIST = 5;
  private static final int METHODID_GET_DELEGATE = 6;
  private static final int METHODID_GET_VOTES_NUMBER = 7;
  private static final int METHODID_GET_VOTES_LIST = 8;
  private static final int METHODID_GET_BLOCK_BY_NUMBER = 9;
  private static final int METHODID_GET_BLOCK_BY_HASH = 10;
  private static final int METHODID_GET_CODE = 11;
  private static final int METHODID_GET_ABI = 12;
  private static final int METHODID_GET_STORAGE_AT = 13;
  private static final int METHODID_CALL = 14;
  private static final int METHODID_ESTIMATE_GAS = 15;
  private static final int METHODID_GET_ASSET_INFO = 16;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BlockChainImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BlockChainImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_BLOCK_NUMBER:
          serviceImpl.blockNumber((com.aurora.proto.blockchain.BlockChainProto.BlockNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockNumberReply>) responseObserver);
          break;
        case METHODID_GET_BALANCE:
          serviceImpl.getBalance((com.aurora.proto.blockchain.BlockChainProto.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BalanceReply>) responseObserver);
          break;
        case METHODID_GET_ASSET_BALANCE:
          serviceImpl.getAssetBalance((com.aurora.proto.blockchain.BlockChainProto.AssetBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AssetBalanceReply>) responseObserver);
          break;
        case METHODID_GET_DETAIL_BALANCE:
          serviceImpl.getDetailBalance((com.aurora.proto.blockchain.BlockChainProto.DetailBalanceRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DetailBalanceReply>) responseObserver);
          break;
        case METHODID_GET_DELEGATE_LIST:
          serviceImpl.getDelegateList((com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply>) responseObserver);
          break;
        case METHODID_GET_TOP_DELEGATE_LIST:
          serviceImpl.getTopDelegateList((com.aurora.proto.blockchain.BlockChainProto.DelegateListRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateListReply>) responseObserver);
          break;
        case METHODID_GET_DELEGATE:
          serviceImpl.getDelegate((com.aurora.proto.blockchain.BlockChainProto.DelegateRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.DelegateReply>) responseObserver);
          break;
        case METHODID_GET_VOTES_NUMBER:
          serviceImpl.getVotesNumber((com.aurora.proto.blockchain.BlockChainProto.VotesNumberRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.VotesNumberReply>) responseObserver);
          break;
        case METHODID_GET_VOTES_LIST:
          serviceImpl.getVotesList((com.aurora.proto.blockchain.BlockChainProto.VotesListRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.VotesListReply>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_NUMBER:
          serviceImpl.getBlockByNumber((com.aurora.proto.blockchain.BlockChainProto.BlockRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockReply>) responseObserver);
          break;
        case METHODID_GET_BLOCK_BY_HASH:
          serviceImpl.getBlockByHash((com.aurora.proto.blockchain.BlockChainProto.BlockRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.BlockReply>) responseObserver);
          break;
        case METHODID_GET_CODE:
          serviceImpl.getCode((com.aurora.proto.blockchain.BlockChainProto.CodeRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.CodeReply>) responseObserver);
          break;
        case METHODID_GET_ABI:
          serviceImpl.getAbi((com.aurora.proto.blockchain.BlockChainProto.AbiRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AbiReply>) responseObserver);
          break;
        case METHODID_GET_STORAGE_AT:
          serviceImpl.getStorageAt((com.aurora.proto.blockchain.BlockChainProto.StorageRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.StorageReply>) responseObserver);
          break;
        case METHODID_CALL:
          serviceImpl.call((com.aurora.proto.blockchain.BlockChainProto.CallRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.CallReply>) responseObserver);
          break;
        case METHODID_ESTIMATE_GAS:
          serviceImpl.estimateGas((com.aurora.proto.blockchain.BlockChainProto.EstimateGasRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.EstimateGasReply>) responseObserver);
          break;
        case METHODID_GET_ASSET_INFO:
          serviceImpl.getAssetInfo((com.aurora.proto.blockchain.BlockChainProto.AssetInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.aurora.proto.blockchain.BlockChainProto.AssetInfoReply>) responseObserver);
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

  private static abstract class BlockChainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BlockChainBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.aurora.proto.blockchain.BlockChainProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BlockChain");
    }
  }

  private static final class BlockChainFileDescriptorSupplier
      extends BlockChainBaseDescriptorSupplier {
    BlockChainFileDescriptorSupplier() {}
  }

  private static final class BlockChainMethodDescriptorSupplier
      extends BlockChainBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BlockChainMethodDescriptorSupplier(String methodName) {
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
      synchronized (BlockChainGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BlockChainFileDescriptorSupplier())
              .addMethod(getBlockNumberMethod())
              .addMethod(getGetBalanceMethod())
              .addMethod(getGetAssetBalanceMethod())
              .addMethod(getGetDetailBalanceMethod())
              .addMethod(getGetDelegateListMethod())
              .addMethod(getGetTopDelegateListMethod())
              .addMethod(getGetDelegateMethod())
              .addMethod(getGetVotesNumberMethod())
              .addMethod(getGetVotesListMethod())
              .addMethod(getGetBlockByNumberMethod())
              .addMethod(getGetBlockByHashMethod())
              .addMethod(getGetCodeMethod())
              .addMethod(getGetAbiMethod())
              .addMethod(getGetStorageAtMethod())
              .addMethod(getCallMethod())
              .addMethod(getEstimateGasMethod())
              .addMethod(getGetAssetInfoMethod())
              .build();
        }
      }
    }
    return result;
  }
}
