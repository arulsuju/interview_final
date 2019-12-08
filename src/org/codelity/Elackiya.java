package org.codelity;

import java.util.Arrays;
/*
Given six digit , find the earliest valid time that can be displayed
in the digital clock
 */
public class Elackiya {
    public static String solution(int A,int B,int C,int D,int E,int F){
        int[] ar = {A,B,C,D,E,F};
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
        System.out.println(solution(0,0,0,7,8,9));
    }
}
