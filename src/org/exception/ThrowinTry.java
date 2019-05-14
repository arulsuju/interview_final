package org.exception;

public class ThrowinTry {
    public static void main(String[] args) {
        try {
            throw new RuntimeException("Runtime");
        }
        catch (Exception e){
            //re throwing Exception in catch
            /*
            Exception in thread "main" java.lang.RuntimeException: Runtime in Catch
	at org.exception.ThrowinTry.main(ThrowinTry.java:14)
             */
            throw new RuntimeException("Runtime in Catch");

        }
        finally {
            System.out.println("This is Finally");
        }
    }
}
