package com.ckg.Rpc.Rpc1.server;

import com.ckg.Rpc.Rpc1.RpcHello;
import com.ckg.Rpc.Rpc1.RpcHelloImpl;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RpcServer {
    private static final ExecutorService exe = Executors.newCachedThreadPool();

    public void publisher(final Object service, int port) {
        ServerSocket serverSocket = null;
        try {
            serverSocket = new ServerSocket(port);

            while (true) {
                Socket socket = serverSocket.accept();
                exe.execute(new ProcessorHandler(socket, service));

            }


        } catch (IOException e) {

            e.printStackTrace();
        } finally {
            if (serverSocket != null) {


                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        }

    }

    public static void main(String[] args) {

        RpcHello rpcHello = new RpcHelloImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.publisher(rpcHello,8080);


    }

}
