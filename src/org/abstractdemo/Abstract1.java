package org.abstractdemo;
abstract class Ab{
    public static final double PI=3.14;
    public Ab(){

    }
    abstract void display();
}
public class Abstract1 extends Ab {
    @Override
    void display() {
        System.out.println("Display things");
    }

    public static void main(String[] args) {
        Ab abstract1=new Abstract1();
        abstract1.display();
    }
}
