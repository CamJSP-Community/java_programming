// ArrayInitialization.java
// This class demonstrates the different ways to initialize arrays and ArrayLists in Java,
// highlighting their differences and performance considerations.

import java.util.ArrayList;
import java.util.Arrays;

class ArrayInitialization {

    public static void main(String[] args) {

        // 1. Static Array Initialization
        int[] staticArray = {0, 1, 2, 3, 4}; // Static size of 5
        System.out.println("Static Array Initialization:");
        printArray(staticArray); // Print staticArray

        // 2. Dynamic Array Initialization
        int[] dynamicArray = new int[5];
        dynamicArray[0] = 6;
        dynamicArray[1] = 7;
        dynamicArray[2] = 8;
        dynamicArray[3] = 9;
        dynamicArray[4] = 10;
        System.out.println("\nDynamic Array Initialization:");
        printArray(dynamicArray); // Print dynamicArray

        // 3. Using Arrays.fill() Method
        int[] fillArray = new int[5];
        Arrays.fill(fillArray, 11); // Fill array with 11
        System.out.println("\nArray filled with Arrays.fill():");
        printArray(fillArray); // Print fillArray

        // 4. Anonymous Array Initialization
        System.out.println("\nAnonymous Array:");
        printArray(new int[]{12, 13, 14, 15, 16}); // Array created directly

        // 5. ArrayList Initialization and Methods
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(20, 30, 40, 50, 60));
        System.out.println("\nArrayList Initialization with values:");
        System.out.println(arrayList); // Print ArrayList

        // Adding elements
        arrayList.add(70);
        System.out.println("\nArrayList after adding element 70:");
        System.out.println(arrayList);

        // Removing elements
        arrayList.remove(Integer.valueOf(30)); // Removes the first occurrence of the element 30
        System.out.println("\nArrayList after removing element 30:");
        System.out.println(arrayList);

        // Accessing elements
        System.out.println("\nElement at index 2 in ArrayList:");
        System.out.println(arrayList.get(2)); // Print element at index 2

        // Final comments on differences between these initialization methods
        /*
         * Difference and Efficiency:
         * 
         * 1. Static Array Initialization:
         *      - Concise and intuitive when you know the values at compile time.
         *      - Fixed size with direct assignment during declaration.
         *      - Efficient for predefined values but lacks flexibility.
         *  
         * 2. Dynamic Array Initialization:
         *      - Useful when array size is known, but values are assigned later.
         *      - Requires more code but allows flexible value assignment.
         *      - May be less efficient as values are added one by one.
         *      
         * 3. Arrays.fill():
         *      - Ideal for initializing an array with the same value in all positions.
         *      - Quick and efficient for uniform initialization.
         *      - Avoids repetitive assignments.
         * 
         * 4. Anonymous Array:
         *      - No reference is created, used for one-time operations.
         *      - Saves memory but is not reusable.
         * 
         * 5. ArrayList Initialization and Methods:
         *      - Flexible and resizable, suitable for dynamic content.
         *      - Methods like add(), remove(), and get() provide extensive functionality.
         *      - More memory overhead compared to static arrays due to resizing and internal storage management.
         *      - Access by index is O(1), but adding/removing elements involves overhead.
         */
    }

    // Helper method to print static arrays
    public static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}