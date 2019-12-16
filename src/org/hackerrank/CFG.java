
package org.hackerrank;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine());
        for(int t_i=0; t_i<T; t_i++)
        {   int N = Integer.parseInt(br.readLine());
            String[] arr_arr = br.readLine().split(" ");
            int[] arr = new int[N];
            for(int i_arr=0; i_arr<arr_arr.length; i_arr++)
            {
                arr[i_arr] = Integer.parseInt(arr_arr[i_arr]);
            }
            int K = Integer.parseInt(br.readLine());
            int[] out_ = GoodSubArray(arr, K, N);
            wr.print(out_[0]);
            for(int i_out_=1; i_out_<out_.length; i_out_++)
            {
                wr.print(" ");wr.print(out_[i_out_]);
            }
            wr.println();
        }

        wr.close();
        br.close();
    }
    static int[] GoodSubArray(int[] arr, int K, int N){
        List<Integer> list=new ArrayList<>();
        int[] res=new int[arr.length];
        int count;
        int length=0;
        for(int i=0;i<arr.length;i++){
            count=0;

            for(int first=count;first<arr.length;first++){
                for(int second=first+1;second<arr.length-1;second++){
                    if(arr[first]-arr[second]==K || arr[second]-arr[first]==K){
                       length++;
                       count=count+1;
                    }
                    else{
                        length=1;
                    }

                }
                res[i]=length;
            }
        }
        return res;
    }
}
/*
ip
1
5
3 6 8 11 14
3

op
2 1 3 2 1
*/
