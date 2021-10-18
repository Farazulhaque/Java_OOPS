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
        Employee eName = new Employee(); // Instantiating a new Employee Object
        int salary;
        // Setting Attributes for name
        eName.id = 12;
        eName.salary = 34;
        eName.name = "Faraz";
        // Printing the Attributes
        eName.printDetails();
        salary = eName.getSalary();
        System.out.println(" and My Salary is " + salary + "K.");

        // Setting Attributes for John
        eName.id = 17;
        eName.salary = 32;
        eName.name = "Arisha";
        // Printing the Attributes
        eName.printDetails();
        salary = eName.getSalary();
        System.out.println(" and My Salary is " + salary + "K.");

    }
}