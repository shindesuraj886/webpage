package Array;

public class ArrayAverageExample {
    // Function to calculate the average value of an array of integers
    static double calculateAverage(int[] arr) {
        if (arr.length == 0) {
            return 0.0; // Handle the case of an empty array
        }
        
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        
        return (double) sum / arr.length;
    }

    public static void main(String[] args) {
        // Example array
        int[] numbers = {1, 2, 3, 4, 5};

        // Call the calculateAverage function to calculate the average
        double result = calculateAverage(numbers);

        System.out.println("Average of the array elements is: " + result);
    }
}
