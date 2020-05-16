package org.thread.demo;

import java.util.concurrent.*;

class CallableClass implements Callable<Integer>{
    int number;
    public CallableClass(int number){
        this.number=number;
    }
    @Override
    public Integer call() throws Exception {
        int sum=0;
        for(int i=1;i<number;i++){
            sum+=i;
        }
        return sum;
    }
}
public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableClass[] cc={
          new CallableClass(10),
          new CallableClass(20),
          new CallableClass(30),
          new CallableClass(40)
        };
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for(CallableClass callableClass:cc){
            Future<Integer> submit = executorService.submit(callableClass);
            System.out.println(submit.get());
        }

    }
}
