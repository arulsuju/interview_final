package org.codelity.sushal;
import java.io.*;
public class CandidateCode {
    public static long  process(int n,long[] qN,long[] qH){
        long min;
        if(qH[0]>0 && qN[0]>0)
        {
            min = qH[0] / qN[0];
            long mul;
            for(int i=1;i<n;i++)
            {
                if(qH[i]>0 && qN[i]>0)
                {
                    mul = qH[i] / qN[i];
                    if(mul<min)
                    {
                        min=mul;
                    }
                }
                else{
                    min=0;
                }
            }
        }
        else {
            min=0;
        }
        return min;
    }
    public static void main(String[] args) throws Exception{
       BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
       String qN=br.readLine();
       String qH=br.readLine();
       String qNArray[]=qN.split(" ");
       String qHArray[]=qH.split(" ");
       long qNIntArray[]=new long[qNArray.length];
       long qHIntArray[]=new long[qHArray.length];
       for(int i=0;i<qNArray.length;i++){
           qNIntArray[i]=Long.parseLong(qNArray[i]);
           qHIntArray[i]=Long.parseLong(qHArray[i]);
       }
        System.out.println(process(n,qNIntArray,qHIntArray));
    }
}
