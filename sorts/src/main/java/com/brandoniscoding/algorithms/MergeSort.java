package com.brandoniscoding.algorithms;

import java.util.Arrays;

public class MergeSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    public MergeSort() {}

    @Override
    public void sort(T[] array) {
        if (array.length > 1) {
            // Split the array into two halves
            int mid = array.length / 2;

            T[] left = Arrays.copyOf(array, mid);
            T[] right = Arrays.copyOfRange(array, mid, array.length);

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            // Recursively sort the subarrays
            sort(left);
            sort(right);

            // Merge the subarrays
            merge(array, left, right);
        }
    }

    private void merge(T[] array, T[] left, T[] right) {
        int i = 0, j = 0, k = 0;

        // Merge elements from the subarrays
        while (i < left.length && j < right.length) {
            if (left[i].compareTo(right[j]) <= 0) {
                array[k] = left[i];
                i++;
            } else {
                array[k] = right[j];
                j++;
            }
            k++;
        }

        // Copy any remaining elements from the left subarray (if any)
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }

        // Copy any remaining elements from the right subarray (if any)
        while (j < right.length) {
            array[k] = right[j];
            j++;
            k++;
        }
    }

    @Override
    public String getDescription() {
        return "Merge Sort Algorithm: A comparison-based divide-and-conquer sorting algorithm.\n\n" +
               "Algorithm Steps:\n" +
               "1. **Divide**: Recursively divide the array into two halves. Each subarray is further divided until each subarray contains only one element.\n" +
               "   - If the array has an odd number of elements, one of the halves will contain one more element than the other.\n" +
               "   - This process continues until each subarray consists of a single element (which is trivially sorted).\n" +
               "2. **Conquer**: Merge the subarrays. Starting from the smallest subarrays (those with one element), the algorithm merges pairs of subarrays in sorted order.\n" +
               "   - For each pair of subarrays, compare the elements from the two subarrays and merge them into a single sorted subarray.\n" +
               "3. **Repeat**: This merging process continues recursively, combining larger and larger subarrays into sorted arrays.\n" +
               "4. **Terminate**: The process continues until there is only one subarray left, which is the fully sorted array.\n\n" +
               "Time Complexity:\n" +
               " - Worst case: O(n log n), even if the array is in reverse order.\n" +
               " - Best case: O(n log n), the algorithm performs similarly regardless of the initial order.\n" +
               " - Average case: O(n log n), typical for random inputs.\n\n" +
               "Space Complexity:\n" +
               " - O(n), because of the additional space required for the temporary subarrays during the merge process.";
    }
}
