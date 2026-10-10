// Q3 — Polymorphism: What is the output?

class Parent {
    static void staticMethod() {
        System.out.println("Parent static");
    }

    void instanceMethod() {
        System.out.println("Parent instance");
    }
}

class Child extends Parent {
    static void staticMethod() {    // method HIDING (not overriding)
        System.out.println("Child static");
    }

    @Override
    void instanceMethod() {
        System.out.println("Child instance");
    }
}

public class Q3 {
    public static void main(String[] args) {
        Parent p = new Child();
        p.staticMethod();    // Line A
        p.instanceMethod();  // Line B
    }
}
