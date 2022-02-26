package thread;
class SynBase extends Thread{
    private String threadName;
    public SynBase(String threadName){
       this.threadName=threadName;
    }
    @Override
    public void run() {
        try {
            for(int i=0;i<10;i++) {
                Thread.sleep(1000);
                System.out.println(threadName+"is running");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class SynchronizationDemo {
    public static void main(String[] args) {
        SynBase synBase=new SynBase("One"); synBase.start();
        SynBase synBase2=new SynBase("Two"); synBase2.start();

    }
}
