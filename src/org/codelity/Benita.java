package org.codelity;

import java.util.Arrays;

public class Benita {
    public static int minDistance(int A,int B,int C,int D){
        int[] arr = new int[] {A,B,C,D};
        Arrays.sort(arr);
        int dist ;
        dist = ((arr[3] -arr[0])*(arr[3] -arr[0])) + ((arr[2] -arr[1])*(arr[2] -arr[1]));
        return dist;
    }
    public static void main(String[] args) {
        System.out.println(minDistance(10,20,30,40));

    }
}
