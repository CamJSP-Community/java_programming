// MultiDimensionalArray.java – Demonstrates operations with multidimensional arrays in Java.

import java.util.Arrays;

public class MultiDimensionalArray {

    public static void main(String[] args) {

        // 1. Creating and initializing a 2D array (matrix)
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // 1.1 Display the 2D array (matrix)
        System.out.println("=== 2D Array (Matrix) ===");
        print2DArray(matrix);

        // 2. Creating and initializing a 3D array
        int[][][] threeDimArray = {
            { {1, 2}, {3, 4}, {5, 6} },
            { {7, 8}, {9, 10}, {11, 12} },
            { {13, 14}, {15, 16}, {17, 18} }
        };

        // 2.1 Display the 3D array
        System.out.println("\n=== 3D Array ===");
        print3DArray(threeDimArray);

        // 3. Transversing a 2D array using traditional nested loops
        System.out.println("\n=== Traversal of 2D Array (Traditional loops) ===");
        traverse2DArray(matrix);

        // 4. Modifying elements in a 2D array
        System.out.println("\n=== Modifying 2D Array ===");
        matrix[1][1] = 99; // Change the middle element
        print2DArray(matrix);

        // 5. Copying a 2D array (deep copy)
        System.out.println("\n=== Deep Copy of 2D Array ===");
        int[][] copiedMatrix = copy2DArray(matrix);
        print2DArray(copiedMatrix);

        // 6. Performance considerations of multidimensional arrays
        /*
         * 1. Multidimensional arrays (like 2D arrays) are essentially arrays of arrays in Java.
         *    They offer flexibility but can be less memory efficient compared to using flat arrays for certain use cases.
         * 
         * 2. Traversal of a multidimensional array takes O(n*m) time complexity where n is the number of rows
         *    and m is the number of columns for a 2D array. For higher dimensions, complexity grows exponentially.
         * 
         * 3. Deep copying multidimensional arrays is necessary when you want to create an entirely new copy
         *    that does not share references with the original array.
         */
    }

    // Method to print a 2D array (matrix)
    public static void print2DArray(int[][] array) {
        for (int[] row : array) {
            System.out.println(Arrays.toString(row));
        }
    }

    // Method to print a 3D array
    public static void print3DArray(int[][][] array) {
        for (int[][] matrix : array) {
            for (int[] row : matrix) {
                System.out.println(Arrays.toString(row));
            }
            System.out.println(); // Add space between 2D arrays
        }
    }

    // Method to traverse a 2D array using traditional nested loops
    public static void traverse2DArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Element at (" + i + ", " + j + "): " + array[i][j]);
            }
        }
    }

    // Method to deep copy a 2D array
    public static int[][] copy2DArray(int[][] original) {
        int[][] copy = new int[original.length][];
        for (int i = 0; i < original.length; i++) {
            copy[i] = Arrays.copyOf(original[i], original[i].length);
        }
        return copy;
    }
}
