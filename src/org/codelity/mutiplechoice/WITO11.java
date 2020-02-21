package org.codelity.mutiplechoice;
interface A{
    public void method1();
}
class One implements A{
    @Override
    public void method1() {
        System.out.println("class 1 methods");
    }
}
class Two extends One{
    public void method1() {
        System.out.println("class 2 methods");
    }
}
public class WITO11 {
    public static void main(String[] args) {
        A a=new Two();
        a.method1();
    }
}
/*
class 2 methods*/
