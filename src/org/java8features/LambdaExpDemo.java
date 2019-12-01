package org.java8features;
interface MyInterface
{
    public void display(String name);
    //public void display();
    //public int add(int a,int b);
}
interface MyInterface1
{
    public int add(int a,int b);
}
public class LambdaExpDemo {
    public static void main(String[] args) {
        Runnable runnable=()->System.out.println("Hello");
        Thread thread=new Thread(runnable);
        thread.start();

        MyInterface myInterface=(name)->{System.out.println("Hello Display");};
        myInterface.display("Arulsuju");

        MyInterface1 myInterface1=(a,b)->{int c=a+b;return c;};
        System.out.println(myInterface1.add(10,20));


    }
}
