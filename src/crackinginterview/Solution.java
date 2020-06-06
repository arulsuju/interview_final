package crackinginterview;

public class Solution {
    public String solution(int[] a) {
        final int DominoLength = 2;
        int arrayLength = a.length;
        int offset = 0;
        int currentRow = 1;
        boolean result = true;
        while (result) {
            int currentRowLength = currentRow * DominoLength;
            if (offset + currentRowLength >= arrayLength) {
                break;
            }
            result = CheckValuesOnRowAgainstRowBelow(a, offset, currentRowLength);
            offset += currentRowLength;
            currentRow++;
        }
        if(result=true){
            return "YES";
        }
        else{
            return "NO";
        }
    }
        private static boolean CheckValuesOnRowAgainstRowBelow(int[] values, int startOfCurrentRow, int currentRowLength)
        {
            int startOfNextRow = startOfCurrentRow + currentRowLength;
            int comparablePointOnNextRow = startOfNextRow + 1;
            for (int i = 0; i < currentRowLength; i++)
            {
                if (values[startOfCurrentRow + i] != values[comparablePointOnNextRow + i])
                {
                    return false;
                }
            }
            return true;
        }
    public static void main(String[] args) {
        int[] values = new int[] { 4,3,3,4,1,2,2,3,6,5,5,5 };
        Solution s=new Solution();
        System.out.println(s.solution(values));
    }
}
