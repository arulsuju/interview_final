package org.codelity.latest;

class A{
    public void method1(){
        System.out.println("Class A method1");
    }
}

class B extends A{
    public void method2(){
        System.out.println("Class B method2");
    }
}

class C extends B{
    public void method2(){
        System.out.println("Class c method2");
    }
    public void method3(){
        System.out.println("Class c method3");
    }
}

public class Two {
    public static void main(String[] args) {
        A a=new A();
        C c =new C();
        c.method2();
        a=c;
        //a.method3();
    }
}
