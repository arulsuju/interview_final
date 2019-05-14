package org.inheritance;
class Employee{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Manager extends Employee{
    private String man_name;

    public String getMan_name() {
        return man_name;
    }

    public void setMan_name(String man_name) {
        this.man_name = man_name;
    }
}
public class InDemo{
    public static void main(String[] args) {

        Employee employee=new Manager();
        employee.setName("arulsuju");
        ((Manager) employee).setMan_name("manager");
        System.out.println(employee.getName());
        System.out.println(((Manager) employee).getMan_name());

    }
}
