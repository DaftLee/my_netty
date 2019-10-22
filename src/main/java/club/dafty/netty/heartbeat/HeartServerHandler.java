package club.dafty.netty.heartbeat;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

/**
 * @author 李成超
 * @date 2019/10/22 10:08
 * @description TODO
 **/
public class HeartServerHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        // evt事件对象
        if (evt instanceof IdleStateEvent){
            IdleStateEvent event = (IdleStateEvent) evt;
            String eventType = null;
            switch (event.state()){
                case READER_IDLE:
                    eventType="读空闲";
                    break;
                case WRITER_IDLE:
                    eventType="写空闲";
                    break;
                case ALL_IDLE:
                    eventType="读写空闲";
                    break;
                default:
            }
            System.out.println(ctx.channel().remoteAddress()+"超时事件："+eventType);
        }


    }
}
