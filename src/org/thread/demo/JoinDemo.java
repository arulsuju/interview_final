package org.thread.demo;
class MyThread extends Thread{
    static int sum;
    int n;
    public MyThread(int n){
        this.n=n;
    }
    public void run(){
        Thread thread=Thread.currentThread();
        thread.setName("ArulSuju");
        System.out.println(thread.getName());
        for(int i=1;i<=n;i++){
            try {
                Thread.sleep(1000);
                Thread.yield();
                /*
                * yield allow other thread to execute first and
                *  it will execute this thread after that
                 */
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
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
        long start=System.currentTimeMillis();
        System.out.println(start);
        myThread.start();
        myThread.join();
        /*
        * Yield method allows the myThread to execute first and after
        * the thread dies it will execute other threads
         */
        long end=System.currentTimeMillis();
        System.out.println(end);
        long completionTime=(end-start)/1000;
        System.out.println("The sum is"+MyThread.sum);
        System.out.println("Completion Time"+completionTime);

    }
}
