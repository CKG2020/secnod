package com.ckg.Rpc.Rpc1;

public class RpcHelloImpl implements  RpcHello {
    public String sayHello(String msg) {
    return "RPC: Hello"+msg;
    }
}
