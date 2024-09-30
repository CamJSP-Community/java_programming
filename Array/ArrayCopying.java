// ArrayCopying.java – Demonstrates different ways to copy an array in Java.

import java.util.Arrays;

public class ArrayCopying {

    public static void main(String[] args) {
        
        // 1. Original array
        int[] originalArray = {10, 20, 30, 40, 50};
        System.out.println("Original array: " + Arrays.toString(originalArray));

        // 2. Copying using a loop
        System.out.println("\n=== Copying using a manual loop ===");
        int[] copiedArray1 = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            copiedArray1[i] = originalArray[i];
        }
        System.out.println("Copied array using loop: " + Arrays.toString(copiedArray1));

        // 3. Copying using System.arraycopy()
        System.out.println("\n=== Copying using System.arraycopy() ===");
        int[] copiedArray2 = new int[originalArray.length];
        System.arraycopy(originalArray, 0, copiedArray2, 0, originalArray.length);
        System.out.println("Copied array using System.arraycopy(): " + Arrays.toString(copiedArray2));

        // 4. Copying using Arrays.copyOf()
        System.out.println("\n=== Copying using Arrays.copyOf() ===");
        int[] copiedArray3 = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("Copied array using Arrays.copyOf(): " + Arrays.toString(copiedArray3));

        // 5. Copying using clone()
        System.out.println("\n=== Copying using clone() ===");
        int[] copiedArray4 = originalArray.clone();
        System.out.println("Copied array using clone(): " + Arrays.toString(copiedArray4));

        // 6. Partial array copying with Arrays.copyOfRange()
        System.out.println("\n=== Partial array copy using Arrays.copyOfRange() ===");
        int[] partialCopy = Arrays.copyOfRange(originalArray, 1, 4); // Copy elements from index 1 to 3 (exclusive 4)
        System.out.println("Partial copy (indexes 1 to 3): " + Arrays.toString(partialCopy));

        // 7. Performance comparison
        System.out.println("\n=== Performance Considerations ===");
        /*
         * Manual loop:
         *    - Flexible, can copy selected parts of the array.
         *    - Might be slower compared to built-in methods, especially for large arrays.
         * 
         * System.arraycopy():
         *    - Native method, very fast and efficient.
         *    - Can be used to copy parts of arrays or entire arrays.
         * 
         * Arrays.copyOf() and Arrays.copyOfRange():
         *    - More modern and user-friendly approach.
         *    - Suitable for creating new arrays with potentially different lengths.
         * 
         * clone():
         *    - Creates a shallow copy of the array.
         *    - Simple and fast but limited to creating a full copy of the array.
         */
    }
}
