import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UnModificableArrayList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        List<Integer> res= Collections.unmodifiableList(list);
       /* res.add(10);
        Exception in thread "main" java.lang.UnsupportedOperationException
        at java.util.Collections$UnmodifiableCollection.add(Collections.java:1057)
        at UnModificableArrayList.main(UnModificableArrayList.java:10)*/

        System.out.println(res);

        final List<Integer> anotherList=list;
        anotherList.add(10);
        System.out.println(anotherList);
        // [1, 2, 3, 4, 5, 6, 7, 10]

    }
}
