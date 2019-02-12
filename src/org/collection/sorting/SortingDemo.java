package org.collection.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingDemo {

    public static void main(String[] args) {

        ArrayList<Employee> arrayList=new ArrayList<>();
        Employee employee=new Employee();
        employee.setName("suju");
        employee.setAge(32);
        employee.setDept("cse");

        Employee employee1=new Employee();
        employee1.setName("arul");
        employee1.setDept("mech");
        employee1.setAge(23);

        arrayList.add(employee);
        arrayList.add(employee1);
        System.out.println("Original ArrayList");
        System.out.println(arrayList);
        Collections.sort(arrayList,new SortByName());
        System.out.println("Sorted By Name");
        System.out.println(arrayList);

        Collections.sort(arrayList,new SortByAge());
        System.out.println("Sorted By Id");
        System.out.println(arrayList);


        Collections.sort(arrayList,Comparator.comparing(Employee::getDept).thenComparing(Employee::getAge));
        System.out.println("Sorted By Dept and Age");
        System.out.println(arrayList);

        Collections.sort(arrayList,(Employee o1, Employee o2)->o1.name.compareTo(o2.name));
        System.out.println(arrayList);

    }
}
