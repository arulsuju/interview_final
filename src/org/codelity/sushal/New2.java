package org.codelity.sushal;
public class New2 {
    public void Solution(int n,int[] A){
        int total=0;
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A.length;j++){
                if(j>i && prime(j-i)==true){
                    total=total+(A[j]-A[i]);
                }
            }
        }
        System.out.println(total);
    }
    private boolean prime(int n) {
        if (n <= 1){
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        New2 new2=new New2();
        new2.Solution(7,new int[]{2,4,6,8,10,12,14});
    }
}
