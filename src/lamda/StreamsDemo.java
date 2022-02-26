package lamda;


import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(10,20,30,40,5,6,6,7,7,8,8,9,9,9);
      //  list.forEach(i-> System.out.println(i));

        List<Integer> toList=list.stream().sorted().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(toList);

        //using predicate
        List<Integer> list1=Arrays.asList(1,2,3,4,5,6,7,8,9,0);
        Predicate<Integer> predicate=new Predicate<Integer>() {
            @Override
            public boolean test(Integer i) {
                return i%2!=0;
            }

        };

        Predicate<Integer> p2=Predicate.isEqual(2);

        //predicate only
        System.out.println(list1.stream().filter(predicate.or(p2)).collect(Collectors.toList()));
        //predicate with filter
        System.out.println(list1.stream().filter(predicate.or(p2)).map(i->i*i).collect(Collectors.toList()));

        int max=list1.stream().reduce(Integer::max).get();
        System.out.println(max);
    }
}
