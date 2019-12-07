package org.sorting;

public class BubbleSortDemo {
    public static void swap(int[] a,int i,int j) {
        if(i==j){
            return;
        }
        int temp;
        temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    public static void main(String[] args) {
        int[] intArray={3,6,2,1,4,6,8,9,1,-1};
        for(int i=intArray.length-1;i>0;i--){
            for (int j=0;j<i;j++){
                if(intArray[j]>intArray[j+1]){
                    swap(intArray,j,j+1);
                }
            }
        }
        for(int i=0;i<intArray.length;i++){
            System.out.println(intArray[i]);
        }
    }
}
