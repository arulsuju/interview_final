package org.thread.demo;
class MyThread1 extends Thread{
    public void run(){
        for(int i=1;i<=10;i++){
            try {
                System.out.println("Entering to the thread for"+i+"time");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Got Interrupted");
            }
        }
    }
}
public class InteruptDemo {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        myThread1.start();
        myThread1.interrupt();
        System.out.println("End of Main");
    }
}
