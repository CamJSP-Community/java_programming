package com.brandoniscoding.algorithms;

public interface SortAlgorithm<T extends Comparable<T>> {

    // Method to sort an array
    void sort(T[] array);
    
    // Method to get the description of the sorting algorithm
    String getDescription();
}
