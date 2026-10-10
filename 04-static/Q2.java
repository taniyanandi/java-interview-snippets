// Q2 — Static initialization order: What is the output?

public class Q2 {
    static int x = initX();
    static int y;

    static {
        y = 20;
        System.out.println("Static block 1: x=" + x + ", y=" + y);
    }

    static int z = initZ();

    static {
        System.out.println("Static block 2: z=" + z);
    }

    static int initX() {
        System.out.println("initX called");
        return 10;
    }

    static int initZ() {
        System.out.println("initZ called");
        return 30;
    }

    public static void main(String[] args) {
        System.out.println("main: x=" + x + ", y=" + y + ", z=" + z);
    }
}
