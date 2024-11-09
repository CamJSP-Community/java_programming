package com.brandoniscoding.utils;

public class ArrayUtils<T extends Comparable<T>> {

    // Generic method to print an array of objects of type T
    public static <T> void printArray(T[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Generic method to swap two elements in an array of type T
    public static <T> void swap(T[] array, int i, int j) { 
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
