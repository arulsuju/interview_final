package lamda;

@FunctionalInterface
interface FundTransfer{
    abstract void display(int a,int b);
}
public class LamdaDemo  {
    public static void main(String[] args) {
        //With Lamda
        FundTransfer fl=(a,b)->{
            System.out.println(a+b);
        };
        fl.display(10,20);

        //Without Lamda
        FundTransfer fundTransfer;
        fundTransfer = new FundTransfer() {
            @Override
            public void display(int a, int b) {
                System.out.println(a+b);
            }
        };

        fundTransfer.display(100,200);
    }



}
