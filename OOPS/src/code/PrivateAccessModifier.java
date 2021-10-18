package code;

class MyEmployee {
    private int id;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }

    public void setId(int i) {
        this.id = i;
    }

    public int getId() {
        return id;
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        MyEmployee emp = new MyEmployee();

        // emp.id = 45;
        // emp.name = "Faraz"; --> Throws an error due to private access modifier

        emp.setName("Faraz");
        System.out.println("Name: " + emp.getName());
        emp.setId(15);
        System.out.println("ID: " + emp.getId());
    }
}
