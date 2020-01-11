package org.codelity;

public class IsPossible {
    public static int gcd(int p,int q){
          return (q==0)?p:gcd(q,p%q);
    }
    public static String solution(int a,int b,int c,int d){
        String res=gcd(a,b)==gcd(c,d)?"Yes":"No";
        return res;
    }
    public static void main(String[] args) {
        System.out.println(solution(1,1,5,2));

    }
}
