package org.generics;
class Gen<T>{
    T obj;
    public Gen(T obj){
        this.obj=obj;
    }
    public void display(){
        System.out.println(obj.getClass().getName());
    }
}
public class GenericDemo {
    public static void main(String[] args) {
        Gen<String> g1=new Gen<>("Suju");
        g1.display();

        Gen<Integer> g2=new Gen<>(10);
        g2.display();
    }
}
