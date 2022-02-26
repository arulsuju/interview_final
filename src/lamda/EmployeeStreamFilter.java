package lamda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

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

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class EmployeeStreamFilter {
    public static void main(String[] args) {

        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Arul",34));
        list.add(new Employee("Suju",21));

        List<Employee> result= list.stream().filter(employee -> employee.getAge()>30).collect(Collectors.toList());
        System.out.println(result);
    }
}
