package citiworkshop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        /*list.forEach(a-> System.out.println(a));
        list.forEach(System.out::println);

        List<Integer> list1=list.stream().filter(i->i%2==0).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> squares = list
                .stream()
                .map((val)->val*val)
                .collect(Collectors.toList());
        System.out.println(squares);

        list.stream().map(i -> i*i).forEach(System.out::print);
*/
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Stream<Integer> s1=list.stream();
        Stream<Integer> s2=list.stream();
        Predicate<Integer> p1=i->i%2==0;
        Predicate<Integer> p2=Predicate.isEqual(4);
        s1.filter(p1.or(p2)).forEach(System.out::println);
        s1.close();
        s2.filter(p1.and(p2)).forEach(System.out::println);
        s2.close();


        List<Integer> list1= Arrays.asList(1,2,3,4,5);
        Stream<Integer> str=list1.stream();
        Predicate<Integer> p11=Predicate.isEqual(2);
        Predicate<Integer> p22=Predicate.isEqual(4);
        List<Integer> out=new ArrayList<>();

        str.peek(System.out::println)
                .filter(p11.or(p22))
                .filter(p11.and(p22))
                .forEach(out::add);
        System.out.println(list1);

        List<Integer> ar=Arrays.asList(1,2,3,4);
        int max=ar.stream().reduce(Integer::max).get();
        System.out.println(max);

        List<Integer> ar1= Arrays.asList(1,2,3,4,5);
        int max1=ar1.stream().reduce((a,b)->a>b?a:b).get();
        System.out.println(max1);
    }
}
