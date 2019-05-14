package org.externalization;

import java.io.*;
import java.util.HashSet;

class Student implements Externalizable{
    private String name="suju";
    private int age=21;
    private int no=10;

    public Student(){}
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
          out.writeObject(name);
          out.writeInt(age);
          out.writeInt(no);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        name=(String)in.readObject();
        age=in.readInt();
        no=in.readInt();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", no=" + no +
                '}';
    }
}
public class ExternalDemo  {
    public static void main(String[] args) throws Exception{

        Student student=new Student();
        FileOutputStream fos=new FileOutputStream("sample.obj");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(student);


        FileInputStream fis=new FileInputStream("sample.obj");
        ObjectInputStream ois=new ObjectInputStream(fis);
        Student student1=(Student)ois.readObject();
        System.out.println(student1.toString());


    }
}

