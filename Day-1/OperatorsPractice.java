public class OperatorsPractice {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Arithmetic: " + (a + b));
        System.out.println("Relational: " + (a > b));
        System.out.println("Logical: " + ((a > 5) && (b < 10)));
        
        a += 5;  // assignment operator
        System.out.println("After assignment: " + a);
    }
}
