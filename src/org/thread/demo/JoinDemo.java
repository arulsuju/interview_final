package org.thread.demo;
class MyThread extends Thread{
    static int sum;
    int n;
    public MyThread(int n){
        this.n=n;
    }
    public void run(){
        for(int i=1;i<=n;i++){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            sum+=i;
            System.out.println("Calculating sum for"+i);
        }
    }
}
public class JoinDemo {
    public static void main(String[] args) throws InterruptedException {

        MyThread myThread=new MyThread(10);
        myThread.start();
        myThread.join();
        System.out.println("The sum is"+MyThread.sum);

    }
}
