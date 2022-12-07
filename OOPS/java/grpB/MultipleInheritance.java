// package grpB;

public class MultipleInheritance implements A, B {

    public static void main(String[] args) {
        MultipleInheritance srijon = new MultipleInheritance();
        srijon.displayA();
        srijon.displayB();
    }

    @Override
    public void displayA() {
        System.out.println("inherited from A");
        A.super.displayA();
    }

    @Override
    public void displayB() {
        System.out.println("inherited from B");
        B.super.displayB();
    }
}

interface A {
    default void displayA() {
        System.out.println("from interface A");
    };
}

interface B {
    default void displayB() {
        System.out.println("from interface B");

    };
}