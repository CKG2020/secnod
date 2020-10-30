package com.ckg.Rpc.Rpc1.client;

import com.ckg.Rpc.Rpc1.RpcHello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class RemoteInvocationHandler implements InvocationHandler {
     private  String host;
     private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host=host;
        this.port=port;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParameters(args);
        TCPTransport tcpTransport = new TCPTransport(this.host, this.port);
        return tcpTransport.send(rpcRequest);


    }


}
