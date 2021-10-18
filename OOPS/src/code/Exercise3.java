package code;

class Square {
    int side;

    public int getArea() {
        return side * side;
    }

    public int getPerimeter() {
        return 4 * side;
    }

    public void setSide(int s) {
        side = s;
    }

    public int getSide() {
        return side;
    }
}

public class Exercise3 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.setSide(10);

        System.out.println("Area of square having side " + sq.getSide() + " is " + sq.getArea());
        System.out.println("Perimeter of square having side " + sq.getSide() + " is " + sq.getPerimeter());

    }
}
