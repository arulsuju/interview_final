package org.string.difference.string;
/*
Both have same memory
Both have same memory
Both have different Memory
Both have same Hashcode
 */
public class Demo {
    public static void main(String[] args) {

        String name="arulsuju";
        String anotherName="arulsuju";
        if(name==anotherName){
            System.out.println("Both have same memory ");
        }
        else{
            System.out.println("Both have different Memory");
        }
        if(name.hashCode()==anotherName.hashCode()){
            System.out.println("Both have same HashCode ");
        }
        else{
            System.out.println("Both have different HashCode");
        }

        String n=new String("arulsuju");
        String an=new String("arulsuju");
        if(n==an){
            System.out.println("Both have same memory ");
        }
        else{
            System.out.println("Both have different Memory");
        }
        if(n.hashCode()==an.hashCode()){
            System.out.println("Both have same Hashcode ");
        }
        else{
            System.out.println("Both have different Hashcode");
        }
    }
}
