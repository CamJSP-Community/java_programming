// ArrayReverse.java 
// Demonstrates different methods to reverse an array in Java.

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverse {

    public static void main(String[] args) {
        
        // 1. Reverse a static array (using a traditional loop)
        int[] array = {1, 2, 3, 4, 5};

        System.out.println("Original Array: " + Arrays.toString(array));

        // Method 1: Using a traditional loop
        reverseArrayTraditional(array);
        System.out.println("Reversed Array (Traditional loop): " + Arrays.toString(array));

        // 2. Reverse an array using the Collections.reverse() method (for Object arrays)
        Integer[] objectArray = {10, 20, 30, 40, 50};
        System.out.println("\nOriginal Object Array: " + Arrays.toString(objectArray));

        reverseArrayWithCollections(objectArray);
        System.out.println("Reversed Object Array (Collections.reverse()): " + Arrays.toString(objectArray));

        // 3. Reverse an array using recursion
        int[] arrayRecursive = {6, 7, 8, 9, 10};
        System.out.println("\nOriginal Array for Recursion: " + Arrays.toString(arrayRecursive));

        reverseArrayRecursively(arrayRecursive, 0, arrayRecursive.length - 1);
        System.out.println("Reversed Array (Recursion): " + Arrays.toString(arrayRecursive));

        // 4. Performance considerations and conclusions
        /*
         * 1. Traditional loop:
         *    - Time complexity: O(n)
         *    - Space complexity: O(1), in-place reversal without extra space.
         * 
         * 2. Collections.reverse() (only for Object arrays):
         *    - Time complexity: O(n)
         *    - Space complexity: O(1), in-place reversal.
         *    - Requires an array of objects, so primitive arrays (like int[]) cannot use this directly.
         * 
         * 3. Recursion:
         *    - Time complexity: O(n)
         *    - Space complexity: O(n) due to recursive stack calls.
         *    - Elegant solution but less efficient than a traditional loop due to the extra memory overhead.
         */
    }

    // Method to reverse an array using a traditional loop
    public static void reverseArrayTraditional(int[] array) {
        int left = 0;
        int right = array.length - 1;
        while (left < right) {
            // Swap elements at left and right
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            // Move towards the center
            left++;
            right--;
        }
    }

    // Method to reverse an Object array using Collections.reverse()
    public static void reverseArrayWithCollections(Integer[] array) {
        Collections.reverse(Arrays.asList(array));
    }

    // Method to reverse an array using recursion
    public static void reverseArrayRecursively(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }
        // Swap elements
        int temp = array[left];
        array[left] = array[right];
        array[right] = temp;
        // Recursive call to the inner part of the array
        reverseArrayRecursively(array, left + 1, right - 1);
    }
}
