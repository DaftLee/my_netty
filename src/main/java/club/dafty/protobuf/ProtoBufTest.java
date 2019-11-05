package club.dafty.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;

/**
 * @author 李成超
 * @date 2019/11/5 17:22
 * @description TODO
 **/
public class ProtoBufTest {
    public static void main(String[] args) throws InvalidProtocolBufferException {
        DataInfo.Student stu = DataInfo.Student.newBuilder().setAddress("nj").setAge(11).setName("Tom").build();
        byte[] stuBytes = stu.toByteArray();
        DataInfo.Student student = DataInfo.Student.parseFrom(stuBytes);
        System.out.println("stu:"+stu);
        System.out.println("student:"+student);
    }
}
