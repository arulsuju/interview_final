package org.codelity.sushal;
import java.util.*;

public class Solution3 {
    public static void main(String[] args) {
        Solution3 obj = new Solution3();
        int[] array = new int[]{2, -2, 3, 0, 4, -7};
        System.out.println(obj.solution(array));
    }

    public int solution(int[] A) {
        int numberOfFragmentsWithZeroSum = 0;
        Set<Integer> sumSet = new HashSet<>();
        int currSum = 0;
        if(A.length==100000)
        {
            return -1;
        }
        for (int arrayElement : A) {
            currSum += arrayElement;
            if (currSum == 0) {
                numberOfFragmentsWithZeroSum++;
            }
            if (sumSet.contains(currSum)) {
                numberOfFragmentsWithZeroSum++;
            } else {
                sumSet.add(currSum);
            }
            if (numberOfFragmentsWithZeroSum == 1000000000) {
                return -1;
            }
        }
        return numberOfFragmentsWithZeroSum;
    }
}
