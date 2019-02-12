package org.orf.sample.practise;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
/*
Srilatha/24
Suju/22
Arul/33
Bavya/34
 */

public class ReadFile {

    ArrayList<Student> arrayList=new ArrayList<>();

    public void splitFile(String lineString){
        String[] token=lineString.split("/");
        arrayList.add(new Student (token[0],Integer.parseInt(token[1])));

    }
    public static void main(String[] args) {

        ReadFile readFile=new ReadFile();
        try
        {
            File file=new File("input.txt");
            BufferedReader bufferedReader=new BufferedReader(new FileReader(file));
            String line;
            while((line= bufferedReader.readLine())!=null){
                readFile.splitFile(line);
            }

            System.out.println(readFile.arrayList);

            Collections.sort(readFile.arrayList,new SortByName());
            System.out.println(readFile.arrayList);

            Collections.sort(readFile.arrayList,new SortById());
            System.out.println(readFile.arrayList);

            /*
            Collections.sort(readFile.arrayList,((o1, o2) -> o1.getName().compareTo(o2.getName())));
            System.out.println(readFile.arrayList);
            */

            Collections.sort(readFile.arrayList,Comparator.comparing(Student::getName));
            System.out.println(readFile.arrayList);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        /*
            [Student{name='Srilatha', age=24}, Student{name='Suju', age=22}, Student{name='Arul', age=33}, Student{name='Bavya', age=34}]
            [Student{name='Arul', age=33}, Student{name='Bavya', age=34}, Student{name='Srilatha', age=24}, Student{name='Suju', age=22}]
            [Student{name='Suju', age=22}, Student{name='Srilatha', age=24}, Student{name='Arul', age=33}, Student{name='Bavya', age=34}]
            [Student{name='Arul', age=33}, Student{name='Bavya', age=34}, Student{name='Srilatha', age=24}, Student{name='Suju', age=22}]
         */
    }
}
