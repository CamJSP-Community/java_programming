public class QuickSort {

    // Partition the array by placing the pivot in its correct position
    // and moving smaller elements to the left and larger ones to the right.
    public static int partition(int[] T, int begin, int end) {
        int pivot = T[end]; // Pivot is chosen as the last element.
        int i = begin - 1;  // Index of smaller elements.

        for (int j = begin; j < end; j++) { // Traverse elements before the pivot.
            if (T[j] < pivot) {
                i++;
                swap(T, i, j); // Swap mispositioned elements.
            }
        }

        // Place the pivot in its final position.
        swap(T, i + 1, end);
        return i + 1;
    }

    // Sort the array using the QuickSort algorithm recursively.
    public static void quickSort(int[] T, int begin, int end) {
        if (begin < end) { // Base condition for recursion.
            int pivotIndex = partition(T, begin, end); // Partition the array.
            quickSort(T, begin, pivotIndex - 1); // Sort left part.
            quickSort(T, pivotIndex + 1, end); // Sort right part.
        }
    }

    // Swap the values of two indices in the array.
    public static void swap(int[] T, int a, int b) {
        int temp = T[a];
        T[a] = T[b];
        T[b] = temp;
    }

    // Main method to test QuickSort.
    public static void main(String[] args) {
        int[] array = {10, 7, 8, 9, 1, 5}; // Example array to sort.
        int n = array.length;

        System.out.println("Initial array: ");
        printArray(array);

        quickSort(array, 0, n - 1); // Call QuickSort.

        System.out.println("Sorted array: ");
        printArray(array);
    }

    // Print the contents of an array.
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
