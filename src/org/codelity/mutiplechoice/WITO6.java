package org.codelity.mutiplechoice;

public class WITO6 {
    /*getdata(byte b,double z){ what is the return type
        return (short)a/z*10;
    }*/
    double getdata(byte b,double z){
        return (short)b/z*10;
    }

    public static void main(String[] args) {
        WITO6 wito6=new WITO6();
        byte b=10;
        wito6.getdata(b,2);
    }
}
//double
