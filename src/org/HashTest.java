package org;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;

class Employee  {
    private int id;

    public Employee(int id) {
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return getId() == employee.getId();
    }

    @Override
    public int hashCode() {

        return Objects.hash(getId());
    }
}

public class HashTest {

    public static void main(String[] args) {
        Set<Employee> hset = new HashSet<Employee>();
        Scanner s = new Scanner(System.in);
        String inputValues = s.nextLine();

        String[] values = inputValues.split("\\s");
        for (String v: values) {
            hset.add(new Employee(Integer.parseInt(v)));
        }

        System.out.println(hset.size());

        s.close();
    }

}
