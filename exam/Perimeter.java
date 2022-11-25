public class Perimeter {
    public static void main(String[] args) {

        calculatePerimeter square = new calculatePerimeter();
        square.setA(5);
        System.out.println(square.perimeterSquare());
        calculatePerimeter rectangle = new calculatePerimeter(4, 8);
        System.out.println(rectangle.perimeterRectangle());
        calculatePerimeter circle = new calculatePerimeter(5);
        System.out.println(circle.perimeterCircle());

    }
}

class calculatePerimeter {
    private double radius;
    private double a;
    private double x;
    private double y;

    public calculatePerimeter(double radius) {
        this.radius = radius;
    }

    public calculatePerimeter() {
    }

    public calculatePerimeter(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public calculatePerimeter(double radius, double a, double x, double y) {
        this.radius = radius;
        this.a = a;
        this.x = x;
        this.y = y;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public double perimeterSquare() {
        return 4 * getA();
    }

    public double perimeterRectangle() {
        return 2 * (this.x + this.y);
    }

    public double perimeterCircle() {
        double pi = 3.14;
        return 2 * pi * this.radius;
    }
}