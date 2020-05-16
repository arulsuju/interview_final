package org.innerclasses;
class Ex2Outer{
    public void display(){
        System.out.println("Inside outside class Method");
        class Ex2Inner{
            void display(){
                System.out.println("Inner class inside outside class method");
            }
        }
        Ex2Inner ex2Inner=new Ex2Inner();
        ex2Inner.display();
    }
}
public class Example2 {
    public static void main(String[] args) {
        Ex2Outer ex2Outer=new Ex2Outer();
        ex2Outer.display();
    }
}
