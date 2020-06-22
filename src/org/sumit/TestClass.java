package org.sumit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TestClass {
    public static int element(int[] arr, int n)
    {

        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            if (map.get(arr[i]) != null) {
                count = map.get(arr[i]);
            }
            map.put(arr[i], count + 1);
        }

        int sum = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() % 2 == 0) {
                sum += entry.getKey() * entry.getValue();
            }
        }

        return sum/2;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[] =new int[n];
        String input=br.readLine();
        String arrInput[]=input.split(" ");
        for(int i=0;i<arrInput.length;i++){
            arr[i]=Integer.parseInt(arrInput[i]);
        }
        System.out.println(element(arr, n));
    }
}
