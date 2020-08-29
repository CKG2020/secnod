package com.ckg.Rpc.Rpc1.client;

import com.ckg.Rpc.Rpc1.RpcHello;

import java.lang.reflect.Proxy;

public class RpcClientProxy {


public <T>  T clientProxy(final Class<T> interfaces,final String host,final int port){
    return (T) Proxy.newProxyInstance(interfaces.getClassLoader(),new Class[]{
        interfaces},new RemoteInvocationHandler(host,port));
    }

    public static void main(String[] args) {
        RpcClientProxy rpcClientProxy = new RpcClientProxy();
        RpcHello hello = rpcClientProxy.clientProxy(RpcHello.class, "localhost", 8080);
        System.out.println(hello.sayHello("ckg"));
    }
}





