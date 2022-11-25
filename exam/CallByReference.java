public class CallByReference {
    public static void main(String[] args) {

        IntWrapper a = new IntWrapper(10);
        IntWrapper b = new IntWrapper(30);
        System.out.println("before Swaping");
        System.out.println("value of a.x is " + a.x);
        System.out.println("value of b.x is " + b.x);
        System.out.println("after Swaping");
        // CallByReference.swapfunction(a, b);
        swapfunction(a, b);
        System.out.println("value of a.x is " + a.x);
        System.out.println("value of b.x is " + b.x);

    }

    public static void swapfunction(IntWrapper a, IntWrapper b) {
        IntWrapper temp = new IntWrapper(a.x);
        a.x = b.x;
        b.x = temp.x;
    }
}

class IntWrapper {

    public int x;

    public IntWrapper(int x) {
        this.x = x;
    }

}
