package org.codelity.sushal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class CandidateCode2 {
    public static void main(String[] args) throws Exception{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int count=Integer.parseInt(br.readLine());
        List<Integer> output=new LinkedList<>();
        while (count>0){
            int n = Integer.parseInt(br.readLine());
            String t1Array[] = br.readLine().split(" ");
            String t2Array[] = br.readLine().split(" ");

            Long t1IntArray[] = new Long[n];
            Long t2IntArray[] = new Long[n];
            for (int i = 0; i < n; i++) {
                t1IntArray[i] = Long.parseLong(t1Array[i]);
                t2IntArray[i] = Long.parseLong(t2Array[i]);
            }
            List<Long> team1=new ArrayList<Long>(Arrays.asList(t1IntArray));
            Collections.sort(team1,Comparator.reverseOrder());
            List<Long> team2=new ArrayList<Long>(Arrays.asList(t2IntArray));
            Collections.sort(team2,Comparator.reverseOrder());
            int win=0;
            for(int i=0;i<n;i++){

                for(int j=0;j<team2.size();j++) {
                    if (team1.get(i) > team2.get(j)) {
                        win += 1;
                        team2.remove(j);
                        break;
                    }
                }
            }
            output.add(win);
            count=count-1;
        }
        for(int i:output){
            System.out.println(i);
        }
    }
}