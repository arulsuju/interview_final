public class ReflectionClass {

    private String name;

    public ReflectionClass() {
    }

    public ReflectionClass(String name) {
        this.name = name;
    }

    private void display(){
        System.out.println("This is Display Method"+name);
    }
}
