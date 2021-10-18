package code;

import java.util.jar.Attributes.Name;

class Employee1 {
    int salary;
    String name;

    public int getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }
}

public class Exercise1 {
    public static void main(String[] args) {

        Employee1 emp = new Employee1();
        emp.salary = 20000;
        emp.setName("Faraz");

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

    }
}
