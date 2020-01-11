
package org.codelity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

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
        // TODO Auto-generated method stub
        int i=0, count =1, index =0, ac=0;

        int length = N-1;
        int x[] = new int[N];

        while(length>=0) {
            if(i==length) {
                x[index]= count;
                break;

            }else {
                while(arr[i+1]-arr[i] == K) {
                    count ++;
                    i++;
                    if(i>=length)
                        break;
                }
            }
            x[index]= count;
            index++;
            count = 1;
            ac ++;
            i=ac;
            length--;
        }

        return x;

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
