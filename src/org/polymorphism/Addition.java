package org.polymorphism;

public class Addition {
    public void add(int a,int b){
        System.out.println("2 parameter");
    }
    public void add(int a,int b,int c){
        System.out.println("3 parameter");
    }
    public void add(int...args){
        System.out.println("Any Arguement");
    }

    public static void main(String[] args) {
        Addition a=new Addition();
        a.add(1,2,3,4,5,6,7);
        a.add(1,2);
        a.add(1,2,3);
    }
}
