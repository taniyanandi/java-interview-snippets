// Q2 — Overloading vs Overriding: What is the output?

class Base {
    void show(Base b) {
        System.out.println("Base.show(Base)");
    }
}

class Derived extends Base {
    void show(Derived d) {          // OVERLOAD, not override (different parameter type)
        System.out.println("Derived.show(Derived)");
    }
}

public class Q2 {
    public static void main(String[] args) {
        Base b = new Derived();
        Derived d = new Derived();

        b.show(b);   // Line A
        b.show(d);   // Line B
        d.show(b);   // Line C
        d.show(d);   // Line D
    }
}
