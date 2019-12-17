package org.collection;

import java.util.ArrayList;
import java.util.List;

public class ListofList {
    public static void main(String[] args) {
        List<List<Integer>> lists=new ArrayList<>();
        List<Integer> rows1=new ArrayList<>();
        rows1.add(1);
        rows1.add(2);
        rows1.add(30);

        List<Integer> rows2=new ArrayList<>();
        rows2.add(4);
        rows2.add(5);
        rows2.add(6);

        List<Integer> rows3=new ArrayList<>();
        rows3.add(7);
        rows3.add(8);
        rows3.add(9);

        lists.add(rows1);
        lists.add(rows2);
        lists.add(rows3);
        //adding both diagonals
        int d1=0;int d2=0;
        for(int i=0;i<lists.size();i++) {
            //for(int j=0;j<lists.get(i).size();j++){
            //System.out.print(" "+lists.get(i).get(i));
            d1 = d1 + lists.get(i).get(i);

            //System.out.println(" "+lists.get(i).get(lists.size()-i-1));
            d2 = d2 + lists.get(i).get(lists.size() - i - 1);
            //}
        }
            System.out.println(d1+"---"+d2);
        System.out.println(Math.abs(d1-d2));

    }

}
