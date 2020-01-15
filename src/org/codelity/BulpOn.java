package org.codelity;
import java.util.*;
/******************************************************************************



 There are N bulbs, numbered from 1 to N, arranged in a row. Initially, all the bulbs are turned off. At moment K (for K from 0 to N - 1), we turn on the A[K]-th bulb. A bulb shines if it is on and all the previous bulbs are turned on too.



 Return the number of moments for which every turned on bulb shines.



 Example 1:



 e.g. A = [2,1,3,5,4]

 There are three moments (1st, 2nd and 4th) when every turned on bulb shines.

 Example 2:



 e.g. A = [2,3,4,1,5]

 There are two moments (3rd and 4th) when every turned on bulb shines.

 Example 3:



 e.g. A = [5,4,3,2,1]

 There is one moment (4th) when every turned on bulb shines.

 N is an integer within the range [1..100,000]

 the elements of A are all distinct

 each element of array A is an integer within the range [1..N]



 *******************************************************************************/
public class BulpOn {
    private static int getNumOfMoments(int[] nums) {

        int[] preSumNums = new int[nums.length + 1];
        int[] preSumNumsSorted = new int[nums.length + 1];
        int[] numsSorted = new int[nums.length];
        for(int i=0;i<nums.length;i++)
            numsSorted[i] = nums[i];
        Arrays.sort(numsSorted);
        int res = 0;
        for(int i=0;i<nums.length;i++) {
            preSumNums[i+1] = preSumNums[i] + nums[i];
            preSumNumsSorted[i+1] = preSumNumsSorted[i] + numsSorted[i];
            if(preSumNums[i+1] == preSumNumsSorted[i+1])
                res++;
        }
        return res;
    }

    public static void main(String[] args) {

        int input[]={1,3,4,2,5};
        System.out.println(getNumOfMoments(input));
    }
}
