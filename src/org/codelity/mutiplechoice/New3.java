package org.codelity.mutiplechoice;

import java.util.Iterator;
import java.util.TreeSet;

public class New3 {
    public static void main(String[] args) {
        TreeSet map=new TreeSet();
        map.add("one");
        map.add("two");
        map.add("three");
        map.add("four");
        map.add("one");
        Iterator iterator= map.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next()+"");
        }
    }
}
