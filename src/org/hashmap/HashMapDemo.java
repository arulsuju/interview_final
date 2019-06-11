package org.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<String,Integer> map=new HashMap<>();
        map.put("a",1);
        map.put("b",2);
        map.put("a",3);
        map.put("a",1);
        map.put(null,4);
        for(Map.Entry<String,Integer> m:map.entrySet()){
            System.out.println(m.getKey()+"--->"+m.getValue());

        }

    }
}
