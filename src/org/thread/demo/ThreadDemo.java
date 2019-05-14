package org.thread.demo;
class Resource{
    public Resource(){

    }
    public synchronized void printTable(int count){
        try{
            for(int i=1;i<=10;i++){
                Thread.sleep(1000);
                System.out.println(count*i);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
class TwoThread extends Thread{
    Resource resource;
    public TwoThread(Resource resource){
        this.resource=resource;
    }
    public void run(){
        resource.printTable(2);
    }
}
class ThreeThread extends Thread{
    Resource resource;
    public ThreeThread(Resource resource){
        this.resource=resource;
    }
    public void run(){
        resource.printTable(3);
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        Resource r=new Resource();
        TwoThread t2=new TwoThread(r);

        ThreeThread t3=new ThreeThread(r);
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        t3.start();
    }
}
