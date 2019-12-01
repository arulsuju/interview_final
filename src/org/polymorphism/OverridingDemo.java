package org.polymorphism;

class Base{
    void disp(){
        System.out.println("Base");
    }
}
class Derived extends Base{
    void disp(){
        System.out.println("Derived");
    }
}
public class OverridingDemo {

    public static void main(String[] args) {

        Derived d=new Derived();
        d.disp();

    }
}
