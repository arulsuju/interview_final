package org.java8features;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String[] args)throws Exception {

        File file=new File("ArrayListDemo.java");
        FileInputStream fis=new FileInputStream(file);
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(fis));
        while(bufferedReader.readLine()!=null){
            System.out.println(bufferedReader.readLine());
        }
    }
}
