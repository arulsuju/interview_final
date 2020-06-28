package challenge;

import java.util.ArrayList;
import java.util.List;



class Result3 {
    public static List<String> processStrings(String str1, String str2) {
        StringBuffer out1 = new StringBuffer();
        StringBuffer out2 = new StringBuffer();
        boolean flag = true;
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        for (int i = 0; i < s1.length; i++) {
            for (int j = 0; j < s2.length; j++) {
                if (s1[i] == s2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                out1.append(s1[i]);
            }
            flag = true;
        }
        for (int i = 0; i < s2.length; i++) {
            flag=true;
            for (int j = 0; j < s1.length; j++) {
                if (s2[i] == s1[j]) {
                    //   System.out.println(s2[i] + " " + s1[j]);
                    flag = false;
                    break;
                }
            }
            if (flag) {
                out2.append(s2[i]);
                break;
            }
        }
        List<String> outputfinal=new ArrayList<>();
        outputfinal.add(out1.toString());
        outputfinal.add(out2.toString());
        return outputfinal;
    }

}

public class Solution {
    public static void main(String[] args) {

        System.out.println("TEST CASE : 1  (MNO,MON)");
        System.out.println(Result3.processStrings("MNO", "MON"));
        System.out.println("TEST CASE : 2   (ABC,ABD)");
        System.out.println(Result3.processStrings("ABC", "ABD"));
        System.out.println("TEST CASE : 3   (BANGALORE,BC)");
        System.out.println(Result3.processStrings("BANGALORE", "BC"));
    }

}