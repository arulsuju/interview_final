package org.java9features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PredicatesSample {
    public static int getMax(List<Integer> list,int maxval){
        return list.stream().filter(i->i<=maxval).max(Comparator.naturalOrder()).get();
    }
    public static void main(String[] args) {
       // int[] input={1,2,3,4};
        List<Integer> list=new ArrayList<>(Arrays.asList(new Integer[]{2,2,6,4}));
        //list.stream().filter(i->i<=4).max(Comparator.naturalOrder()).get();
        try {
            int h1 = getMax(list, 2);
            list.remove(list.indexOf(2));
            //System.out.println(h1);

            int h2 = getMax(list, h1 == 2 ? 3 : 9);
            list.remove(list.indexOf(h2));
            //System.out.println(h2);

            int m1 = getMax(list, 6);
            list.remove(list.indexOf(m1));
           // System.out.println(m1);

            int m2 = getMax(list, 9);
            list.remove(list.indexOf(m2));
            //System.out.println(m2);

            System.out.printf("%d%d:%d%d", h1, h2, m1, m2);
        }
        catch (Exception e){
            System.out.println("NOT POSSIBLE");
        }

    }
}
