package org.string.demo;

public class StringDemo extends Object {

    public static void main(String[] args) {

        String str="Hello World";
        System.out.println(str.hashCode());

        String str1="Hello World";
        System.out.println(str1.hashCode());

        //str1.substring(1);
        String answer[]=str1.split(" ");
        System.out.println(str1.substring(1).hashCode());
        System.out.println(answer.hashCode());
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }
    }
}
