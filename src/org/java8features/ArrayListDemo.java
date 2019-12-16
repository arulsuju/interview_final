package org.java8features;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        //need to convert to array
        int[] list1=new int[list.size()];
        for(int i=0;i<list1.length;i++){
            list1[i]=list.get(i);
        }

    }
}
