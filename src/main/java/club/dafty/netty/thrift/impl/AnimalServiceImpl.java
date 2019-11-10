package club.dafty.netty.thrift.impl;

import club.dafty.netty.protobuf.Person;
import club.dafty.netty.thrift.Animal;
import club.dafty.netty.thrift.AnimalService;
import club.dafty.netty.thrift.DataException;
import org.apache.thrift.TException;

/**
 * @author leechengchao@foxmail.com
 * @date 2019/11/10 18:42
 */
public class AnimalServiceImpl implements AnimalService.Iface {
    @Override
    public Animal getAnimalByName(String name) throws DataException, TException {
        System.out.println("Got client param:"+name);
        Animal animal = new Animal();
        animal.setEat(true).setLegs(2).setName(name);
        return animal;
    }

    @Override
    public void saveAnimal(Animal animal) throws DataException, TException {
        System.out.println("Got client param saveAnimal");
        System.out.println(animal);
    }
}
