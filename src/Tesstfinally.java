public class Tesstfinally {
    public static void main(String args[]){
        System.out.println(testFinal());
    }

    private static int testFinal() {
        int i=0;
        try{
            i=100;
            return i;
        }finally {
            i=200;
        }
    }
}
