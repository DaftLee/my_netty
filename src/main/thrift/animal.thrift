namespace java club.dafty.netty.thrift

typedef i16 short
typedef i32 int
typedef i64 long
typedef string String
typedef bool boolean

struct Animal {
    1: optional String name;
    2: optional int legs;
    3: optional boolean eat;
}

exception DataException {
    1: optional String message;
    2: optional String callStack;
    3: optional String date;
}

service AnimalService {
    Animal getAnimalByName(1: required String name) throws (1: DataException dataException),
    void saveAnimal(1: required Animal animal) throws (1: DataException dataException)
}

#thrift --gen java src/main/thrift/animal.thrift