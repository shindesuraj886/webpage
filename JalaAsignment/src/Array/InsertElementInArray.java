package Array;

import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int elementToInsert = 25;
        int positionToInsert = 2; // Insert at index 2 (0-based)

        int[] newArray = insertElement(originalArray, elementToInsert, positionToInsert);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Element to Insert: " + elementToInsert);
        System.out.println("Position to Insert: " + positionToInsert);
        System.out.println("Array after insertion: " + Arrays.toString(newArray));
    }

    // Function to insert an element at a specific position in an array
    static int[] insertElement(int[] arr, int element, int position) {
        int length = arr.length;
        int[] result = new int[length + 1];

        for (int i = 0, j = 0; i < result.length; i++) {
            if (i == position) {
                result[i] = element;
            } else {
                result[i] = arr[j++];
            }
        }

        return result;
    }
}
