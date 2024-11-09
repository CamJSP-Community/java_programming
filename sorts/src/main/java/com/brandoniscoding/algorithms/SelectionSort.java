package com.brandoniscoding.algorithms;

import static com.brandoniscoding.utils.ArrayUtils.swap;

public class SelectionSort<T extends Comparable<T>> implements SortAlgorithm<T> {

    public SelectionSort() {}

    @Override
    public void sort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(array[min]) < 0) { // Compare elements
                    min = j;
                }
            }
            swap(array, min, i); // Swap the smallest element with the first unsorted element
        }
    }

    @Override
    public String getDescription() {
        return "Selection Sort Algorithm: A comparison-based sorting algorithm.\n\n" +
               "Algorithm Steps:\n" +
               "1. **Divide the array**: The array is conceptually divided into two parts: the sorted part (initially empty) and the unsorted part (which contains the entire array).\n" +
               "2. **Find the smallest element**: The algorithm repeatedly selects the smallest element from the unsorted part of the array.\n" +
               "3. **Swap with the leftmost unsorted element**: Once the smallest element is found, it is swapped with the leftmost unsorted element, thus expanding the sorted part by one element.\n" +
               "4. **Repeat the process**: This process is repeated until all elements are sorted, with the unsorted part gradually shrinking.\n\n" +
               "Time Complexity:\n" +

               " - Worst case: O(n^2), when the array is in reverse order, because it requires " +//+
               "n(n-1)/2 comparisons and swaps.\n" +
               " - Best case: O(n^2), because the algorithm always performs the same number of comparisons regardless of the initial order of the array (the number of comparisons does not change).\n" +
               " - Average case: O(n^2), as the algorithm makes the same number of comparisons even for random inputs.\n\n" +
               "Space Complexity:\n" +
               " - O(1), as the selection sort algorithm sorts the array in place and requires no extra space beyond the input array.";
    }
    
}
