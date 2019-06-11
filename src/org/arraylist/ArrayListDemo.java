package org.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) {
//dynamic array
        List<Integer> no=new ArrayList<>();
        no.add(10);
        no.add(20);
        for(Integer i:no){
            System.out.println(i);
        }

    }
}
