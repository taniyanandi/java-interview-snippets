// Q1 — Static: What is the output?

class Counter {
    static int count = 0;
    int id;

    Counter() {
        count++;
        id = count;
    }

    static void showCount() {
        System.out.println("Total: " + count);
        // System.out.println(id);  // COMPILE ERROR — why?
    }
}

public class Q1 {
    public static void main(String[] args) {
        Counter a = new Counter();
        Counter b = new Counter();
        Counter c = new Counter();

        System.out.println("a.id = " + a.id);
        System.out.println("b.id = " + b.id);
        Counter.showCount();

        // Does this change b's count?
        a.count = 10;
        System.out.println("b.count = " + b.count);
    }
}
