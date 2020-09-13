package org.codelity.latest;

public class Four {
    private Four(int w){
        System.out.println(w);
    }


    public static void main(String[] args) {
        Four o=new Four(50);
    }
}
