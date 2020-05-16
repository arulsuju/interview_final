package org.innerclasses;
class Ex1Outer{
    static int x=10;
    int y;
    Ex1Outer(int y){
        this.y=y;
    }
    void display(){
        System.out.println("outer classes");
    }
    class Ex1Inner{
        int z=0;
        /*Inner classes cannot have static methods*/
        //static void display(){
        void display(){
            System.out.println("Inner Classes");
            System.out.println(Ex1Outer.x);
            System.out.println(Ex1Outer.this.y);
            System.out.println(this.z);

        }
    }
}
public class Example1 {
    public static void main(String[] args) {
        Ex1Outer ex1Outer=new Ex1Outer(10);
        ex1Outer.display();
        Ex1Outer.Ex1Inner inner=ex1Outer.new Ex1Inner();
        inner.display();
    }
}
