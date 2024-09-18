// ArraySearch.java 
// Demonstrates various array search techniques: Linear Search and Binary Search.

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {
        
        // 1. Array for searching
        int[] array = {34, 7, 23, 32, 5, 62};

        // 2. Linear Search (unsorted array)
        System.out.println("=== Linear Search ===");
        int target = 23;
        int linearResult = linearSearch(array, target);
        if (linearResult != -1) {
            System.out.println("Element " + target + " found at index: " + linearResult);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        // 3. Binary Search (sorted array)
        System.out.println("\n=== Binary Search ===");
        // Array must be sorted for binary search
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        int binaryResult = binarySearch(array, target);
        if (binaryResult >= 0) {
            System.out.println("Element " + target + " found at index: " + binaryResult);
        } else {
            System.out.println("Element " + target + " not found.");
        }

        // 4. Searching in an ArrayList (dynamic array)
        System.out.println("\n=== Search in ArrayList ===");
        java.util.ArrayList<String> list = new java.util.ArrayList<>(Arrays.asList("apple", "banana", "orange", "mango"));
        String targetElement = "banana";
        int index = list.indexOf(targetElement);
        if (index != -1) {
            System.out.println("Element " + targetElement + " found at index: " + index);
        } else {
            System.out.println("Element " + targetElement + " not found.");
        }
    }

    // Linear search: iterates over each element until it finds the target
    public static int linearSearch(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    // Binary search: more efficient, but requires sorted array
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if (array[mid] == target) {
                return mid;
            }

            // If target is greater, ignore left half
            if (array[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        return -1; // Element not found
    }
}
