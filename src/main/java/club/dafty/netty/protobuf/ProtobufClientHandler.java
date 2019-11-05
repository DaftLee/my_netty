package club.dafty.netty.protobuf;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

/**
 * @author 李成超
 * @date 2019/11/5 17:47
 * @description TODO
 **/
public class ProtobufClientHandler extends SimpleChannelInboundHandler<Person.Student> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Person.Student msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        Person.Student student = Person.Student.newBuilder().setAddress("America").setName("Jack").setAge(10).build();
        ctx.channel().writeAndFlush(student);
    }
}
