package org.codelity.mcqs;
import java.util.*;

class Solution {
    int solution(int M, int[] A) {
        int N = A.length;
        int[] count = new int[N + 1];
        for (int i = 0; i <= N; i++)
            count[i] = 0;
        int maxOccurence = 1;
        int index = -1;
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
}
public class Debugging {
    public static void main(String[] args) {
        Solution solution=new Solution();
        int[] input={1, 2, 3, 3, 1, 3, 1};
        System.out.println(solution.solution(0,input));
    }
}
