package org.collection.treeset;

import java.util.LinkedHashSet;
import java.util.TreeSet;

class Employee{
    private String name;
    private int age;

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

}
public class TreeSetDemo {
    public static void main(String[] args) {


        //TreeSet sorts the element by Ascending Order
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("z");
        treeSet.add("f");
        treeSet.add("a");
        for(String list:treeSet){
            System.out.println(list);
        }
        //LinkedHashSet Maintains order of Insertion
        LinkedHashSet<Employee> employees=new LinkedHashSet<>();
        employees.add(new Employee("suju",21));
        employees.add(new Employee("arul",22));

        for(Employee employee:employees){
            System.out.println(employee.getName());
            System.out.println(employee.getAge());
        }


    }
}
