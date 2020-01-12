package org.codelity;

import java.util.Arrays;
/*
Java Problem:

Given four digits, find the maximum valid time that can be displayed on a digital clock (in 24-hour format) using those digits.

For example, given digits 1,8,3,2 the maximum valid time is "23:18". Note that "28:31" is not a valid time.

Write a function: string MaxTime(int A, int B, int C, int D); that, given four integers A,B,C,D, returns the maximum valid time in string format "HH:MM" or "NOT POSSIBLE" if it is not possible to display a valid time.

Examples: given 1,8,3,2, the function MaxTime shoud return "23:18". Given 2,4,0,0 the funtion should return "20:40". Given 3,0,7,0 the function should return "07:30" Given 9,1,9,7 the function should return "NOT POSSIBLE".

Since there is no possible valid time. Assume that: A,B,C,D are integers with in the range [0..9]
Given six digit , find the earliest valid time that can be displayed
in the digital clock
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Clock {
    public String solution(int A, int B, int C, int D) {
        List<Integer> values = new ArrayList<>(Arrays.asList(new Integer[]{A, B, C, D}));
        try {
            int h1 = maxInRange(values, 2);
            values.remove(values.indexOf(h1));

            int h2 = maxInRange(values, h1 == 2 ? 3 : 9);
            values.remove(values.indexOf(h2));

            int m1 = maxInRange(values, 6);
            values.remove(values.indexOf(m1));

            int m2 = maxInRange(values, 9);
            values.remove(values.indexOf(m2));

            return String.format("%d%d:%d%d", h1, h2, m1, m2);
        } catch (Exception e) {
            return "NOT POSSIBLE";
        }
    }

    public int maxInRange(List<Integer> values, int max) {
        return values.stream().filter(i -> i <= max).max(Comparator.naturalOrder()).get();
    }
}
 */
public class Elackiya {
    public static String solution(int A,int B,int C,int D,int E,int F){
        int[] ar = {A,B,C,D,E,F};
        /*
        ar[0]=1;
        ar[1]=2;
        ar[2]=3;
        ar[3]=4;
        ar[4]=5;
        ar[5]=6;
        */
        Arrays.sort(ar);
        String hh;
        String mm;
        String ss;
        if (ar[4] >= 6 && ar[5] >= 6 && ar[2] < 6 && ar[3] < 6) {
            hh = String.valueOf(ar[0] * 10 + ar[1]);
            mm = String.valueOf(ar[2] * 10 + ar[4]);
            ss = String.valueOf(ar[3] * 10 + ar[5]);
        }
        else if(ar[5]>=6 && ar[4]>=6 && ar[3]>=6 && ar[0]<=2 && ar[1]<6 && ar[2]<6 ) {
            hh = String.valueOf(ar[0] * 10 + ar[3]);
            mm = String.valueOf(ar[1] * 10 + ar[4]);
            ss = String.valueOf(ar[2] * 10 + ar[5]);
        }
        else {
            hh = String.valueOf(ar[0] * 10 + ar[1]);
            mm = String.valueOf(ar[2] * 10 + ar[3]);
            ss = String.valueOf(ar[4] * 10 + ar[5]);
        }

        if (Integer.parseInt(hh) > 23 || Integer.parseInt(mm) > 59 || Integer.parseInt(ss) > 59) {
            //System.out.println("Not Valid");
            return "NOT POSSIBLE";
        } else {
            if(hh.length()==1) {
                hh = "0"+hh;
            }
            if(mm.length()==1) {
                mm = "0"+mm;
            }
            if(ss.length()==1) {
                ss = "0"+ss;
            }
            //System.out.println(hh + ":" + mm + ":" + ss);
            return hh + ":" + mm + ":" + ss;
        }
    }
    public static void main(String[] args) {
        System.out.println(solution(1,2,3,4,5,6));
    }
}
