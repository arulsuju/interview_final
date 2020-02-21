package org.codelity.mutiplechoice;

public class WITO8 {
    int func(int n){
        int result;
        if(n==1){
            return 1;
        }
        result=func(n-1);
        return result;
    }
    public static void main(String[] args) {
        WITO8 wito8=new WITO8();
        System.out.println(wito8.func(5));

    }
}
//1