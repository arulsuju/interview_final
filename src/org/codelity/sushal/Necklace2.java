package org.codelity.sushal;

import java.util.ArrayList;
import java.util.List;

public class Necklace2 {
    public int solution(int[] A) {
        int n = A.length;
       List<Integer> peaks=new ArrayList<Integer>();

        for (int i = 1; i < n - 1; i++) {
            if (A[i - 1] < A[i] && A[i] > A[i + 1]) {
                peaks.add(i);
            }
        }
        int max = 0;

        for (int i = 1; i < n; i++) {
            if ((n % i) == 0) {
                int bi = 0;
                int block = n / i;
                for (int ind :peaks) {
                    int p = ind;
                    if (bi * block <= p && p < (bi + 1) * block) {
                        bi++;
                    }
                }
                if (bi == i) {
                    max = i;
                }
            }
        }
        return max;

    }
    public static void main(String[] args) {
        Necklace2 necklace=new Necklace2();
        //int[] testArray = new int[]{5,4,0,3,1,6,2};
         int[] testArray = new int[]{1,2,3,4,5,6,7};
        System.out.println(necklace.solution(testArray));
    }
}
