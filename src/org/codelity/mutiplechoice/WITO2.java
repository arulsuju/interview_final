package org.codelity.mutiplechoice;
class Mammal{
    void eat(Mammal m){
        System.out.println("Mammals eat food");
    }
}
class Cattle extends Mammal{
    void eat(Cattle c){
        System.out.println("Cattle eat hay");
    }
}
class Horse extends Cattle{
    void eat(Horse h){
        System.out.println("Horse eat hay");
    }
}
public class WITO2 {
    public static void main(String[] args) {
        Mammal h=new Horse();
        Cattle c=new Horse();
        c.eat(h);
    }
}
    /*Mammals eat food*/