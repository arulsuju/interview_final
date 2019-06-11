package org.abstractdemo;

interface Employee{
    void d();
    void d2();
}
public class InterfaceDemo implements Employee {

    public static void main(String[] args) {
        Employee e=new InterfaceDemo();
        e.d();
        e.d2();
    }

    @Override
    public void d() {
        System.out.println("Impl");
    }

    @Override
    public void d2() {
        System.out.println("imple");
    }
}
