package lamda;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLamdaDemo {
    public static void main(String[] args) {

        List<String> stringList=new ArrayList<>();
        stringList.add("One");
        stringList.add("Two");

        stringList.forEach(n-> System.out.println(n));
    }
}
