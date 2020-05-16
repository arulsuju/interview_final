package org.thread.demo;
class Number extends Thread{
    String number;
    public Number(String number){
        this.number=number;
    }
    public synchronized void run(){
        for(int i=1;i<=10;i++){
            if(number.equals("odd")){
                try {
                    Thread.sleep(1000);
                    System.out.println("Odd is"+i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
            if(number.equals("even")){
                if(i%2==0){
                    try {
                        Thread.sleep(1000);
                        System.out.println("Even is"+i);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}

public class ThreadAssignment {
    public static void main(String[] args) throws InterruptedException {
        Number odd=new Number("odd");
        Number even=new Number("even");
        odd.start();
        even.start();

    }
}
