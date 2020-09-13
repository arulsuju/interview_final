package org.codelity.latest;

class Base{
    int value=0;
    Base(){
        addValue();
    }
    void addValue(){
        value+=10;
    }
    int getValue(){
        return value;
    }
}

class Derived extends Base{
    Derived(){
        addValue();
    }

    @Override
    void addValue() {
        value+=20;
    }
}

public class Three {
    public static void main(String[] args) {
        Base b=new Derived();
        System.out.println(b.getValue());
    }
}
