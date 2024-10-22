package com.brandoniscoding.algorithms;

public class SelectionSort implements SortAlgorithm{

    public SelectionSort() {};

    @Override
    public void sort(int[] array){
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if ( array[j] < array[min] ){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }

    @Override
    public String getDescription() {
        return "The selection sort works as follows:\n" +
               "1. The array is divided into two parts: the sorted part and the unsorted part.\n" +
               "2. The algorithm repeatedly selects the smallest element from the unsorted part and swaps it with the leftmost unsorted element, moving the boundary of the sorted part by one.\n" +
               "3. This process continues until the entire array is sorted.\n" +
               "Time complexity: O(n^2) in the worst, best, and average cases.";
    }
}
