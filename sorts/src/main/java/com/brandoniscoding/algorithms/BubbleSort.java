package com.brandoniscoding.algorithms;

import static com.brandoniscoding.utils.ArrayUtils.swap;

public class BubbleSort implements SortAlgorithm {


    public BubbleSort() {}

    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j + 1, j);
                }
            }
        }
    }

    @Override
    public String getDescription() {
        return "Bubble Sort: A comparison-based sorting algorithm with a time complexity of O(n^2) for unsorted inputs, "
               + "suitable for small datasets.";
    }
}
