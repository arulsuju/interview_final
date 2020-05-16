package org.thread.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

class SujuThread implements Runnable{
    String name;
    public SujuThread(String name){
        this.name=name;
    }
    @Override
    public synchronized void run() {
        for(int i=1;i<10;i++){
            System.out.println("Executing Thread"+Thread.currentThread().getName());
        }
    }
}
public class ExecutorsDemo {

    public static void main(String[] args) {
        SujuThread[] sujuThreads={
          new SujuThread("ATM"),
          new SujuThread("BANK"),
          new SujuThread("Web"),
          new SujuThread("Cash")
        };
        /*
        * newFixedThreadPool
         */
        ExecutorService executorService = Executors.newFixedThreadPool(sujuThreads.length);
        for(SujuThread s:sujuThreads){
            executorService.submit(s);
        }
        executorService.shutdown();
        /*
        newSingleThreadExecutor();
         */
        ExecutorService executorService1 = Executors.newSingleThreadExecutor();
        for(SujuThread s:sujuThreads){
            executorService1.submit(s);
        }
        executorService1.shutdown();
        /*Executors.newCachedThreadPool();*/
        ExecutorService executorService2 = Executors.newCachedThreadPool();
        for(SujuThread s:sujuThreads){
            executorService2.submit(s);
        }
        executorService2.shutdown();
        /*newScheduledThreadPool(*/
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        for(SujuThread s:sujuThreads){
            scheduledExecutorService.submit(s);
        }
        scheduledExecutorService.shutdown();
    }
}
