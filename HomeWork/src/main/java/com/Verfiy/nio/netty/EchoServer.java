package com.Verfiy.nio.netty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

public class EchoServer {
    static  final int port=Integer.parseInt(System.getProperty
            ("port","8080"));

    public static void main(String[] args) throws InterruptedException {
        //创建  accept线程组 NioEventLoop
        NioEventLoopGroup bossGroup = new NioEventLoopGroup(1);
        //IO线程组
        NioEventLoopGroup workerGroup = new NioEventLoopGroup(1);

        try {
         //服务端启动引导工具类
            ServerBootstrap serverBootstrap = new ServerBootstrap();


            serverBootstrap.group(bossGroup, workerGroup)
                    .option(ChannelOption.SO_BACKLOG, 100)
                    .handler(new LoggingHandler(LogLevel.DEBUG))
                    .childHandler(new ChannelInitializer<SocketChannel>() {

                        public void initChannel(SocketChannel channel) {

                            ChannelPipeline pipeline = channel.pipeline();
//                        pipeline.addLast(new StringDecoder());
//                        pipeline.addLast(new StringEncoder());
//                        pipeline.addLast(new BizHandler());
                            pipeline.addLast((ChannelHandler) new EchoServer());
                        }
                    });
            ChannelFuture f = serverBootstrap.bind(port).sync();
            f.channel()
                    .closeFuture()
                    .sync();


        }

        finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }





}
