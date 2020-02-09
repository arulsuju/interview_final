package org.codelity;
import java.util.*;
public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int row =sc.nextInt();
        int col =sc.nextInt();
        int[][] ar = new int[row][col];
        //storing row-wise values
        for(int i = 0;i<col;i++) {
            for(int j=0;j<row;j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        //print rows of matrix
        for(int i = 0;i<col;i++) {
            for(int j=0;j<row;j++) {
                System.out.print(ar[i][j]+" ");
            }
            System.out.println();
        }
        int sad_point =0;
        //initial check
        if(ar.length <=2 || ar[0].length<=2 ) {
            System.out.println("0 saddle points");
            System.exit(0);
        }
        //if all conditions are cool..!! we proceed for saddle point
        else {
            for(int i= 1;i<ar.length-1;i++) {
                for(int j = 1;j<ar[0].length-1;j++) {
                    if(ar[i][j]<ar[i][j-1] && ar[i][j]<ar[i][j+1] && ar[i][j]>ar[i-1][j] && ar[i][j]>ar[i+1][j]) {
                        sad_point++;
                        //System.out.println(" Value is : "+ ar[i][j]+ " "+ ar[i][j+1]+ " "+ sad_point);
                    }
                    else if(ar[i][j]>ar[i][j-1] && ar[i][j]>ar[i][j+1] && ar[i][j]<ar[i-1][j] && ar[i][j]<ar[i+1][j]) {
                        sad_point++;
                    }
                    //            System.out.println("sad points = "+ sad_point+ " i is : "+i+ " j is : "+j);
                }
            }
            System.out.println("sad points "+ sad_point);
        }
    }
    }

