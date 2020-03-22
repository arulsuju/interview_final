package org.hackerrank;

public class BeautifulDayMovies {
    static int beautifulDays(int i, int j, int k) {
        int count=0;
         for(int start=i;start<=j;start++){
             StringBuilder sb=new StringBuilder();
             sb.append(String.valueOf(start)).reverse();
             //System.out.println(sb);
             double difference=start-Integer.parseInt(sb.toString());
             double soln=Math.abs(difference/k);
            // System.out.println(soln);
             if(soln%1==0)
             {
                count=count+1;
             }
         }
         return count;
    }
    public static void main(String[] args) {
        System.out.println(beautifulDays(13,45,3));
    }
}
