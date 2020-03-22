package org.codelity;
import java.util.*;

public class PeriodofVelocity {
    public static void main(String[] args) {
        int[] arr = {-1, 1, 3, 3, 3, 2, 3, 2, 1, 0};
        System.out.println(countAllPeriods(arr));
        int[] arr1 = {1,2,3,4,5,6};
        System.out.println(countAllPeriods(arr1));
    }

    private static int countAllPeriods(int[] arr) {
        int[] pre = new int[arr.length];
        for(int i=1;i<arr.length;i++) {
            pre[i] = arr[i] - arr[i-1];
        }
        Set<List<Integer>> res = new HashSet<>();
        int tmp = 0, r = 0;
        for(;r<pre.length-1;r++) {
            tmp = r;
            while(tmp < pre.length-1 && pre[tmp] == pre[tmp+1]) {
                res.add(Arrays.asList(r, tmp+1));
                tmp++;
            }
        }
        return res.size();
    }
}
