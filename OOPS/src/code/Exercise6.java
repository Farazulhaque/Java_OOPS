package code;

class Cylinder {
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double surfaceArea() {
        return 2 * Math.PI * radius * radius + Math.PI * radius * radius;
    }

    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Rectangle1 {
    private int length;
    private int breadth;

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }

}

public class Exercise6 {
    public static void main(String[] args) {
        Cylinder mCylinder = new Cylinder(9, 12);
        // mCylinder.setHeight(12);
        // System.out.println(mCylinder.getHeight());
        // mCylinder.setRadius(9);
        // System.out.println(mCylinder.getRadius());

        System.out.println(mCylinder.surfaceArea());
        System.out.println(mCylinder.volume());

        Rectangle1 r = new Rectangle1();
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        Rectangle1 r1 = new Rectangle1(12, 5);
        System.out.println(r1.getLength());
        System.out.println(r1.getBreadth());

    }
}
