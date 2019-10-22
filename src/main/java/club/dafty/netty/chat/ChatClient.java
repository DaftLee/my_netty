package club.dafty.netty.chat;

import club.dafty.netty.socket.SocketClientInitializer;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 李成超
 * @date 2019/10/22 8:44
 * @description TODO
 **/
public class ChatClient {
    public static void main(String[] args) throws InterruptedException, IOException {
        EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
        try {
            Bootstrap bootstrap = new Bootstrap();
            bootstrap.group(eventLoopGroup).channel(NioSocketChannel.class)
                    .handler(new ChatClientInitializer());
            Channel channel = bootstrap.connect("localhost",8899).sync().channel();
            while (true){
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                channel.writeAndFlush(br.readLine());
            }
        }finally {
            eventLoopGroup.shutdownGracefully();
        }
    }
}
