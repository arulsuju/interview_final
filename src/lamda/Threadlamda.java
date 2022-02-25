package lamda;

public class Threadlamda {
    static Thread t;
    public static void main(String[] args) {
        t=new Thread() {
            public void run() {
                System.out.println("A");
                try {
                    t.sleep(1000);
                } catch (Exception e) {
                    System.out.println("B");
                }
                System.out.println("C");
            }
        };
    }
}
