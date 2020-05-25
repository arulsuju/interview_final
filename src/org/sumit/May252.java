package org.sumit;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class May252 {
    public static int minimumMoves(List<Integer> arr1, List<Integer> arr2) {
        String arr1String[]=new String[arr1.size()];
        for(int i=0;i<arr1.size();i++){
            arr1String[i]=String.valueOf(arr1.get(i));
        }
        String arr2String[]=new String[arr2.size()];
        for(int i=0;i<arr2.size();i++){
            arr2String[i]=String.valueOf(arr2.get(i));
        }
        int sum=0;
        int difference=0;
        if(arr1String.length==arr2String.length){
            for(int i=0;i<arr1String.length;i++){
                for(int j=0;j<arr1String[i].length();j++) {
                    difference = Math.abs(((int) (arr1String[i].charAt(j))) - ((int) (arr2String[i].charAt(j))));
                    if (difference == 0) {
                        sum += 0;
                    } else {
                        sum += difference;
                    }
                }
            }
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("output.txt"));

        int arr1Count = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr1 = new ArrayList<>();

        for (int i = 0; i < arr1Count; i++) {
            int arr1Item = Integer.parseInt(bufferedReader.readLine().trim());
            arr1.add(arr1Item);
        }

        int arr2Count = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr2 = new ArrayList<>();

        for (int i = 0; i < arr2Count; i++) {
            int arr2Item = Integer.parseInt(bufferedReader.readLine().trim());
            arr2.add(arr2Item);
        }

        int result = May252.minimumMoves(arr1, arr2);

        System.out.println(result);
        bufferedReader.close();
        bufferedWriter.close();
    }
}
