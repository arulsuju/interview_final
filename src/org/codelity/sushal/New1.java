package org.codelity.sushal;


public class New1 {
    public void Solution(String S,String T){
      int resS=process(S);
      int resT=process(T);
        if(resS==resT){
            System.out.println("CHOSEN");
        }
        else
        {
            System.out.println("NOT CHOSEN");
        }
    }
    public static int process(String input){
        String str = input;
        char[] ch  = str.toCharArray();
        int prod=1;
        for(char c : ch){
            int temp = (int)c;
            int temp_integer = 64;
            if(temp<=90 & temp>=65)
                prod=prod*(temp-temp_integer);
        }
        return prod%47;
    }
    public static void main(String[] args) {

        New1 new1=new New1();
        new1.Solution("COMETQ","HVNGAT");
    }
}
