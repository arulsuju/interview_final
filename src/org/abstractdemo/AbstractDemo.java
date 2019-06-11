package org.abstractdemo;
abstract class Student{
    //concrete method
    int a;
    void disp(){
        System.out.println("Implemented");
    }

    //abstract method
    abstract void logic1();
    abstract void logic2();

    public Student(){
        this.a=a;
    }
}
public class AbstractDemo extends Student {


    @Override
    void logic1() {
        System.out.println("Logic1 implementation");
    }

    @Override
    void logic2() {
        System.out.println("Logic2 Implementation");

    }
    public static void main(String[] args) {
            Student s=new AbstractDemo();
            s.logic1();
            s.logic2();

    }


}
