package constructor;
class Base{
    public Base(){
        System.out.println("Base class constructor");
    }

}
class Derived extends Base{
    public Derived(){
        super();
    }

}
public class ConTest {
    public static void main(String[] args) {
        Derived d=new Derived();

    }
}
