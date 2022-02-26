package thread;
class Thread1 extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Running "+Thread.currentThread().getName());
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {

        Thread1 t1=new Thread1();
        System.out.println(t1.getState());
        t1.setName("Arul");
        t1.start();
        t1.join();
        System.out.println(t1.getState());

        for (int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+" is Running");
        }

    }
}
