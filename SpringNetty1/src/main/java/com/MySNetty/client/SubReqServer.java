package   com.MySNetty.client;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class SubReqServer {

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        NioEventLoopGroup bossGroup = new NioEventLoopGroup();
        NioEventLoopGroup workGroup = new NioEventLoopGroup();

        try{
            ServerBootstrap serverBootstrap = new ServerBootstrap();
            serverBootstrap.group(bossGroup,workGroup).channel(NioServerSocketChannel.class)
                    .childHandler(new ChannelInitializer<Channel>() {

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
                                            User user1 = (User)msg;
                                            System.out.println(user1.getName());

                                            User user = new User();
                                            user.setName("AQ");
                                            ctx.writeAndFlush(user);

                                        }

                                    });
                        }
                    });
            ChannelFuture future = serverBootstrap.bind(8888).sync();
            future.channel().closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally{
            bossGroup.shutdownGracefully();
            workGroup.shutdownGracefully();
        }
    }

}
