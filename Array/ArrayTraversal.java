// Array Traversal Demonstration
/*
 * This file demonstrates various traversal methods for both static and dynamic arrays in Java.
 * It includes traditional loops, enhanced for loops, streams, and recursion.
 * A final comparison between static arrays and dynamic arrays (ArrayList) is provided in terms of usability and performance.
 */

 import java.util.ArrayList;
 import java.util.Arrays;
 
 public class ArrayTraversal {
 
     public static void main(String[] args) {
 
         // 1. Traversal of a static array (fixed size)
         String[] staticArray = {"banana", "mango", "watermelon", "melon", "orange"};
 
         System.out.println("=== Static Array Traversal ===");
 
         // 1.1. Traversal using traditional for loop
         System.out.println("Traversal using traditional for loop:");
         for (int i = 0; i < staticArray.length; i++) {
             System.out.println("Element at index " + i + ": " + staticArray[i]);
         }
 
         // 1.2. Traversal using enhanced for loop (foreach)
         System.out.println("\nTraversal using enhanced for loop:");
         for (String element : staticArray) {
             System.out.println("Element: " + element);
         }
 
         // 1.3. Traversal using Arrays.stream() (Java 8+)
         System.out.println("\nTraversal using Arrays.stream():");
         Arrays.stream(staticArray).forEach(element -> System.out.println("Element: " + element));
 
         // 1.4. Traversal using recursion
         System.out.println("\nTraversal using recursion:");
         traverseStaticArrayRecursively(staticArray, 0);
 
         // 2. Traversing a dynamic array (ArrayList)
         ArrayList<Integer> dynamicArray = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
 
         System.out.println("\n=== Dynamic Array (ArrayList) Traversal ===");
 
         // 2.1. Traversal using traditional for loop (with get() method)
         System.out.println("Traversal using traditional for loop:");
         for (int i = 0; i < dynamicArray.size(); i++) {
             System.out.println("Element at index " + i + ": " + dynamicArray.get(i));
         }
 
         // 2.2. Traversal using enhanced for loop (foreach)
         System.out.println("\nTraversal using enhanced for loop:");
         for (int element : dynamicArray) {
             System.out.println("Element: " + element);
         }
 
         // 2.3. Traversal using ArrayList.forEach() method
         System.out.println("\nTraversal using ArrayList.forEach():");
         dynamicArray.forEach(element -> System.out.println("Element: " + element));
 
         // Final comparison of static and dynamic arrays
         System.out.println("\n=== Static vs Dynamic Array Comparison ===");
         /*
          * Performance and usability differences:
          * 
          * 1. Static Array:
          *      - Fixed size, cannot be resized after creation.
          *      - More memory efficient after allocation.
          *      - Provides direct indexed access (O(1) for both reading and writing).
          *      - Limited in functionality compared to dynamic arrays.
          * 
          * 2. Dynamic Array (ArrayList):
          *      - Resizable: Can grow and shrink dynamically as elements are added or removed.
          *      - More flexible but slightly less memory efficient due to internal resizing mechanisms.
          *      - Provides additional methods such as add(), remove(), size(), and contains().
          *      - Access by index is still O(1), but adding/removing elements may involve resizing, which could have O(n) cost.
          */
     }
 
     // Helper method to recursively traverse a static array
     public static void traverseStaticArrayRecursively(String[] array, int index) {
         if (index < array.length) {
             System.out.println("Element at index " + index + ": " + array[index]);
             traverseStaticArrayRecursively(array, index + 1);
         }
     }
 }
 