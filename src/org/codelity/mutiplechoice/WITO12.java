package org.codelity.mutiplechoice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class WITO12 {
    public static void main(String[] args) {
        List str=new ArrayList();
        str.add("1");
        str.add("2");
        str.add("3");
        Iterator iterator=str.iterator();
        while (iterator.hasNext()){
           str.add("4");
        }
        System.out.println(str.size());
    }
}
    /*Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
        at java.util.Arrays.copyOf(Arrays.java:3210)
        at java.util.Arrays.copyOf(Arrays.java:3181)
        at java.util.ArrayList.grow(ArrayList.java:265)
        at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
        at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
        at java.util.ArrayList.add(ArrayList.java:462)
*/
