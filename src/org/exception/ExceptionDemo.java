package org.exception;

public class ExceptionDemo extends Object{

    public static void main(String[] args) {
        try
        {
            //int a[]={10,20,30};
            //a[6]=90;
            //int c=10/0;
            //System.out.println(c);
            System.gc();
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Finally");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(10/0);
    }
}
