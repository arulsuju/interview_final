package lamda;

@FunctionalInterface
interface FundTransfer{
    abstract void display(int a,int b);
}
public class LamdaDemo  {
    public static void main(String[] args) {
        FundTransfer fl=(a,b)->{
            System.out.println(a+b);
        };
        fl.display(10,20);

    }



}
