package com.brandoniscoding.algorithms;

import static com.brandoniscoding.utils.ArrayUtils.swap;

public class QuickSort implements SortAlgorithm {

    public QuickSort() {}

    @Override
    public void sort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    private void quickSort(int[] array, int start, int end) {
        if (start < end) { // Vérifiez que la sous-partie est valide
            int pivotIndex = partition(array, start, end);

            // Trier les sous-tableaux
            quickSort(array, start, pivotIndex - 1); // Partie gauche
            quickSort(array, pivotIndex + 1, end);   // Partie droite
        }
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end]; // Choisir le dernier élément comme pivot
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] < pivot) {
                i++;
                swap(array, i, j); // Échanger les éléments
            }
        }

        swap(array, i + 1, end); // Placer le pivot à sa position correcte
        return i + 1; // Indice du pivot
    }

    @Override
    public String getDescription() {
        return "The quick sort works as follows:\n" +
               "1. A pivot element is selected from the array.\n" +
               "2. The array is partitioned into two sub-arrays: elements less than the pivot and elements greater than the pivot.\n" +
               "3. The pivot is placed in its correct position in the sorted array.\n" +
               "4. The process is recursively repeated for the sub-arrays until the entire array is sorted.\n" +
               "Time complexity: O(n log n) on average, O(n^2) in the worst case.";
    }
}
