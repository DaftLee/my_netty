package club.dafty.netty.chat;

import club.dafty.netty.socket.SocketClient;
import club.dafty.netty.socket.SocketClientHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.ServerChannel;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.DelimiterBasedFrameDecoder;
import io.netty.handler.codec.Delimiters;
import io.netty.handler.codec.LengthFieldBasedFrameDecoder;
import io.netty.handler.codec.LengthFieldPrepender;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.util.CharsetUtil;

import java.net.ServerSocket;

/**
 * @author 李成超
 * @date 2019/10/22 8:45
 * @description TODO
 **/
public class ChatClientInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline pipeline = ch.pipeline();

        pipeline.addLast("StringDecoder",new StringDecoder(CharsetUtil.UTF_8));
        pipeline.addLast("StringEncoder",new StringEncoder(CharsetUtil.UTF_8));
        pipeline.addLast(new DelimiterBasedFrameDecoder(4096, Delimiters.lineDelimiter()));
        pipeline.addLast(new ChatClientHandler());
    }
}
