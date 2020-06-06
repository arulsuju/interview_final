package org.comparable;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

class Student implements Comparable<Integer>{
    String name;
    int age;


    @Override
    public int compareTo(@NotNull Integer o) {
        return 0;
    }
}
public class ComparableDemo {
    public static void main(String[] args) {
        Student student=new Student();
        student.age=20;

        Student student1=new Student();
        student1.age=1;

        List<Student> list=new ArrayList<>();
        list.add(student);
        list.add(student1);


        for(Student student2:list){
            System.out.println(student2.age);
        }
    }

}
