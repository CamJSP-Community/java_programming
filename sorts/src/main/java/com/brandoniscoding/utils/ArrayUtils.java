package com.brandoniscoding.utils;

/**
 * Utility class for managing arrays.
 * <p>
 * This class provides various utility methods for array manipulation, 
 * such as printing the contents of an integer array.
 * </p>
 */
public class ArrayUtils {

    /**
     * Prints the contents of the specified array.
     * 
     * @param array the array of integers to be printed.
     *              Each element will be displayed followed by a space.
     */
    public static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
