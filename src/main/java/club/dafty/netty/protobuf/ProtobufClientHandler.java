package club.dafty.netty.protobuf;

import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.util.concurrent.EventExecutorGroup;

import java.util.Random;

/**
 * @author 李成超
 * @date 2019/11/5 17:47
 * @description TODO
 **/
public class ProtobufClientHandler extends SimpleChannelInboundHandler<Person.Messages> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Person.Messages msg) throws Exception {

    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
//        Person.Student student = Person.Student.newBuilder().setAddress("America").setName("Jack").setAge(10).build();
//        ctx.channel().writeAndFlush(student);
        int randomint = new Random().nextInt(3);
        Person.Messages messages = null;
        switch (randomint) {
            case 0 : messages = Person.Messages.newBuilder()
                    .setDataType(Person.Messages.DataType.StudentType)
                    .setStudent(Person.Student.newBuilder()
                            .setAddress("America").setName("Jack").setAge(10).build())
                    .build(); break;
            case 1 : messages = Person.Messages.newBuilder()
                    .setDataType(Person.Messages.DataType.TeacherType)
                    .setTeacher(Person.Teacher.newBuilder()
                            .setAddress("China").setName("TeacherTom").setAge(12).build())
                    .build(); break;
            case 2 : messages = Person.Messages.newBuilder()
                    .setDataType(Person.Messages.DataType.XiaozhangType)
                    .setXiaozhang(Person.Xiaozhang.newBuilder()
                            .setAddress("France").setName("XiaozhangBob").setAge(13).build())
                    .build(); break;

            default:
        }
        ctx.channel().writeAndFlush(messages);
    }
}
