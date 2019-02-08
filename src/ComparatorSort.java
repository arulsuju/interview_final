import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee{
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
class SortByName implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.name.compareTo(o2.name);
    }
}
class SortByAge implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.age-o2.age;
    }
}
public class ComparatorSort {
    public static void main(String[] args) {

        Employee employee=new Employee("SUJU",32);
        Employee employee1=new Employee("ARUL",22);
        Employee employee2=new Employee("kamal",1);

        ArrayList<Employee> list=new ArrayList<>();
        list.add(employee);
        list.add(employee1);
        list.add(employee2);

        Collections.sort(list,new SortByName());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

        Collections.sort(list,new SortByAge());
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }

        Collections.sort(list,Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge));
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}
