package code;

class Rectangle {
    int length, breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public int getArea() {
        return length * breadth;
    }

    public int getPerimeter() {
        return 2 * (length + breadth);
    }
}

public class Exercise4 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setLength(10);
        rect.setBreadth(8);
        System.out.println("Area of rectangle having length: " + rect.getLength() + " and breadth: " + rect.getBreadth()
                + " is " + rect.getArea());
        System.out.println("Perimeter of rectangle having length: " + rect.getLength() + " and breadth: "
                + rect.getBreadth() + " is " + rect.getPerimeter());

    }
}
