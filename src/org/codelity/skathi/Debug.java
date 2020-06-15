package org.codelity.skathi;

public class Debug {
    public int solution(int M,int A[]){
        int N = A.length;
        int[] count = new int[M + 1];
        for (int i = 0; i <= M; i++)
            count[i] = 0;
        int maxOccurence = 1;
        int index = 1;
        for (int i = 0; i < N; i++) {
            if (count[A[i]] > 0) {
                int tmp = count[A[i]];
                if (tmp > maxOccurence) {
                    maxOccurence = tmp;
                    index = i;
                }
                count[A[i]] = tmp + 1;
            } else {
                count[A[i]] = 1;
            }
        }
        return A[index];
    }
    public static void main(String[] args) {
        int input[]={1,1,1,2,2,2,2,2,3,3,3,3};
        int M=3;
        Debug d=new Debug();
        System.out.println(d.solution(3,input));
    }
}
