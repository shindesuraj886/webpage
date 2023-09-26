package Array;
import java.util.Arrays;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] originalArray = {10, 20, 30, 40, 50};
        int elementToRemove = 30;

        int[] newArray = removeElement(originalArray, elementToRemove);

        System.out.println("Original Array: " + Arrays.toString(originalArray));
        System.out.println("Element to Remove: " + elementToRemove);
        System.out.println("Array after removal: " + Arrays.toString(newArray));
    }

    // Function to remove a specific element from an array
    static int[] removeElement(int[] arr, int element) {
        int length = arr.length;
        int[] result = new int[length - 1];
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (arr[i] != element) {
                result[index++] = arr[i];
            }
        }

        return result;
    }
}
