package com.brandoniscoding.algorithms;

/**
 * Common interface for sorting algorithms.
 * <p>
 * This interface defines the contract for sorting algorithms, requiring the implementation of 
 * a method to sort an array of integers and a method to provide a description of the algorithm.
 * </p>
 */
public interface SortAlgorithm {

    /**
     * Sorts the specified array of integers in ascending order.
     * 
     * @param array the array of integers to be sorted.
     *              This method modifies the input array in place, meaning the original 
     *              array will be sorted without the need for additional storage.
     */
    void sort(int[] array);

    /**
     * Returns a description of the sorting algorithm.
     * 
     * @return a string describing the algorithm, including its characteristics and complexities.
     */
    String getDescription();
}
