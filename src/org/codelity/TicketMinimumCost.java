package org.codelity;
public class TicketMinimumCost {
    public static int solution(int[] A) {
        if(A.length >= 23) {
            return 25;
        } else if(A.length <= 3) {
            return 2 * A.length;
        }
        int ans = Math.min(solve(A, 1, A[0]+6)+7, solve(A, 1, 0)+2);
        return Math.min(ans, 25);
    }
    public static int solve(int[] A, int index, int max) {
        if (index >= A.length) {
            return 0;
        }
        if (A[index] <= max) {
            return solve(A, index + 1, max);
        } else {
            return (Math.min(solve(A, index + 1, A[index] + 6) + 7, solve(A, index + 1, 0) + 2));
        }
    }
    public static void main(String args[]){
        int[] input = {1,2,4,5,7,29,30};
        System.out.println(solution(input));

    }
}