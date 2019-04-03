package org.collections.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        //LinkedHasMap maintains order of the insertion
        /*
        Hello1
        Hello22
        World3
         */
        LinkedHashMap<String,Integer> linkedHashMap=new LinkedHashMap<>();
        linkedHashMap.put("Hello",1);
        linkedHashMap.put("Hello2",2);
        linkedHashMap.put("World",3);

        for(Map.Entry<String,Integer> entry:linkedHashMap.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }

        //HashMap doesn't maintains order of the insertion
        /*
        Hello1
        World3
        Hello22

         */
        HashMap<String,Integer> hashMap=new HashMap<>();
        hashMap.put("Hello",1);
        hashMap.put("Hello2",2);
        hashMap.put("World",3);
        for(Map.Entry<String,Integer> entry:hashMap.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}
