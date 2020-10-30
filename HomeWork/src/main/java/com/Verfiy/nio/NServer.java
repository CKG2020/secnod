package com.Verfiy.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.charset.Charset;

public class NServer {
    private Selector selector=null;
       static  final int port=30000;

         private  Charset charset=Charset.forName("UTF-8");
    public void init() throws IOException {
       selector = Selector.open();

        ServerSocketChannel server = ServerSocketChannel.open();
        InetSocketAddress inetSocketAddress = new InetSocketAddress("0.0.0.0", port);





    }










}
