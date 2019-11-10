package club.dafty.netty.thrift.server;

import club.dafty.netty.thrift.Animal;
import club.dafty.netty.thrift.AnimalService;
import org.apache.thrift.protocol.TCompactProtocol;
import org.apache.thrift.protocol.TProtocol;
import org.apache.thrift.transport.TFramedTransport;
import org.apache.thrift.transport.TSocket;
import org.apache.thrift.transport.TTransport;

/**
 * @author leechengchao@foxmail.com
 * @date 2019/11/10 18:53
 */
public class ThriftClient {
    public static void main(String[] args) {
        TTransport tTransport = new TFramedTransport(new TSocket("localhost",8899),600);
        TProtocol protocol = new TCompactProtocol(tTransport);
        AnimalService.Client client = new AnimalService.Client(protocol);
        try {
            tTransport.open();
            Animal animal = client.getAnimalByName("chiken");
            System.out.println(animal);

            System.out.println("===========");
            Animal animal1 = new Animal();
            animal1.setName("dog").setLegs(4).setEat(false);
            client.saveAnimal(animal1);

        } catch (Exception e){
            throw new RuntimeException(e.getMessage(),e);
        } finally {
            tTransport.close();
        }
    }
}
