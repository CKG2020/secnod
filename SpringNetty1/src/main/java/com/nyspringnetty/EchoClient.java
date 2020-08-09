package com.nyspringnetty;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

@Component("EchoClient")
 public class EchoClient { // 服务器ip地址

    private String host="127.0.0.1";
    //      服务器端口

    private int port=8801;
//通过nio接受和发送消息

          private   EventLoopGroup   group=new NioEventLoopGroup();

    @Autowired
//    private EchoClientHandler echoClientHandler; ​

    private EchoClientHandler echoClientHandler;

    /**
     * 唯一标记
     */

    private boolean initFalg=true;






    public void run() {
//        doConnect(new Bootstrap(), group); } ​
        doConnect(new Bootstrap(),group);}


    /**
     * 重连
     */
    public void doConnect(Bootstrap bootstrap, EventLoopGroup eventLoopGroup) {
        ChannelFuture f = null;
        try {
            if (bootstrap != null) {
                bootstrap.group(eventLoopGroup);
                bootstrap.channel(NioSocketChannel.class);
                bootstrap.option(ChannelOption.SO_KEEPALIVE, true);
//                bootstrap.remoteAddress(host, port); ​
                bootstrap.remoteAddress(host,port);
                // 设置通道初始化
                bootstrap.handler(
                        new ChannelInitializer<SocketChannel>() {
                            public void initChannel(SocketChannel ch) throws Exception {
                                ch.pipeline().addLast(echoClientHandler);
                            }
                        });
                f = bootstrap.connect().addListener((ChannelFuture futureListener) ->
                {
                    final EventLoop eventLoop = futureListener.channel().eventLoop();
                    if (!futureListener.isSuccess()) {
                        System.out.println("与服务端断开连接!在10s之后准备尝试重连!");
                        eventLoop.schedule(
                                () -> doConnect(new Bootstrap(), eventLoop), 10, TimeUnit.SECONDS);
                    }
                });
                if (initFalg) {
                    System.out.println("EchoClient客户端连接成功!"); }
                initFalg = false;
            }
//         阻塞
            f.channel().closeFuture().sync();
        } catch (Exception e) {
            System.out.println("客户端连接失败!" + e.getMessage());}}}