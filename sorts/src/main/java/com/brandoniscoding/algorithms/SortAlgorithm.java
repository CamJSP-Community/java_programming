package com.brandoniscoding.algorithms;

/**
 * Common interface for sorting algorithms.
 * <p>
 * This interface defines the contract for sorting algorithms, requiring the implementation of 
 * a method to sort an array of integers and a method to provide a description of the algorithm.
 * </p>
 */
public interface SortAlgorithm {

    void sort(int[] array);
    
    String getDescription();
}
