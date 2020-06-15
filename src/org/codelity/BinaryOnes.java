package org.codelity;

public class BinaryOnes {
        int solution(int[] A) {
            int n = A.length;
            int i = n -1;
            int result = 0;
            int k = 0, maximal = 0;
            while (i > 0) {
                if (A[i] == 1) {
                    k = k + 1;
                    if (k >= maximal) {
                        maximal = k;
                        result = i;
                    }
                }
                else
                    k = 0;
                i = i - 1;
            }
            if (A[i] == 1 && k + 1 > maximal)
                result = 0;
            return result;
        }

    public static void main(String[] args) {
        BinaryOnes binaryOnes=new BinaryOnes();
        int A[]=new int[10];
        A[0] = 0;
        A[1] = 1;
        A[2] = 1;
        A[3] = 1;
        A[4] = 0;
        A[5] = 1;
        A[6] = 1;
        A[7] = 1;
        A[8] = 0;
        A[9] = 1;
        System.out.println(binaryOnes.solution(A));
    }
}
