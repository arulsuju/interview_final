package org.java8features;
@FunctionalInterface
interface Interface1{
    void inter1();
    default void dis(){
        System.out.println("dis in interface1");
    }
    static void staticdis(){
        System.out.println("statis in interface1");
    }
}
@FunctionalInterface
interface Interface2{
    void inter2();
    default void dis1(){
        System.out.println("dis in interface1");
    }
    static void staticdis1(){
        System.out.println("statis in interface1");
    }
}
public class FunctionalInterfaceExample implements Interface1,Interface2 {
    public static void main(String[] args) {
        Interface1 interface1=()->{System.out.println("Inter1 in interface1");};
        interface1.inter1();
        Interface2 interface2=()->{System.out.println("Inter2 in interface2");};
        interface2.inter2();
    }

    @Override
    public void inter1() {

    }

    @Override
    public void inter2() {

    }
}
