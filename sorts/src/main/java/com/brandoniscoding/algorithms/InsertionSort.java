package com.brandoniscoding.algorithms;

public class InsertionSort implements SortAlgorithm {

    public InsertionSort(){};

    @Override
    public void sort(int []array) {
        
        for(int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;

            while ( j >= 0 && array[j] > current) {
                array[j+1] = array[j];
                j = j - 1;
            }

            array[j + 1] = current;
        }

    }

    @Override
    public String getDescription(){

        return "The insertion sort works as follows:\n" +
        "1. The array is traversed from left to right.\n" +
        "2. At each iteration, the current element is compared to the previous elements in the sorted part of the array.\n" +
        "3. The current element is inserted into the correct position in the sorted part, by shifting larger elements to the right to make space.\n" +
        "4. This process repeats until the entire array is sorted.\n" +
        "Time complexity: O(n^2) in the worst case, but it is efficient for small arrays or arrays that are already nearly sorted.";

    }
    
}
