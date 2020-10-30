package com.nyspringnetty;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.net.InetSocketAddress;

@Component("EchoServer")
public class EchoServer
{  // 服务器端口
    private int port=8801;
    // 通过nio方式来接收连接和处理连接
    private static EventLoopGroup boss = new NioEventLoopGroup();
    private static EventLoopGroup work=new NioEventLoopGroup();

    // 启动引导器
    private static ServerBootstrap b = new ServerBootstrap();

    @Autowired
    private  EchoServerHandler echoServerHandler;
    public void run()
    {
        try {
//            b.group(boss, work);
//
//            b.channel(NioServerSocketChannel.class);
//            // 设置监听端口
            b.localAddress(new InetSocketAddress(port));
//            // 设置通道初始化
//            b.childHandler(new ChannelInitializer<SocketChannel>()
//            {
//                //有连接到达时会创建一个channel
//                protected void initChannel(SocketChannel ch) throws Exception
//                {
//                    // pipeline管理channel中的Handler
//                    // 在channel队列中添加一个handler来处理业务
//                    ch.pipeline().addLast("echoServerHandler",echoServerHandler);
//                }
//            });
//            // 配置完成，开始绑定server
//            // 通过调用sync同步方法阻塞直到绑定成功​
//            ChannelFuture f = b.bind().sync();
//            System.out.println(EchoServer.class.getName() +
//                    "start and listen on"+f.channel().localAddress());
//            // 监听服务器关闭事件
//            // 应用程序会一直等待，直到channel关闭
//            f.channel().closeFuture().sync();




            b.group(boss,work).channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<Channel>() {

                        @Override
                        protected void initChannel(Channel ch) throws Exception {
                            ch.pipeline().addLast("echoServerHandler",echoServerHandler);

//                                    .addLast("encoder", new ObjectEncoder())
//                                    .addLast(new SimpleChannelInboundHandler<Object>() {
//
//                                        @Override
//                                        protected void channelRead0(ChannelHandlerContext ctx, Object msg) throws Exception {
//                                            User user1 = (User)msg;
//                                            System.out.println(user1.getName());
//
//                                            User user = new User();
//                                            user.setName("AQ");
//                                            ctx.writeAndFlush(user);
//
//                                        }
//
//                                    }

                        }
                    });

            ChannelFuture f = b.bind().sync();
            System.out.println(EchoServer.class.getName() +
                    "start and listen on"+f.channel().localAddress());
            // 监听服务器关闭事件
            // 应用程序会一直等待，直到channel关闭
            f.channel().closeFuture().sync();

        }





        catch (Exception e)
        {
            e.printStackTrace();
        }
        finally
        {
            // 关闭EventLoopGroup，释放掉所有资源包括创建的线程
            work.shutdownGracefully();
//            boss.shutdownGracefully(); }​}}
            boss.shutdownGracefully();}}}
