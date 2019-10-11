package Serializable;

import java.io.IOException;
import java.io.Serializable;

public class serializeTest {
    public static void main(String[] args) throws IOException {
        System.out.println("teacher没有继承父类people：");
        Teacher1 t1=new Teacher1();
        SerializeTool.serialize(t1,"teacher");
        SerializeTool.printFileInfo("teacher");
        System.out.println("当teacher为people的子类且父类实现了序列化接口时：");
        Teacher t=new Teacher();
        SerializeTool.serialize(t,"teacher1");
        SerializeTool.printFileInfo("teacher1");
        System.out.println("当teacher为people的子类，父类people没实现继承序列化接口，子类实现了？");
        Teacher2 t2=new Teacher2();
        SerializeTool.serialize(t2,"teacher2");
        SerializeTool.printFileInfo("teacher2");
        System.out.println("当teacher为people的子类，父类people实现继承序列化接口，子类未实现？");
        Teacher3 t3=new Teacher3();
        SerializeTool.serialize(t3,"teacher3");
        SerializeTool.printFileInfo("teacher3");

    }

}
