package Array;

public class FindElementIndex {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int target = 30;

        int index = findIndex(arr, target);

        if (index != -1) {
            System.out.println("The target element " + target + " is found at index " + index);
        } else {
            System.out.println("The target element " + target + " is not found in the array.");
        }
    }

    // Function to find the index of an element in an array
    static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index when the target is found
            }
        }
        return -1; // Return -1 if the target is not found in the array
    }
}
