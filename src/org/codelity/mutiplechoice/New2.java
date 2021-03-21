package org.codelity.mutiplechoice;
import java.util.*;
public class New2 {
    public static void main(String[] args) {
        Object i=new ArrayList().iterator();
        System.out.println((i instanceof List)+",");
        System.out.println((i instanceof Iterator)+",");
        System.out.println((i instanceof ListIterator)+",");
    }
}
