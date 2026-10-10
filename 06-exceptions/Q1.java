// Q1 — Exceptions: What is the output?

public class Q1 {
    static int riskyMethod() {
        try {
            System.out.println("try");
            return 1;
        } catch (Exception e) {
            System.out.println("catch");
            return 2;
        } finally {
            System.out.println("finally");
            // return 3;   // uncomment this — what changes?
        }
    }

    public static void main(String[] args) {
        int result = riskyMethod();
        System.out.println("result = " + result);
    }
}
