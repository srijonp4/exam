public class CallByValue {
    public static void main(String[] args) {
        A changer = new A();
        System.out.println("Before change " + changer.x);
        changer.changeX();
        System.out.println("After Change " + changer.x);
    }
}

class A {
    public int x = 12;

    public void changeX() {
        this.x = this.x + 100;
    }
}
