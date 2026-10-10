// Q1 — Tricky: Integer cache. What is the output?

public class Q1 {
    public static void main(String[] args) {
        Integer a = 127;
        Integer b = 127;
        Integer c = 128;
        Integer d = 128;

        System.out.println(a == b);   // Line A
        System.out.println(c == d);   // Line B
        System.out.println(c.equals(d)); // Line C
    }
}
