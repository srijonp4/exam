public class CompiletimePolyMorphism {

    // Java program to demonstrate the working of method
    // overloading by changing the Datatype of parameter

    // arguments of this function are of integer type
    static void show(int a, int b) {
        System.out.println("This is integer function ");
    }

    // argument of this function are of float type
    static void show(double a, double b) {
        System.out.println("This is double function ");
    }

    public static void main(String[] args) {
        // 1st show function
        show(1, 2);

        // 2nd show function
        show(1.2, 2.4);
    }
}
