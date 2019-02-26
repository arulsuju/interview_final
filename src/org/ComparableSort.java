package org;

import java.util.ArrayList;
import java.util.Collections;

class Teacher implements Comparable<Teacher>{
    private String name;
    private int age;
    private String sex;

    public Teacher(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public int compareTo(Teacher o) {
        return this.age-o.age;
    }
}
public class ComparableSort {
    public static void main(String[] args) {
        ArrayList<Teacher> list=new ArrayList<>();
        list.add(new Teacher("suju",21,"male"));
        list.add(new Teacher("arul",22,"female"));
        list.add(new Teacher("samson",15,"male"));
        Collections.sort(list);
        System.out.println(list);
        for(Teacher t:list){
            System.out.println(t.getAge()+"-->"+t.getName()+"-->"+t.getSex());
        }
    }
}
