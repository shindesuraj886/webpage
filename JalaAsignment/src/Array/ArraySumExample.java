package Array;

public class ArraySumExample {
    // Function to calculate the sum of integer values in an array
    static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Call the sumArray function to calculate the sum
        int result = sumArray(numbers);

        System.out.println("Sum of the array elements is: " + result);
    }
}