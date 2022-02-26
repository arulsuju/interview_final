package lamda;

@FunctionalInterface
interface MethodReferenceInterface{
    public void add(int a,int b);
}
class MethodReferenceClass{
    public static void addition(int a,int b){
        System.out.println(a+b);
    }
}
public class MethodReferenceExample {
    public static void main(String[] args) {
        MethodReferenceInterface methodReferenceInterface=MethodReferenceClass::addition;
        methodReferenceInterface.add(10,20);
    }


}
