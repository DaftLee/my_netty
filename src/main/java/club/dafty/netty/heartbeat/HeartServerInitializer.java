package club.dafty.netty.heartbeat;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

/**
 * @author 李成超
 * @date 2019/10/22 10:02
 * @description TODO
 **/
public class HeartServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();
        // 读、写、读写超过多少时间
        pipeline.addLast(new IdleStateHandler(5,7,10, TimeUnit.SECONDS));
        pipeline.addLast(new HeartServerHandler());
    }
}
