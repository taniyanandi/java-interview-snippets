// Q2 — Constructor chaining with this(): What is the output?

public class Q2 {
    int x;
    String label;

    Q2() {
        this(42);                          // chains to Q2(int)
        System.out.println("no-arg constructor");
    }

    Q2(int x) {
        this(x, "default");                // chains to Q2(int, String)
        System.out.println("int constructor, x = " + x);
    }

    Q2(int x, String label) {
        this.x = x;
        this.label = label;
        System.out.println("full constructor, x = " + x + ", label = " + label);
    }

    public static void main(String[] args) {
        new Q2();
    }
}
