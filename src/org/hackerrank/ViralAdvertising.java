package org.hackerrank;
/*
HackerLand Enterprise is adopting a new viral advertising strategy. When they launch a new product, they advertise it to exactly  people on social media.
 */
public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int count=5;
        int res;
        int ans=0;
        for(int i=1;i<=n;i++){
            ans=ans+(count/2);
            System.out.println(count);
            res=(count/2)*3;
            count=res;
            //System.out.println(res);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(viralAdvertising(3));

    }
}
