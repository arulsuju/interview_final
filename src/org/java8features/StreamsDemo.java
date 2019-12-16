package org.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    String name;

    public Employee(String name, int age) {
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

    int age;
}

public class StreamsDemo {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(210);
        list.add(60);
        list.add(40);
        list.add(70);
        list.add(30);
        //sorted
        //int[] alist=list.stream().sorted().mapToInt(Integer::intValue).toArray();
        int[] alist=list.stream().mapToInt(Integer::intValue).toArray();
        list.stream().sorted().forEach(System.out::println);
       /* for(int i=0;i<alist.length;i++){
            System.out.println(alist[i]);
        }*/

        //Employee
        Employee employee=new Employee("suju",34);
        Employee employee2=new Employee("arul",3);
        Employee employee3=new Employee("balu",24);
        Employee employee4=new Employee("christy",30);

        List<Employee> list1=new ArrayList<>();
        list1.add(employee);
        list1.add(employee2);
        list1.add(employee3);
        list1.add(employee4);

        List<Employee> res=list1
                 .stream()
                 .sorted(Comparator.comparing(Employee::getName)
                                   .thenComparing(Employee::getAge)
                                   .reversed())
                 .collect(Collectors.toList());
        for(Employee e:res){
            System.out.println(e.getName()+""+e.getAge());
        }
        /*
        arul3
        balu24
        christy30
        suju34
         */
    }
}
