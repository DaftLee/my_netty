package club.dafty.netty.thrift.server;

import club.dafty.netty.thrift.AnimalService;
import club.dafty.netty.thrift.impl.AnimalServiceImpl;
import org.apache.thrift.TProcessorFactory;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.server.THsHaServer;
import org.apache.thrift.server.TServer;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TNonblockingServerSocket;
import org.apache.thrift.transport.TTransportException;

/**
 * @author leechengchao@foxmail.com
 * @date 2019/11/10 18:46
 */
public class ThriftServer {
    public static void main(String[] args) throws Exception {
        // 非阻塞
        TNonblockingServerSocket socket = new TNonblockingServerSocket(8899);
        THsHaServer.Args arg = new THsHaServer.Args(socket).minWorkerThreads(2).maxWorkerThreads(4);
        // 定义处理器
        AnimalService.Processor<AnimalServiceImpl> processor = new AnimalService.Processor<>(new AnimalServiceImpl());
        // 应用层协议类型（客户端、服务端一致）
        arg.protocolFactory(new TCompactProtocol.Factory());
        // 传输层类型（客户端、服务端一致） TframedTransport 用于异步传输
        arg.transportFactory(new TFramedTransport.Factory());
        arg.processorFactory(new TProcessorFactory(processor));
        TServer tServer = new THsHaServer(arg);

        System.out.println("Thrift Server Started!");

        // 死循环
        tServer.serve();

    }
}
