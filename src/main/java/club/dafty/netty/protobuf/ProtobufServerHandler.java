package club.dafty.netty.protobuf;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @author 李成超
 * @date 2019/11/5 17:37
 * @description TODO
 **/
public class ProtobufServerHandler extends SimpleChannelInboundHandler<Person.Messages> {
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, Person.Messages msg) throws Exception {
//        System.out.println(msg);

        Person.Messages.DataType dataType = msg.getDataType();

        switch (dataType) {
            case StudentType: {
                Person.Student msgs = msg.getStudent();
                System.out.println(msgs.getAddress());
                System.out.println(msgs.getName());
                System.out.println(msgs.getAge());
            } break;
            case TeacherType: {
                Person.Teacher msgs = msg.getTeacher();
                System.out.println(msgs.getName());
                System.out.println(msgs.getAge());
            } break;

            case XiaozhangType: {
                Person.Xiaozhang msgs = msg.getXiaozhang();
                System.out.println(msgs.getAddress());
                System.out.println(msgs.getName());
            } break;
            default:
        }
    }

}
