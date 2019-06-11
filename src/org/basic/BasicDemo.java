package org.basic;

public class BasicDemo {

    public static void main(String[] args) {
        String s1="shimona";
        //String pool
        System.out.println(s1.hashCode());
        String s2=new String("shimona");
        //Heap Memory
        System.out.println(s2.hashCode());

        if(s1.equals(s2)){
            System.out.println("Equal");
        }
    }
}
