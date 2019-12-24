grpc-java
=========

develop grpc client by using java


**Compile .proto file**

We need to generate the gRPC client and server interface from the .proto service definition. We do this through the protocol buffer's compiler protoc and a special gRPC Java plugin.



* Ubuntu 18.04.2 LTS

install protoc compiler

    sudo apt-get install libprotoc-dev

execute *.sh文件

    xx@xx-ubuntu:~/workspace/intellij/grpc-java/src/main/proto$ ./account/account.sh


Generate AccountGrpc.java and AccountProto.java after success

* Windows

The address downloaded by the compiler protoc and the gRPC Java plugin has been written in the plugins.txt file，you can write a batch after successful download.




**New grpc client for java**

For example:

    com/aurora/proto/account/ccountClient.java
    
```Java
private final ManagedChannel channel;
private AccountGrpc.AccountBlockingStub blockingStub;

public AccountClient(String host, int port) {
    channel = ManagedChannelBuilder.forAddress(host, port)
            .usePlaintext()
            .build();

    blockingStub = AccountGrpc.newBlockingStub(channel);
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
```
