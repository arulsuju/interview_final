package org.map;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapDemo {
    public static void main(String[] args) {
        NavigableMap<String,Integer> map=new TreeMap<>();
        map.put("A",4);
        map.put("B",3);
        map.put("C",5);
        map.put("D",2);
        map.put("E",1);
        System.out.println(map.ceilingKey("A"));
        System.out.println(map.higherKey("A"));
        System.out.println(map.lowerKey("A"));
        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());



    }
}
