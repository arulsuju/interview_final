package org.sorting;

public class SelectionSortDemo {
    public static void swap(int[] tempArray,int first,int second){
        int temp=tempArray[first];
        tempArray[first]=tempArray[second];
        tempArray[second]=temp;
    }
    public static void main(String[] args) {
        int[] aVal={9,5,3,6,98,2,2,1};

        for(int lastIndex=aVal.length-1;lastIndex>0;lastIndex--){
            int largest=0;
            for(int i=1;i<=lastIndex;i++){
                if(aVal[i]>aVal[largest]){
                    largest=i;
                }
            }
            swap(aVal,largest,lastIndex);
        }
        for(int i=0;i<aVal.length;i++){
            System.out.print(aVal[i]+"-->");

        }
    }
}
