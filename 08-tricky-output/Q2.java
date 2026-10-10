// Q2 — Tricky: What is the output?

public class Q2 {
    public static void main(String[] args) {
        // Post vs pre increment
        int i = 5;
        int j = i++ + ++i;   // what is j?
        System.out.println("i=" + i + ", j=" + j);

        // Integer overflow
        int max = Integer.MAX_VALUE;
        System.out.println(max + 1);

        // String + int
        System.out.println("1" + 2 + 3);
        System.out.println(1 + 2 + "3");
    }
}
