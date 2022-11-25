// public class testPrivate {
// public static void main(String[] args) {
// pvt newPvt = new pvt();

// System.out.println("getting the value of x using getter ---> " +
// newPvt.getX());
// }
// }

// class pvt {
// private int x = 100;

// public int getX() {
// return x;
// }
// }
class A {
    private int data = 40;

    private void msg() {
        System.out.println("Hello java");
    }
}

public class testPrivate {
    public static void main(String args[]) {
        A obj = new A();
        System.out.println(obj.data);// Compile Time Error
        obj.msg();// Compile Time Error
    }
}
