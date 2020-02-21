package org.codelity.mutiplechoice;

public class WITO4 {
    public static void main(String[] args) {
        try{
            int a=10/0;
        }
        catch (Exception e){
            System.out.println(e);
        }
       /*catch (ArithmeticException ae){
            System.out.println(ae);
        }*/
        System.out.println("Finished");
    }
}
/*
Compilation Error*/
