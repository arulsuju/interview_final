package citiworkshop;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> emps=new ArrayList<>();
        emps.add(new Employee(101,"aaa",78000));
        emps.add(new Employee(102,"bbb",65000));
        emps.add(new Employee(103,"ccc",45000));


        List<Employee> result =new ArrayList<>();
        /*result=emps.stream()
                .filter(employee -> employee.getSalary() > 50000)
                .collect(Collectors.toList());
       result.forEach(e-> System.out.println("Ëmpid"+e.EName));*/

        result.stream()
                .filter(e->e.getSalary()>50000)
                .forEach(e->System.out.println("Eid"+e.EName));
    }
}
