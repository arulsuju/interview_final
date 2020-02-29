package org.codelity.mutiplechoice;
import java.io.*;
import java.util.*;
public class JavaTest {
	static void miniMaxSum(int[] arr) {

        int length=arr.length;
        List<Long> list=new ArrayList<>();
        long sum=0;
        int count=1;
        
        for(int i=0;i<length;i++){
            for(int j=0;j<length;j++)
            {
                if(i!=j)
                {
                    if(count<=4){
                    count=count+1;
                    sum=sum+arr[j];
                }
                if(count>4){
                    count=1;
                    list.add(sum);
                    sum=0;
               
                }
                }
            }

            }
           
        Collections.sort(list);
        System.out.println(list.get(0)+" "+list.get(list.size()-1));
        }
        
	public static void main(String[] args) {
		int[] input= {1,2,3,4,5,6,7,8,9,10};
		miniMaxSum(input);
		
	}
	

}
