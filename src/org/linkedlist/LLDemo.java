package org.linkedlist;

import java.util.LinkedList;
import java.util.List;

class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
public class LLDemo {

    public static void main(String[] args) {
        List<Student> list=new LinkedList<>();
        list.add(new Student("shimona",33));
        list.add(new Student("sha",32));
        list.add(new Student("imona",33));
        list.add(new Student("mona",34));

        for(Student s:list){
            //list.remove(1);
            System.out.println(s.getName());
            System.out.println(s.getAge());
        }
    }
}
