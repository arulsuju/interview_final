package org.sumit;

public class StockDay {
    private static int getMaxStock(int[] arr ) {
        int curMin = arr[0];
        int curMax = -1;
        int curProfit = -1;

        for (int i = 0; i < arr.length-1; i++) {
            if (curMin > arr[i]) {
                curMin = arr[i];
            }
            if (arr[i + 1] > curMax) {
                curMax = arr[i + 1];
            }
            int profit = curMax - curMin;
            if (curProfit < profit) {
                curProfit = profit;
            }

        }
        System.out.println(curProfit);
        return curProfit;
    }
    public static void main(String[] args) {
        int[] input={-39957,-17136,35466,21820,-26711};
        System.out.println(getMaxStock(input));

    }
}
