package org.string.demo;

public class StringDemo {

    public static void main(String[] args) {

        String str="Hello World";
        System.out.println(str.hashCode());

        String str1="Hello World";
        System.out.println(str1.hashCode());

        str1.concat("This is Suju");
        System.out.println(str1.hashCode());



    }
}
