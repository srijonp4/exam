
import javax.print.DocFlavor.STRING;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Area01 {
    public static void main(String[] args) throws IOException {
        // String new BufferedReader(new InputStreamReader(System.in)).readLine() = new
        // BufferedReader(new InputStreamReader(System.in)).readLine();
        System.out.println("Enter the value for r ");
        double r = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Enter the value for x ");
        double x = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Enter the value for y ");
        double y = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.println("Enter the value for a ");
        double a = Double.parseDouble(new BufferedReader(new InputStreamReader(System.in)).readLine());

        Area rectangle = new Area(x, y);
        Area square = new Area(a);
        Area circle = new Area();
        circle.setR(r);

        System.out.println(rectangle.AreaRectangle());
        System.out.println(square.AreaSquare());
        System.out.println(circle.AreaCircle());

    }
}

class Area {
    private double r;
    private double a;
    private double x;
    private double y;

    Area(double a) {
        this.a = a;
    }

    Area(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Area() {
    }

    public double getR() {
        return r;
    }

    public double getA() {
        return a;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double AreaRectangle() {
        return x * y;
    }

    public double AreaSquare() {
        return Math.pow(a, 2);
    }

    public double AreaCircle() {
        // System.out.println((3.14 * Math.pow(r, 2)));
        return (3.14 * Math.pow(r, 2));
    }

}
