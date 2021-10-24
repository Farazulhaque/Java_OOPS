package code;

class Circle1 {
    public int radius;

    Circle1() {
        // System.out.println("I am non param of Circle1");
    }

    Circle1(int r) {
        // System.out.println("I am Circle1 parameterized constructor");
        this.radius = r;
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }
    public double volume() {
        return Math.PI * this.radius * this.radius;
    }
}

class Cylinder1 extends Circle1 {
    public int height;

    Cylinder1(int r, int h) {
        super(r);
        // System.out.println("I am cylinder1 parameterized constructor");
        this.height = h;
    }

    public double volume() {
        return Math.PI * this.radius * this.radius * this.height;
    }
}

public class Exercise7 {
    public static void main(String[] args) {
        // Problem 1
        // Circle1 objC = new Circle1(12);
        Cylinder1 obj = new Cylinder1(12, 4);
    }
}
