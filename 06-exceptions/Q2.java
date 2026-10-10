// Q2 — Exceptions: What is the output?

public class Q2 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            int[] arr = new int[5];
            arr[10] = 1;            // throws ArrayIndexOutOfBoundsException
            System.out.println("B");
        } catch (NullPointerException e) {
            System.out.println("C");
        } catch (RuntimeException e) {
            System.out.println("D");
        } catch (Exception e) {
            System.out.println("E");
        } finally {
            System.out.println("F");
        }
        System.out.println("G");
    }
}
