
//TODO Import
import java.util.*;
import java.lang.Math;

public class quadratic {

        public static void main(String[] args) {

                int a, b, c;

                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the value a b c : ");
                a = scanner.nextInt();
                b = scanner.nextInt();
                c = scanner.nextInt();
                System.out.printf("Quadratic Equation : %dx^2+%dx+%d \n", a, b, c);
                double d = (Math.pow(b, 2) - 4 * a * c);
                double ans1 = (-b + (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);
                double ans2 = (-b - (Math.sqrt(Math.pow(b, 2) - 4 * a * c))) / (2 * a);

                if (d >= 0) {
                        System.out.println("Roots : " + ans1 + " and " + ans2);
                } else if (d < 0) {
                        System.out.println("imaginary");
                }

        }

}