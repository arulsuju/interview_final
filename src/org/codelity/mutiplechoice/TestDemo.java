package org.codelity.mutiplechoice;
import java.util.Arrays;
import java.util.Scanner;
public class TestDemo {
	public static void solution(int[] ar,int k) {
        String[] ar1 = new String[ar.length];
        for (int i = 0; i < ar.length; i++) {
            ar1[i] = String.valueOf(ar[i]);
        }
        Arrays.sort(ar);
        String s = String.valueOf(ar[ar.length - 1]);
        //System.out.println(s);
        int length_max = s.length();
        String s1 = "+";
        String s2 = "";
        for (int i = 0; i < s.length(); i++) {
        	
            s2 = s2 + "-";
        }
        String fin = "";
        for (int i = 0; i < k; i++) {
            fin = fin + s1 + s2;
        }
        fin = fin + s1;
        System.out.println(fin);
        String pattern = "";
        int count = 0;
        for (int i = 0; i <= (ar.length - 1) / k; i++) {
            for (int j = k * count; j < k * (count + 1); j++) {
                if (j >= ar.length) {
                    pattern = pattern + "|";
                    for (int x1 = 0; x1 < length_max; x1++) {
                        pattern = pattern + " ";
                    }
                    break;
                }
               pattern = pattern + "|";
                for (int x = 0; x < length_max - ar1[j].length(); x++) {
                    pattern = pattern + " ";
                }
                pattern = pattern + ar1[j];
            }
            count++;
            pattern = pattern + "|";
            System.out.println(pattern);
            System.out.println(fin);
            pattern = "";
        }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] input={4,35,80,123,1234,44,8,5,24,3};
            solution(input,4);
        }

}
