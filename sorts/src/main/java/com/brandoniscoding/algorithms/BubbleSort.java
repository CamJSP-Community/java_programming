package com.brandoniscoding.algorithms;

import static com.brandoniscoding.utils.ArrayUtils.swap;

public class BubbleSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    public BubbleSort() {}

    @Override
    public void sort(T[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) { // Compare elements and swap if needed
                    swap(array, j, j + 1); // Swap elements
                }
            }
        }
    }

    @Override
    public String getDescription() {
        return "Bubble Sort Algorithm: A comparison-based sorting algorithm.\n\n" +
               "Algorithm Steps:\n" +
               "1. **Start at the first element**: Begin at the first element of the array.\n" +
               "2. **Compare adjacent elements**: Compare the current element with the next one.\n" +
               "3. **Swap if needed**: If the current element is greater than the next, swap them.\n" +
               "4. **Move to the next element**: Move to the next element and repeat the comparison and swap process until the end of the array.\n" +
               "5. **Bubble the largest element**: After each pass through the array, the largest unsorted element is 'bubbled' to its correct position.\n" +
               "6. **Repeat the process**: Repeat steps 1-5 for the remaining unsorted portion of the array.\n" +
               "7. **Stop when no swaps are needed**: The algorithm finishes when no more swaps are made, meaning the array is sorted.\n\n" +
               "Time Complexity:\n" +
               " - Worst case: O(n^2), when the array is in reverse order and each element must be swapped during every pass.\n" +
               " - Best case: O(n), when the array is already sorted (optimized version where we track if swaps occurred).\n" +
               " - Average case: O(n^2), for random inputs, as each pass through the array requires comparing and potentially swapping adjacent elements.\n\n" +
               "Space Complexity:\n" +
               " - O(1), as the algorithm is performed in-place, requiring no additional memory beyond a constant amount for temporary variables.";
    }
    

}
