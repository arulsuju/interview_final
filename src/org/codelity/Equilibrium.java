package org.codelity;
import java.util.Arrays;
/*
 * A non-empty zero-indexed matrix A consisting of N rows and M columns of integers is given.
 * A pair(P,Q) is called an equilibrium point of matrix A if following conditions are met:
 * * 0 <= P < N
 * * 0 <= Q < M
 * * the sum of elements in rows above the P-th row is equal to the sum of elements in rows below the P-th row;
 * * the sum of elements in columns to the left of the Q-th column is equal to the sum of elements in columns to the right of the Q-th column.
 *
 * The sum of zero elements is assumed to be 0.
 * This is the case when P=0 or P = N-1 and/or when Q = 0 or Q = M-1.
 *
 * For example, consider matrix A consisting of five rows and three columns, such that:
 * A[0][0] = 2  A[0][1] = 7  A[0][2] = 5
 * A[1][0] = 3  A[1][1] = 1  A[1][2] = 1
 * A[2][0] = 2  A[2][1] = 1  A[2][2] = -7
 * A[3][0] = 0  A[3][1] = 2  A[3][2] = 1
 * A[4][0] = 1  A[4][1] = 6  A[4][2] = 8
 *
 * Pair(1, 1) is an equilibrium point of matrix A, because:
 * * the sum of elements in the 0th row is equal to the sum of elements in the 2nd, 3rd and 4th rows(the sum of both regions is 14)
 * * the sum of elements in the 0th column is equal to the sum of elements in the 2nd column(the sum of both regions is 8).
 *
 * Pair(3, 1) is another equlibrium point of matrix A.
 * This matrix contains no other equilibrium points.
 *
 * return 2
 *
 */
public class Equilibrium {
    public static void main(String[] args) {
        // five rows and three columns
        // 0 <= P < N(30)
        // 0 <= Q < M(30)
        int[][] A = new int[][] {
                //8, 17, 8
                { 2, 7, 5 }, // 14
                { 3, 1, 1 }, // 5
                { 2, 1, -7 },// -4
                { 0, 2, 1 }, // 3
                { 1, 6, 8 } };// 15
        System.out.println(solution(A));

    }
    private static int solution(int[][] A) {

        int[] row = new int[A.length];
        int[] column = new int[A[0].length];
        int equiRow = 0;
        int equiColumn = 0;


        int position = 0;
        int num = 0;
        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < column.length; j++) {
                num += A[i][j];
            }

            row[position++] = num;
            num = 0;
        }

        position = 0;
        for (int i = 0; i < column.length; i++) {
            for (int j = 0; j < row.length; j++) {
                num += A[j][i];
            }
            column[position++] = num;

            num = 0;
        }
        for (int i = 0; i < row.length; i++) {
            int leftsum = 0; // initialize left sum for current index i
            int rightsum = 0; // initialize right sum for current index i
            for (int j = 0; j < i; j++) {
                leftsum += row[j];
            }
            for (int k = i + 1; k < row.length; k++) {
                rightsum += row[k];
            }
            if (leftsum == rightsum) {
                equiRow++;
                //return i;
            }
        }
        for (int i = 0; i < column.length; i++) {
            int leftsum = 0; // initialize left sum for current index i
            int rightsum = 0; // initialize right sum for current index i
            for (int j = 0; j < i; j++) {
                leftsum += column[j];
            }
            for (int k = i + 1; k < column.length; k++) {
                rightsum += column[k];
            }
            if (leftsum == rightsum) {
                equiColumn++;
            }
        }
        return equiRow * equiColumn;
    }

}