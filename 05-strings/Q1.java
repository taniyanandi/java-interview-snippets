// Q1 — Strings: What is the output?

public class Q1 {
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = c.intern();

        System.out.println(a == b);         // Line A
        System.out.println(a == c);         // Line B
        System.out.println(a == d);         // Line C
        System.out.println(a.equals(c));    // Line D

        // Concat trap
        String x = "hel";
        String y = x + "lo";               // runtime concat
        String z = "hel" + "lo";           // compile-time constant folding

        System.out.println(a == y);         // Line E
        System.out.println(a == z);         // Line F
    }
}
