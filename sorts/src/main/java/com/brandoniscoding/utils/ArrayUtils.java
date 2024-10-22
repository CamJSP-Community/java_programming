package com.brandoniscoding.utils;

public class ArrayUtils {

    public static void printArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty or null.");
            return;
        }

        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void swap(int[] array, int i, int j) { 
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}
