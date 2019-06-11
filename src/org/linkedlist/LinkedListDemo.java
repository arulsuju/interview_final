package org.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);

        for(Integer i:list){
            System.out.println(i);
        }

        System.out.println(((LinkedList<Integer>) list).getFirst());
        System.out.println(((LinkedList<Integer>) list).getLast());
    }
}
