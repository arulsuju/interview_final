package org.codelity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Clock {
    public static String solution(int A, int B, int C, int D,int E,int F) {
        List<Integer> values = new ArrayList<>(Arrays.asList(new Integer[]{A, B, C, D,E,F}));
        try {
            int h1 = maxInRange(values, 2);
            System.out.println(h1);
            values.remove(values.indexOf(h1));

            int h2 = maxInRange(values, h1 == 2 ? 3 : 9);
            System.out.println(h2);
            values.remove(values.indexOf(h2));

            int m1 = maxInRange(values, 6);
            System.out.println(m1);
            values.remove(values.indexOf(m1));

            int m2 = maxInRange(values, m1==6?0:9);
            System.out.println(m2);
            values.remove(values.indexOf(m2));

            int s1 = maxInRange(values, 6);
            System.out.println(s1);
            values.remove(values.indexOf(s1));

            int s2 = maxInRange(values, s1==6?0:9);
            System.out.println(s2);
            values.remove(values.indexOf(s2));

            return String.format("%d%d:%d%d:%d%d", h1, h2, m1, m2,s1,s2);
        } catch (Exception e) {
            return "NOT POSSIBLE";
        }
    }

    public static int maxInRange(List<Integer> values, int max) {
        return values.stream().filter(i -> i <= max).max(Comparator.naturalOrder()).get();
    }

    public static void main(String[] args) {
        System.out.println(solution(0,0,0,7,8,9));
    }

}