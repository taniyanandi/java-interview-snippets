// Q1 — this/super: What is the output?

class A {
    int x = 10;

    A() {
        System.out.println("A constructor, x = " + x);
    }
}

class B extends A {
    int x = 20;   // shadows A.x

    B() {
        // super() is called implicitly here
        System.out.println("B constructor, x = " + x);
        System.out.println("super.x = " + super.x);
        System.out.println("this.x = " + this.x);
    }
}

public class Q1 {
    public static void main(String[] args) {
        new B();
    }
}
