package org.creating.objects;
class Programmer implements Cloneable{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
public class ObjectCreationDemo {
    public static void main(String[] args)throws Exception {

        //using New keyword
        Programmer obj1=new Programmer();
        obj1.setName("suju-obj1");
        System.out.println(obj1.getName());

        //using Class.forName
        Programmer obj2=(Programmer)Class
                .forName("org.creating.objects.Programmer")
                .newInstance();
        obj2.setName("suju-obj2");
        System.out.println(obj2.getName());

        //using clone method- the class must implements Cloneable
        Programmer obj3=(Programmer)obj1.clone();
        obj3.setName("suju-obj3");
        System.out.println(obj3.getName());

        //using deserialization




    }

}
