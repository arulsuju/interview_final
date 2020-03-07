package org.collection.map;

import java.util.*;
import java.util.stream.Collectors;

public class TreeMap2 {
    public static void main(String[] args) {
        int[] input={10,20,30,40,50};
        List<Integer> list=new ArrayList<>();
        list=Arrays.stream(input).boxed().collect(Collectors.toList());
        System.out.println(list.subList(0,2));
        System.out.println(list.subList(2,4));
        System.out.println(list.subList(4,5));
        System.out.println(Collections.max(list)-Collections.min(list));

        Map<Integer,String> integerMap=new TreeMap<>(Collections.reverseOrder());
        integerMap.put(10,"Arul");
        integerMap.put(20,"Suju");
        integerMap.put(2,"Suju1");
        integerMap.put(3,"Suju2");
        integerMap.put(4,"Suju34");
        System.out.println(((TreeMap<Integer, String>) integerMap).lastEntry().getValue());


    }
}
