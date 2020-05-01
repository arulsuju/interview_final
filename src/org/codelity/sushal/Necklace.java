package org.codelity.sushal;

public class Necklace {
    public static boolean Contains(int head,int[] beans){
        boolean flag=false;
        int len=beans.length;
        for(int i=0;i<len;i++) {

            if (head == beans[i]) {
                flag=true;
            }
        }
        return flag;
    }
    public int solution(int[] A) {
        int maxvalue = 0;
        int[] mainData = new int[A.length+1];
        int imain = 0;
        int head;
        int tail;
        int counter = 0;
        if (A.length > 0)
        {
            for(int i = 0; i < A.length; i++)
            {
                counter = 1;
                head = i;
                tail = A[i];
                if (head != tail)
                {
                    if (!Contains(head,mainData) || head == 0)
                    {
                        mainData[imain++] = head;
                        mainData[imain++] = tail;
                        while (head != tail)
                        {
                            tail = A[tail];
                            mainData[imain++] = tail;
                            counter++;
                        }
                    }
                }
                if (counter >= maxvalue)
                {
                    maxvalue = counter;
                }
            }
        }
        return maxvalue;
    }
    public static void main(String[] args) {
        Necklace necklace=new Necklace();
        int[] testArray = new int[]{5,4,0,3,1,6,2};
       //int[] testArray = new int[]{1,2,3,4,5,6,7};
        System.out.println(necklace.solution(testArray));

    }
}
