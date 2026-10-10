// Q1 — Overloading: What is the output?

public class Q1 {
    static void print(int x) {
        System.out.println("int: " + x);
    }

    static void print(long x) {
        System.out.println("long: " + x);
    }

    static void print(double x) {
        System.out.println("double: " + x);
    }

    public static void main(String[] args) {
        print(5);       // Line A
        print(5L);      // Line B
        print(5.0);     // Line C
        print('A');     // Line D — char, no char overload!
    }
}
