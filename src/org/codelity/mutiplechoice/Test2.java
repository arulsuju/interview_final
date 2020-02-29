package org.codelity.mutiplechoice;
import java.util.*;
public class Test2 {
	static int birthdayCakeCandles(int[] ar) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            list.add(ar[i]);
        }
        Collections.sort(list);
        int val=list.get(list.size()-1);
        int count=0;
        for(int i=0;i<ar.length;i++){
          if(val==ar[i]){
              count=count+1;
          }
        }
        return count;
    }
	public static void main(String arg[]) {
		
		int[] input= {3,2,1,3};
		birthdayCakeCandles(input);
		System.out.println(birthdayCakeCandles(input));
	}

}
