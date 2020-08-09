package com.MySNetty.client;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class SubReqClient {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        NioEventLoopGroup group = new NioEventLoopGroup();

        try{
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(group).channel(NioSocketChannel.class)
                    .handler(new ChannelInitializer<Channel>() {

                        @Override
                        protected void initChannel(Channel ch) throws Exception {
                            ch.pipeline()
                                    .addLast("decoder", new ObjectDecoder(ClassResolvers.cacheDisabled(
                                            this.getClass().getClassLoader()
                                    )))
                                    .addLast("encoder", new ObjectEncoder())
                                    .addLast(new SimpleChannelInboundHandler<Object>() {

                                        @Override
                                        protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
                                            System.out.println(msg);
                                        }

                                        @Override
                                        public void channelActive(ChannelHandlerContext ctx) throws Exception {
                                            User user = new User();
                                            user.setName("runtu");
                                            ctx.writeAndFlush(user);
                                        }

                                    });
                        }
                    });
            ChannelFuture future = bootstrap.connect("localhost", 8888).sync();
            future.channel().closeFuture().sync();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            group.shutdownGracefully();
        }
    }

}
