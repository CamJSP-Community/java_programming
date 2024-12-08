import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.MergeSort;

public class MergeSortTest {

    // Test case for sorting an Integer array
    @Test
    void testSortIntegerArray() {
        Integer[] array = {5, 1, 4, 2, 8};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array);
        assertArrayEquals(new Integer[]{1, 2, 4, 5, 8}, array); // Verify sorted order
    }

    // Test case for sorting a Double array
    @Test
    void testSortDoubleArray() {
        Double[] array = {5.4, 1.2, 4.3, 2.1, 8.9};
        MergeSort<Double> mergeSort = new MergeSort<>();
        mergeSort.sort(array);
        assertArrayEquals(new Double[]{1.2, 2.1, 4.3, 5.4, 8.9}, array); // Verify sorted order
    }

    // Test case for sorting a String array
    @Test
    void testSortStringArray() {
        String[] array = {"apple", "orange", "banana", "grape", "pear"};
        MergeSort<String> mergeSort = new MergeSort<>();
        mergeSort.sort(array);
        assertArrayEquals(new String[]{"apple", "banana", "grape", "orange", "pear"}, array); // Verify sorted order
    }

    // Test case for an empty array
    @Test
    void testEmptyArray() {
        Integer[] array = {};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array); // Sorting an empty array should remain empty
        assertArrayEquals(new Integer[]{}, array); // Verify the array is still empty
    }

    // Test case for a single-element array
    @Test
    void testSingleElementArray() {
        Integer[] array = {5};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array); // Sorting a single element array should remain the same
        assertArrayEquals(new Integer[]{5}, array); // Verify the array is unchanged
    }

    // Test case for sorting an already sorted array
    @Test
    void testSortedArray() {
        Integer[] array = {1, 2, 3, 4, 5};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array); // Already sorted, should remain the same
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array); // Verify the array remains sorted
    }

    // Test case for sorting a reverse-ordered array (worst-case scenario)
    @Test
    void testReverseOrderedArray() {
        Integer[] array = {5, 4, 3, 2, 1};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array); // Should sort to ascending order
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, array); // Verify sorted order
    }

    // Test case for sorting an array with duplicate elements
    @Test
    void testArrayWithDuplicates() {
        Integer[] array = {5, 1, 5, 2, 8, 1};
        MergeSort<Integer> mergeSort = new MergeSort<>();
        mergeSort.sort(array);
        assertArrayEquals(new Integer[]{1, 1, 2, 5, 5, 8}, array); // Verify sorted order with duplicates
    }

    // Test case for testing the description
    @Test 
    void testDescription() {
        MergeSort<Integer> mergeSort = new MergeSort<>();
        assertNotNull(mergeSort.getDescription(), "Description should not be null.");
    }
}
