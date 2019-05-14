package org.serialization;
import java.io.*;
class Student implements Serializable{
    private transient String name="Arulsuju";
    private static int age=21;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class SerializationDemo {
    public static void main(String[] args)throws Exception {
        Student student=new Student();
        FileOutputStream fos=new FileOutputStream("out.obj");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(fos);
        objectOutputStream.writeObject(student);
        FileInputStream fis=new FileInputStream("out.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student student1=(Student)ois.readObject();
        System.out.println(student1.getName());
        student1.setAge(23);
        System.out.println(student1.getAge());
    }
}
