package org.codelity;
import java.util.*;

public class BOXPattern {
    public static void solution(int[] A, int K) {
        int[] input = new int[A.length];
        int count = input.length;
        int limit = K;
        for(int i=0;i<A.length;i++){
            input[i] = A[i];
        }
        Arrays.sort(A);
        int padding = String.valueOf(A[A.length-1]).length();

        String boxLine = formBoxLines(
                (limit<count)?limit:count, padding);
        StringBuilder pattern = new StringBuilder();
        pattern.append(boxLine+"\n");
        int m = 0;
        int number;
        for(int k=0; k<count;k++) {
            pattern.append("|");
            number = input[k];
            int length = String.valueOf(number).length();
            for(int l=0;l<(padding-length);l++) {pattern.append(" ");}
            pattern.append(number);
            m++;
            if(m==limit) {
                m = 0;
                pattern.append("|\n"+boxLine);
                if(k+1<count)
                    pattern.append("\n");
            }
        }
        if(m!=0)
            pattern.append("|\n"+formBoxLines(
                    (count%limit), padding));
        System.out.println(pattern.toString());
    }

    public static String formBoxLines(int NoTimes, int padding) {
        StringBuilder line = new StringBuilder();
        line.append("+");
        String dash = "";
        for(int i=0;i<padding;i++) {
            dash += "-";
        }
        dash+="+";
        for(int i=0;i<NoTimes;i++) {
            line.append(dash);
        }
        return line.toString();
    }
    public static void main(String[] args) {
        int[] input={1,2,3,5,4,5,6,7,8,9,0,0,3,3,3,3,4,8};
        solution(input,5);
    }
}
