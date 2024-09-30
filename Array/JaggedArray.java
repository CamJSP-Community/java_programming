// JaggedArray.java – Demonstrates how to work with jagged arrays in Java.

public class JaggedArray {

    public static void main(String[] args) {
        
        // 1. Declaration and initialization of a jagged array
        // A jagged array is an array of arrays where each "row" can have different lengths.
        int[][] jaggedArray = new int[3][];

        // Initialize each row with different lengths
        jaggedArray[0] = new int[3];  // 3 elements in the first row
        jaggedArray[1] = new int[2];  // 2 elements in the second row
        jaggedArray[2] = new int[4];  // 4 elements in the third row

        // 2. Filling the jagged array with values
        jaggedArray[0][0] = 1;
        jaggedArray[0][1] = 2;
        jaggedArray[0][2] = 3;

        jaggedArray[1][0] = 4;
        jaggedArray[1][1] = 5;

        jaggedArray[2][0] = 6;
        jaggedArray[2][1] = 7;
        jaggedArray[2][2] = 8;
        jaggedArray[2][3] = 9;

        // 3. Traversing and printing the jagged array
        System.out.println("=== Jagged Array ===");
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next line after printing each row
        }

        // 4. Dynamically adjusting a jagged array row length
        System.out.println("\n=== Modifying the second row to have 5 elements ===");
        jaggedArray[1] = new int[5]; // Re-sizing the second row to hold 5 elements

        // Filling the newly resized second row
        jaggedArray[1][0] = 10;
        jaggedArray[1][1] = 11;
        jaggedArray[1][2] = 12;
        jaggedArray[1][3] = 13;
        jaggedArray[1][4] = 14;

        // Print the modified array
        for (int i = 0; i < jaggedArray.length; i++) {
            System.out.println("Row " + (i + 1) + ":");
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // 5. Performance considerations
        /*
         * Jagged arrays offer flexibility where each row can have a different length.
         * This allows efficient memory usage in cases where the data structure doesn't need uniformity in dimensions.
         * 
         * However, jagged arrays can be slightly slower to access compared to regular 2D arrays because they add an extra level of indirection.
         * They are most useful when row sizes vary significantly, making regular 2D arrays inefficient in terms of memory usage.
         */
    }
}
