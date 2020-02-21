package org.codelity.mutiplechoice;
class A1{
int i;
public void display(){
    System.out.println(i);
}
}
class B1 extends A1{
    int j;
    public void display(){
        System.out.println(j);
    }
}
public class WITO13 {
    public static void main(String[] args) {
        B1 b1=new B1();
        b1.i=1;
        b1.j=2;
        b1.display();
    }
}
//2