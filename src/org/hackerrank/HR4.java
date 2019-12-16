package org.hackerrank;

public class HR4 {
    static String val;
    public static void main(String[] args) {
       HR4 hr4=new HR4();
       val=getString("Program");
        System.out.println(""+val);
    }
    public static String getString(String str){
        System.out.println(str.length());
        StringBuffer stringBuffer=new StringBuffer(str.length());
        for(int i=str.length()-1;i>0;i--){
            stringBuffer.append(str.charAt(i));
        }
        return  stringBuffer.toString();
    }
}
