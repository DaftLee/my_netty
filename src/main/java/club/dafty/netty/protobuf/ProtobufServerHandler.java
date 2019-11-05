package club.dafty.netty.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 李成超
 * @date 2019/11/5 17:37
 * @description TODO
 **/
public class ProtobufServerHandler extends SimpleChannelInboundHandler<Person.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Person.Student msg) throws Exception {
        System.out.println(msg);
    }

}
