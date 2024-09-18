// Array Sorting Demonstration
/*
 * This file demonstrates various sorting algorithms for arrays in Java.
 * It includes built-in sorting using Arrays.sort(), Bubble Sort, Quick Sort, and Merge Sort.
 * The performance and use cases for each algorithm are also discussed.
 */

 import java.util.Arrays;

 public class ArraySorting {
 
     public static void main(String[] args) {
 
         // Sample array for sorting
         int[] array = {64, 34, 25, 12, 22, 11, 90};
 
         // 1. Built-in Sorting using Arrays.sort()
         System.out.println("=== Sorting using Arrays.sort() ===");
         int[] sortedArray = array.clone();  // Clone to avoid modifying the original array
         Arrays.sort(sortedArray);
         System.out.println("Sorted Array (Arrays.sort()): " + Arrays.toString(sortedArray));
 
         // 2. Bubble Sort
         System.out.println("\n=== Bubble Sort ===");
         int[] bubbleSortedArray = array.clone();
         bubbleSort(bubbleSortedArray);
         System.out.println("Sorted Array (Bubble Sort): " + Arrays.toString(bubbleSortedArray));
 
         // 3. Quick Sort
         System.out.println("\n=== Quick Sort ===");
         int[] quickSortedArray = array.clone();
         quickSort(quickSortedArray, 0, quickSortedArray.length - 1);
         System.out.println("Sorted Array (Quick Sort): " + Arrays.toString(quickSortedArray));
 
         // 4. Merge Sort
         System.out.println("\n=== Merge Sort ===");
         int[] mergeSortedArray = array.clone();
         mergeSort(mergeSortedArray, 0, mergeSortedArray.length - 1);
         System.out.println("Sorted Array (Merge Sort): " + Arrays.toString(mergeSortedArray));
     }

    /*
    * General Comparison of Sorting Algorithms:
    *
    * 1. Arrays.sort():
    *    - Built-in Java method.
    *    - Efficient for most cases due to the use of highly optimized Dual-Pivot QuickSort for primitive types
    *      and TimSort (a hybrid sorting algorithm) for objects.
    *    - Time complexity: O(n log n) on average, which is optimal for general-purpose sorting.
    *    - Recommended when you don't need to implement your own sorting logic.
    * 
    * 2. Bubble Sort:
    *    - Simple and easy to understand, but very inefficient for large arrays.
    *    - Time complexity: O(n^2) in the worst and average cases, making it impractical for most real-world applications.
    *    - Only suitable for small datasets or for educational purposes to understand the basics of sorting algorithms.
    *    - Optimization: You can stop the algorithm if no elements were swapped during a pass, meaning the array is already sorted.
    * 
    * 3. Quick Sort:
    *    - Highly efficient and widely used sorting algorithm.
    *    - Time complexity: O(n log n) on average, but O(n^2) in the worst case (which can be mitigated by using random pivot selection).
    *    - Best used when space is limited, as QuickSort is an **in-place sorting algorithm** (it doesn't require additional memory).
    *    - Not stable, meaning that it doesn't necessarily preserve the relative order of equal elements.
    * 
    * 4. Merge Sort:
    *    - Time complexity: O(n log n) for all cases (best, average, and worst), making it very reliable.
    *    - However, it requires additional memory for the temporary arrays used during the merging process, which can be a drawback for large datasets.
    *    - Merge Sort is **stable**, meaning that it maintains the relative order of equal elements, which is crucial in some scenarios.
    *    - It is often preferred for sorting linked lists, where the extra memory overhead is not as much of a concern.
    * 
    * When to Use:
    * - Use `Arrays.sort()` when you want a quick and reliable solution without needing to implement your own algorithm.
    * - Use **Bubble Sort** for small arrays or for educational purposes.
    * - Use **Quick Sort** when you need an efficient in-place sorting algorithm, but be cautious of its O(n^2) worst-case scenario (which is rare).
    * - Use **Merge Sort** when you need guaranteed O(n log n) performance or when you need a stable sorting algorithm for objects.
    *
    * Conclusion:
    * - Sorting is a fundamental operation in programming, and choosing the right sorting algorithm depends on the specific constraints of your problem.
    * - Built-in methods like `Arrays.sort()` are usually the best choice for general-purpose use, while understanding the mechanics of algorithms like Quick Sort and Merge Sort can help optimize performance in specialized scenarios.
    */

 
     // 2. Bubble Sort Algorithm
     public static void bubbleSort(int[] array) {
         int n = array.length;
         boolean swapped;
         for (int i = 0; i < n - 1; i++) {
             swapped = false;
             for (int j = 0; j < n - i - 1; j++) {
                 if (array[j] > array[j + 1]) {
                     // Swap array[j] and array[j+1]
                     int temp = array[j];
                     array[j] = array[j + 1];
                     array[j + 1] = temp;
                     swapped = true;
                 }
             }
             // If no elements were swapped, array is already sorted
             if (!swapped) break;
         }
     }
 
     // 3. Quick Sort Algorithm
     public static void quickSort(int[] array, int low, int high) {
         if (low < high) {
             // Find pivot element so that elements smaller than pivot are on the left,
             // and elements greater than pivot are on the right
             int pi = partition(array, low, high);
 
             // Recursively sort elements before and after the partition
             quickSort(array, low, pi - 1);
             quickSort(array, pi + 1, high);
         }
     }
 
     // Partition method for Quick Sort
     public static int partition(int[] array, int low, int high) {
         int pivot = array[high];
         int i = (low - 1); // Index of smaller element
         for (int j = low; j < high; j++) {
             // If current element is smaller than or equal to pivot
             if (array[j] <= pivot) {
                 i++;
 
                 // Swap array[i] and array[j]
                 int temp = array[i];
                 array[i] = array[j];
                 array[j] = temp;
             }
         }
 
         // Swap array[i+1] and array[high] (or pivot)
         int temp = array[i + 1];
         array[i + 1] = array[high];
         array[high] = temp;
 
         return i + 1;
     }
 
     // 4. Merge Sort Algorithm
     public static void mergeSort(int[] array, int left, int right) {
         if (left < right) {
             // Find the middle point
             int mid = (left + right) / 2;
 
             // Sort first and second halves
             mergeSort(array, left, mid);
             mergeSort(array, mid + 1, right);
 
             // Merge the sorted halves
             merge(array, left, mid, right);
         }
     }
 
     // Merge two subarrays of array[]
     // First subarray is array[left..mid]
     // Second subarray is array[mid+1..right]
     public static void merge(int[] array, int left, int mid, int right) {
         // Find sizes of two subarrays to be merged
         int n1 = mid - left + 1;
         int n2 = right - mid;
 
         // Create temp arrays
         int[] L = new int[n1];
         int[] R = new int[n2];
 
         // Copy data to temp arrays L[] and R[]
         System.arraycopy(array, left, L, 0, n1);
         System.arraycopy(array, mid + 1, R, 0, n2);
 
         // Merge the temp arrays back into array[left..right]
 
         // Initial indexes of first and second subarrays
         int i = 0, j = 0;
 
         // Initial index of merged subarray array[]
         int k = left;
         while (i < n1 && j < n2) {
             if (L[i] <= R[j]) {
                 array[k] = L[i];
                 i++;
             } else {
                 array[k] = R[j];
                 j++;
             }
             k++;
         }
 
         // Copy remaining elements of L[], if any
         while (i < n1) {
             array[k] = L[i];
             i++;
             k++;
         }
 
         // Copy remaining elements of R[], if any
         while (j < n2) {
             array[k] = R[j];
             j++;
             k++;
         }
     }
 }
 