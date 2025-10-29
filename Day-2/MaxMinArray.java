public class MaxMinArray {
    public static void main(String[] args) {
        int[] arr = {45, 12, 89, 33, 7};
        int max = arr[0], min = arr[0];

        for (int n : arr) {
            if (n > max) max = n;
            if (n < min) min = n;
        }

        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
