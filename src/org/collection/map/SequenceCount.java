package org.collection.map;

import java.util.*;

public class SequenceCount {
    public static void Solution(String input){
        char[] inp=input.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:inp){
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }
            else{
                map.put(c,1);
            }
        }
        System.out.println(map);
        List<Integer> val=new ArrayList<>(map.values());
        Collections.sort(val);
        System.out.println(val.get(val.size()-1));


    }
    public static void main(String[] args) {
        Solution("Arulsuju");
        Solution("Aadhaar");


    }
}
