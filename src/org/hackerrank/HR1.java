package org.hackerrank;

public class HR1 {
    protected void finalize(){
        System.out.println("coding!");
    }
    public static void main(String[] args) {
        HR1 hr1=new HR1();
        hr1=null;
        System.gc();
    }
}
