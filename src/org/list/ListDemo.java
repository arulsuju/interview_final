package org.list;

import java.util.ArrayList;
/*
Exception in thread "main" java.util.ConcurrentModificationException
	at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
	at java.util.ArrayList$Itr.next(ArrayList.java:859)
	at org.list.ListDemo.main(ListDemo.java:15)
 */
public class ListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(7);
        for(Integer i:arrayList){
            if(i%2==0){
                //concurrent Modification Exception
                arrayList.remove(i);
            }
        }
        System.out.println(arrayList);
    }
}
