package org.sumit;
class TestClassChild extends SumitDemo{
    public String display(String t){
        return "Hello "+t;
    }
}
public class SumitDemo {
    public String display(String t){
        return "Hi "+t;
    }

    public static void main(String[] args) {
        SumitDemo sumitDemo=new TestClassChild();
        System.out.println(sumitDemo.display("Priyanka"));
    }
}
