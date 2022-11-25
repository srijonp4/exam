import java.util.Scanner;

class Fibonacchi {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of points (n) :--");
        int n = reader.nextInt();
        reader.close();
        System.out.println("--------------------------------");
        int n0 = 0;
        int n1 = 1;
        for (int i = 1; i <= n; i++) {
            int fib = n0 + n1;
            System.out.println(n0);
            n0 = n1;
            n1 = fib;

        }
    }
}