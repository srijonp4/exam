import java.util.Scanner;

public interface factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int i, fact = 1;
        System.out.println("enter the number \n");

        int number = reader.nextInt(); // TODO
        for (i = 1; i <= number; i++) {

            fact *= i;

        }
        System.out.println("Factorial is :" + fact);
    }
}
