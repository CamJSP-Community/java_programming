package com.brandoniscoding.algorithms;

/**
 * Bubble Sort Algorithm.
 * <p>
 * This class provides an implementation of the Bubble Sort algorithm, a straightforward comparison-based sorting method. 
 * The algorithm repeatedly traverses the list, comparing adjacent elements and swapping them if they are in the wrong order. 
 * This process is repeated until the entire list is sorted.
 * </p>
 * 
 * <strong>Time Complexity:</strong>
 * <ul>
 *   <li><strong>Best Case:</strong> O(n) (when the array is already sorted)</li>
 *   <li><strong>Average Case:</strong> O(n<sup>2</sup>)</li>
 *   <li><strong>Worst Case:</strong> O(n<sup>2</sup>)</li>
 * </ul>
 * 
 * <strong>Space Complexity:</strong>
 * <p>
 * O(1) - This algorithm sorts the array in place, using no additional space aside from the input array.
 * </p>
 * 
 * <p>
 * Although Bubble Sort is easy to implement and understand, it is not efficient for large datasets. 
 * More advanced sorting algorithms such as Merge Sort or Quick Sort are generally preferred.
 * </p>
 * 
 * <strong>Usage:</strong>
 * <pre>
 *     int[] array = {5, 1, 4, 2, 8};
 *     SortAlgorithm bubbleSort = new BubbleSort();
 *     bubbleSort.sort(array);
 * </pre>
 * <p>
 * The above code snippet demonstrates how to sort an array in ascending order using the Bubble Sort algorithm.
 * </p>
 * 
 * <strong>Notes:</strong>
 * <p>
 * This implementation adheres to the {@link SortAlgorithm} interface, allowing for consistent integration with other sorting strategies.
 * </p>
 * 
 * @author Brandon Kamga
 * @version 1.0
 * @since 2024
 */
public class BubbleSort implements SortAlgorithm {

    /**
     * Default constructor for BubbleSort.
     */
    public BubbleSort() {
        // Default constructor
    }

    /**
     * Sorts the provided array in ascending order using the Bubble Sort algorithm.
     * 
     * @param array the array of integers to be sorted.
     *              This method modifies the input array in place, meaning the original array will be sorted 
     *              without the need for additional storage.
     */
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap array[j] and array[j + 1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    /**
     * Provides a brief description of the Bubble Sort algorithm.
     * 
     * @return a string that describes the sorting algorithm, including its complexity.
     */
    @Override
    public String getDescription() {
        return "Bubble Sort: A comparison-based sorting algorithm with a time complexity of O(n^2) for unsorted inputs, "
               + "suitable for small datasets.";
    }
}
