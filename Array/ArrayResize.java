// ArrayResize.java 
// Demonstrates resizing an array in Java using Arrays.copyOf and alternatives like ArrayList.

import java.util.Arrays;
import java.util.ArrayList;

public class ArrayResize {
    
    public static void main(String[] args) {
        
        // 1. Demonstrating resizing of a static array using Arrays.copyOf()
        int[] originalArray = {10, 20, 30, 40, 50};
        
        System.out.println("Original Array: " + Arrays.toString(originalArray));
        
        // 1.1 Resizing the array to a larger size (increasing its length to 7)
        int[] resizedArrayLarger = Arrays.copyOf(originalArray, 7);
        System.out.println("Resized Array (Larger): " + Arrays.toString(resizedArrayLarger));
        
        // Filling the newly added elements
        resizedArrayLarger[5] = 60;
        resizedArrayLarger[6] = 70;
        System.out.println("Resized Array after adding new elements: " + Arrays.toString(resizedArrayLarger));
        
        // 1.2 Resizing the array to a smaller size (reducing its length to 3)
        int[] resizedArraySmaller = Arrays.copyOf(originalArray, 3);
        System.out.println("Resized Array (Smaller): " + Arrays.toString(resizedArraySmaller));
        
        // 2. Using ArrayList for dynamic resizing
        ArrayList<String> dynamicArray = new ArrayList<>(Arrays.asList("Apple", "Banana", "Orange"));
        System.out.println("\nDynamic ArrayList: " + dynamicArray);
        
        // Adding more elements
        dynamicArray.add("Mango");
        dynamicArray.add("Pineapple");
        System.out.println("ArrayList after adding elements: " + dynamicArray);
        
        // Removing an element
        dynamicArray.remove("Banana");
        System.out.println("ArrayList after removing an element: " + dynamicArray);
        
        // Resizing is handled automatically, no need for explicit resizing

        // 3. Performance and practical use
        /*
         * Performance and practical differences:
         * 
         * 1. Static Array resizing (using Arrays.copyOf):
         *      - The original array remains unmodified, and a new array is created with the desired size.
         *      - Not efficient if frequent resizing is needed, since creating new arrays and copying elements takes time and memory.
         *      - Provides direct indexed access, with time complexity O(1) for accessing elements.
         *      - Best for fixed-size datasets that rarely change in size.
         *
         * 2. ArrayList (Dynamic array):
         *      - Automatically handles resizing when elements are added or removed.
         *      - Provides additional methods like add(), remove(), and contains().
         *      - More flexible than static arrays, but slightly less efficient due to internal resizing mechanisms.
         *      - Best suited for situations where the size of the collection changes frequently.
         * 
         * Conclusion:
         * - Use static arrays when you know the size in advance, and resizing is not frequent.
         * - Use ArrayList when you need dynamic resizing and more flexibility in managing the collection of elements.
         */
    }
}
