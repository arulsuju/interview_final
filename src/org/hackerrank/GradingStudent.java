package org.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result1 {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        List<Integer> result=new ArrayList<>();
        int[] input=new int[grades.size()];
        for(int i=0;i<grades.size();i++){
            input[i]=grades.get(i);
        }
        int rem=0;
        for(int i=0;i<input.length;i++){
            rem=input[i]%5;
            if(input[i]<38){
                result.add(input[i]);
            }
            else if(rem==0){
                result.add(input[i]);
            }
            else if(rem>=3){
                result.add(input[i]+(5-rem));
            }
            else if(rem<3){
                result.add(input[i]);
            }
            else{
                result.add(input[i]);
            }
        }
        return result;

    }

}

public class GradingStudent {
    public static void main(String[] args) throws IOException {

        List<Integer> grades=new ArrayList<>();
        grades.add(86);
        grades.add(30);
        grades.add(0);
        grades.add(16);
        grades.add(51);
        grades.add(53);
        grades.add(42);
        grades.add(48);
        grades.add(22);
        grades.add(69);
        grades.add(12);
        grades.add(27);
        grades.add(34);
        grades.add(24);
        grades.add(95);
        grades.add(16);
        grades.add(32);
        grades.add(22);
        grades.add(52);
        grades.add(56);
        grades.add(71);
        grades.add(95);

        List<Integer> result = Result1.gradingStudents(grades);
        System.out.println(result);


    }
}