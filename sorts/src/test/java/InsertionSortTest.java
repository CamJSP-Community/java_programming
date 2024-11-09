import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.InsertionSort;

public class InsertionSortTest {

    // Test case for sorting an Integer array
    @Test
    void testSortIntegerArray() {
        Integer[] array = {5, 1, 4, 2, 8}; // Unsorted array
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 8}, array); // Verify sorted order
    }

    // Test case for sorting a Double array
    @Test
    void testSortDoubleArray() {
        Double[] array = {5.4, 1.2, 4.3, 2.1, 8.9};
        InsertionSort<Double> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array
        assertArrayEquals(new Double[]{1.2, 2.1, 4.3, 5.4, 8.9}, array); // Verify sorted order
    }

    // Test case for sorting a String array
    @Test
    void testSortStringArray() {
        String[] array = {"apple", "orange", "banana", "grape", "pear"};
        InsertionSort<String> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array
        assertArrayEquals(new String[]{"apple", "banana", "grape", "orange", "pear"}, array); // Verify sorted order
    }

    // Test case for an empty array
    @Test
    void testEmptyArray() {
        Integer[] array = {};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array (should remain empty)
        assertArrayEquals(new Integer[]{}, array); // Verify the array is still empty
    }

    // Test case for a single-element array
    @Test
    void testSingleElementArray() {
        Integer[] array = {5};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array (should remain the same)
        assertArrayEquals(new Integer[]{5}, array); // Verify the array is unchanged
    }

    // Test case for sorting an already sorted array
    @Test
    void testSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array (should remain the same)
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array); // Verify the array remains sorted
    }

    // Test case for sorting a reverse-ordered array (worst-case scenario)
    @Test
    void testReverseOrderedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array); // Verify sorted order
    }

    // Test case for sorting an array with duplicate elements
    @Test
    void testArrayWithDuplicates() {
        Integer[] array = {5, 1, 5, 2, 8, 1};
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        insertionSort.sort(array); // Sort the array
        assertArrayEquals(new Integer[]{1, 1, 2, 5, 5, 8}, array); // Verify sorted order with duplicates
    }

    // Test case for testing the description
    @Test 
    void testDescription() {
        InsertionSort<Integer> insertionSort = new InsertionSort<>();
        assertNotNull(insertionSort.getDescription(), "Description should not be null.");
    }
}
