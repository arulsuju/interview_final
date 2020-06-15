package org.codelity.skathi;
class Chicks{
    synchronized void yack(long id){
        for(int x=1;x<3;x++){
            System.out.println(id+"");
            Thread.yield();
        }
    }
}
public class ChicksYacks implements Runnable {
    Chicks c;
    public static void main(String[] args) {
        new ChicksYacks().go();
    }
    void go(){
        c=new Chicks();
        new Thread(new ChicksYacks()).start();
        new Thread(new ChicksYacks()).start();

    }

    @Override
    public void run() {
    c.yack(Thread.currentThread().getId());
    }
}
