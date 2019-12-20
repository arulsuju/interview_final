package org.collection.map;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new TreeMap<>(Collections.reverseOrder());
        map.put("Suju",23);
        map.put("Arul",23);
        map.put("Balu",16);
        map.put("kanja",23);
        for(Map.Entry<String, Integer> list:map.entrySet()){
            System.out.println(list);
        }
        String maxValue=Collections.max(map.entrySet(),
                Map.Entry.comparingByValue()).getKey();
        System.out.println(maxValue);
    }
}
