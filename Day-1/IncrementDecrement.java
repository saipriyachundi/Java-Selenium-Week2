public class IncrementDecrement {
    public static void main(String[] args) {
        int x = 5;
        System.out.println("Initial x: " + x);
        System.out.println("Pre-increment: " + (++x)); // increases first
        System.out.println("Post-increment: " + (x++)); // prints, then increases
        System.out.println("After post: " + x);
        System.out.println("Pre-decrement: " + (--x));
        System.out.println("Post-decrement: " + (x--));
        System.out.println("Final value: " + x);
    }
}
