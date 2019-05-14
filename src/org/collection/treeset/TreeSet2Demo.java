package org.collection.treeset;

import java.util.Comparator;
import java.util.TreeSet;

class Programmer implements Comparable<Programmer> {

    private String name;
    private int age;

    public Programmer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Programmer o) {
        return this.age-o.age;
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

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TreeSet2Demo {
    public static void main(String[] args) {
        TreeSet<Programmer> treeSet=new TreeSet<>();
        treeSet.add(new Programmer("suju",31));
        treeSet.add(new Programmer("arul",33));
        for(Programmer p:treeSet){
            System.out.println(p.getAge()+""+p.getName()+""+p.hashCode());
        }

    }
}
