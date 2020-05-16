package office;
class MyException extends RuntimeException{
    String msg;
    public MyException(String msg) {
        super(msg);

    }
}
public class MyThread {
    public static void main(String[] args) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new MyException("Interrupted Exception");
        }
    }
}

