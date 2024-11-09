package com.brandoniscoding.algorithms;

import static com.brandoniscoding.utils.ArrayUtils.swap;

public class QuickSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    public QuickSort() {}

    @Override
    public void sort(T[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(T[] array, int start, int end) {
        if (start < end) { // Check if the subarray is valid
            int pivotIndex = partition(array, start, end);

            // Sort the subarrays
            quickSort(array, start, pivotIndex - 1); // Left part
            quickSort(array, pivotIndex + 1, end);   // Right part
        }
    }

    private int partition(T[] array, int start, int end) {
        T pivot = array[end]; // Choose the last element as the pivot
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j].compareTo(pivot) < 0) { // Compare with the pivot
                i++;
                swap(array, i, j); // Swap elements
            }
        }

        swap(array, i + 1, end); // Place the pivot at its correct position
        return i + 1; // Index of the pivot
    }

    @Override
    public String getDescription() {
        return "Quick Sort Algorithm: A divide-and-conquer sorting algorithm.\n\n" +
               "Algorithm Steps:\n" +
               "1. **Choose a pivot element**: Select an element from the array to be the pivot.\n" +
               "2. **Partition the array**: Rearrange the array such that all elements less than the pivot are on the left, and all elements greater than the pivot are on the right.\n" +
               "3. **Place the pivot**: Move the pivot to its correct position in the sorted array (i.e., all elements on the left are smaller, and all elements on the right are larger).\n" +
               "4. **Recursively apply to sub-arrays**: Apply the same process to the sub-arrays on the left and right of the pivot until the entire array is sorted.\n" +
               "5. **Repeat the process**: Continue recursively dividing the array and sorting each sub-array until the array is fully sorted.\n\n" +
               "Time Complexity:\n" +
               " - Worst case: O(n^2), when the pivot selection leads to unbalanced partitions (e.g., when the array is already sorted or contains many equal elements).\n" +
               " - Best and average case: O(n log n), when the pivot divides the array into approximately equal parts, providing optimal partitioning and recursive depth.\n\n" +
               "Space Complexity:\n" +
               " - O(log n) on average for the recursive stack (due to the depth of the recursive calls).\n" +
               " - In the worst case, O(n) if the recursion depth reaches its maximum (for unbalanced partitions).";
    }
    
}
