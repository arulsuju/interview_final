package org.string;

import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {

        StringJoiner stringJoiner=new StringJoiner("$");
        stringJoiner.add("Arulsuju");
        stringJoiner.add("bavya");
        stringJoiner.add("samson");
        System.out.println(stringJoiner.toString());
    }
}
