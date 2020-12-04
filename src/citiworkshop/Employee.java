package citiworkshop;

public class Employee {
    public int EID;
    public String EName;
    public int Salary;
    public  Employee(){}
    public  Employee(int id,String name,int sal){
        EID=id;
        EName=name;
        Salary=sal;
    }

    public int getEID() {
        return EID;
    }

    public void setEID(int EID) {
        this.EID = EID;
    }

    public String getEName() {
        return EName;
    }

    public void setEName(String EName) {
        this.EName = EName;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }
}
