public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int sum = 0;

        for (int n : numbers)
            sum += n;

        double avg = (double) sum / numbers.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + avg);
    }
}
