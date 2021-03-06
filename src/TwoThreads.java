public class TwoThreads {

    static Thread l,h;
    public static void main(String args[]){
        l=new Thread() {
            public void run() {
                System.out.println("A");
                try {
                    h.sleep(1000);
                } catch (Exception e) {
                    System.out.println("B");
                }
                System.out.println("C");
            }
        };
        h=new Thread() {
            public void run() {
                System.out.println("D");
                try {
                   l.wait();
                } catch (Exception e) {
                    System.out.println("E");
                }
                System.out.println("F");
            }
        };
        l.start();h.start();

    }
}
