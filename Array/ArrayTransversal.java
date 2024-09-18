// Array Traversal method
/*
 * This file demonstrates  traversal method for both static and dynamic array in java,
 * With performance comparison and additional methods available for dynamic arrays.
 */

 import java.util.ArrayList;
 import java.util.Arrays;
 
 public class ArrayTransversal {
 
     public static void main (String[] args) {
 
         // 1. Traversal a static array (fixed size)
         String[] staticArray = {"banana", "mango", "watermelon", "melon", "orange"};
 
         System.out.println("=== Static Array traversal ===");
 
         // 1.1. Static traversal using traditional loop
         System.out.println("Traversal using traditional for loop : "); 
         for (int i = 0; i < staticArray.length; i++ ) {
             System.out.println("Element at index " + i + ": " + staticArray[i]);
         }
 
         // 1.2. Traversal using enhanced for loop (foreach)
         System.out.println("Traversal using enhanced for loop : ");
         for (String element : staticArray) {
             System.out.println("Element : " + element);
         } 
 
         // 1.3. Traversal using Arrays.stream() (java 8+)
         System.out.println("Traversal using Arrays.stream() : "); 
         java.util.Arrays.stream(staticArray).forEach(element -> System.out.println("Element :" + element));
 
         // 1.4. Transversal using recursion
         System.out.println("Transversal using recursion : ");
         traverseStaticArrayRecursively(staticArray, 0);
 
         // 2. Traversing a dynamic array (ArrayList)
         ArrayList<Integer> dynamicArray = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
 
         //  2. Traversing a dynamic array (ArrayList)
 
         System.out.println("\n=== Dynamic Array (ArrayList) Traversal ===");
 
         //2.1. Traversal using traditional for loop  (with get() method)
 
         System.out.println("Traversal using traditional for loop");
         for (int i = 0; i < dynamicArray.size(); i++) {
             System.out.println("Element at index " + i + ": " + dynamicArray.get(i));
         }
 
         // 2.2 Traversal using for loop (for each)
         System.out.println("\nTRaversal using enhanced for loop");
         for (int element : dynamicArray) {
             System.out.println("Element : " + element);
         }
 
         // 2.3 Traversal using forEach() method of arrayList
         System.out.println("\n Traversal using ArrayList.forEach() : ");
         dynamicArray.forEach(element -> System.out.println("Element : " + element));
 
         // Final comparison of static and dynamic arrays
         /*
          * Performance and usability difference :
          * 
          * 1. Static Array :
          *      - Fixed size, cannot de resized after creation
          *      - Efficient in memory usage after creation.
          *      - Provides direct indexed access (O(1) for both reading and writing)
          *      - Limited in functionality compared to dynamic arrays.
          * 
          * 2. Dynamic Array (ArrayList):
          *      - Resizable: Can grow and shrink dynamically as elements are added or removed.
          *      - More flexible but slightly less memory efficient due to internal resizing mechanisms.
          *      - Provides additional methods such as add(),  remove(). size(),  and contains().
          *      - Access by index is still is 0(1), but adding/removing elements may involve resizing, which could have 0(n) cost.
          */
 
     }
 
     // Helper method to traverse array 
     public static void traverseStaticArrayRecursively(String[] array, int index) {
         if (index < array.length) {
             System.out.println("Element at index " + index + ": " + array[index]);
             traverseStaticArrayRecursively(array, index + 1);
         }
         
     }
     
 }