package com.brandoniscoding.algorithms;

public class InsertionSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    public InsertionSort() {}

    @Override
    public void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            T current = array[i]; // Current element to be inserted
            int j = i - 1;

            // Compare current element with the sorted part of the array
            while (j >= 0 && array[j].compareTo(current) > 0) {
                array[j + 1] = array[j]; // Shift elements to the right
                j = j - 1;
            }

            array[j + 1] = current; // Insert the current element at its correct position
        }
    }

    @Override
    public String getDescription() {
        return "Insertion Sort Algorithm: A comparison-based sorting algorithm.\n\n" +
            "Algorithm Steps:\n" +
            "1. **Start with the second element**: Begin traversing the array from the second element (index 1) because the first element is trivially sorted.\n" +
            "2. **Compare with the sorted portion**: At each iteration, compare the current element with the previous elements in the already sorted part of the array.\n" +
            "3. **Find the correct position**: If the current element is smaller than the compared element, shift the larger elements one position to the right to make space.\n" +
            "4. **Insert the current element**: Place the current element at its correct position in the sorted part.\n" +
            "5. **Repeat for the next elements**: Move to the next element and repeat the process until the entire array is sorted.\n\n" +
            "Time Complexity:\n" +
            " - Worst case: O(n^2), when the array is in reverse order and each insertion requires shifting all previous elements.\n" +
            " - Best case: O(n), when the array is already nearly sorted (only small shifts are required).\n" +
            " - Average case: O(n^2), for random inputs, as each insertion may require shifting multiple elements.\n\n" +
            "Space Complexity:\n" +
            " - O(1), as the algorithm is performed in-place, requiring no extra space beyond a constant amount for temporary variables like the current element.";
}

    
}
