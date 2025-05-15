package ch9;
interface A {
    default void show() {
        System.out.println("A's show method");
    }
}

interface B {
    default void show() {
        System.out.println("B's show method");
    }
}

// This causes ambiguity
class C implements A, B {
    @Override
    public void show() {
        A.super.show();
    }
    // Compilation error: show() is inherited from both A and B
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}