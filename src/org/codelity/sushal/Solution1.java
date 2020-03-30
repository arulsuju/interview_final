package org.codelity.sushal;

public class Solution1 {
    public int solution(int A, int B){
        int result = 0;
        int count = 0;
        for(int i=1;i<=B;i++){
            result = i*(i+1);
            if(result >= A && result <= B){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Solution1 solution1=new Solution1();
        System.out.println(solution1.solution(6,20));
    }
}
