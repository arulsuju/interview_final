package org.codelity.mutiplechoice;
abstract class C1{
    public C1(){
        System.out.println("1");
    }
}
class C2 extends C1{
    public C2(){
        System.out.println("2");
    }
}
class C3 extends C2{
    public C3(){
        System.out.println("3");
    }
}
public class WITO3 {
    public static void main(String[] args) {
        new C3();
    }
}
/*
123*/
