package code;

class Employee {
    int id;
    int salary;
    String name;

    public void printDetails() {
        System.out.print("My ID is " + id);
        System.out.print(" and My Name is " + name);
    }

    public int getSalary() {
        return salary;
    }
}

public class FirstClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee emp = new Employee(); // Instantiating a new Employee Object
        int salary;
        // Setting Attributes for emp
        emp.id = 12;
        emp.salary = 34;
        emp.name = "Faraz";
        // Printing the Attributes
        emp.printDetails();
        salary = emp.getSalary();
        System.out.println(" and My Salary is " + salary + "K.");

        // Setting Attributes for emp
        emp.id = 17;
        emp.salary = 32;
        emp.name = "Arisha";
        // Printing the Attributes
        emp.printDetails();
        salary = emp.getSalary();
        System.out.println(" and My Salary is " + salary + "K.");

    }
}