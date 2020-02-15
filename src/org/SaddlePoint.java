package org;

public class SaddlePoint {
    public int solution(int[][] A){
        int sad_point =0;
        if(A.length <=2 || A[0].length<=2 ) {
            return 0;
        }
        else {
            for(int i= 1;i<A.length-1;i++) {
                for(int j = 1;j<A[0].length-1;j++) {
                    if(A[i][j]<A[i][j-1] && A[i][j]<A[i][j+1] && A[i][j]>A[i-1][j] && A[i][j]>A[i+1][j]) {
                        sad_point++;
                    }
                    else if(A[i][j]>A[i][j-1] && A[i][j]>A[i][j+1] && A[i][j]<A[i-1][j] && A[i][j]<A[i+1][j]) {
                        sad_point++;
                    }
                }
            }
            return sad_point;
        }
    }
    public static void main(String args[]){
        SaddlePoint sp=new SaddlePoint();
        int[][] input={
                {0,1,9,3},{7,5,8,3},{9,2,9,4},{4,6,7,1}
        };
        System.out.println(sp.solution(input));
    }
}
