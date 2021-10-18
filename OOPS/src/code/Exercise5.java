package code;

class Circle {
    final double PI = 3.14;
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * PI * radius;
    }

}

public class Exercise5 {
    public static void main(String[] args) {

        Circle crcl = new Circle();
        crcl.setRadius(10);

        System.out.println("Area of circle having radius " + crcl.getRadius() + " is " + crcl.getArea());
        System.out.println("Perimeter of circle having radius " + crcl.getRadius() + " is " + crcl.getPerimeter());

    }
}
