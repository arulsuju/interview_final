package org.codelity.mutiplechoice;
class WITO7Base{
    void method(){
        System.out.println("Base class");
    }
}
public class WITO7 extends WITO7Base {
    @Override
    void method() {
        System.out.println("A");
    }
    /*int method(int i){
        return i;//B
    }*/
    void method(int i){
        System.out.println("C");
    }
    /*private void method(){
        //D
    }*/
    public static void main(String[] args) {

    }
}
//AC