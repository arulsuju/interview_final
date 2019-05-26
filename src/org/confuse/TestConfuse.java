package org.confuse;
public class TestConfuse {
    public void confuse(boolean var){
        System.out.println("Boolean"+var);
    }
    public void confuse(String var){
        System.out.println("String"+var);
    }
    public void confuse(Object var){
        System.out.println("Object"+var);
    }
    public void confuse(Integer var){
        System.out.println("Integer"+var);
    }
   /* public void confuse(char var){
        System.out.println("Char"+var);
    }*/
    public static void main(String[] args) {

        TestConfuse testConfuse=new TestConfuse();
        testConfuse.confuse('\t');
    }
}
