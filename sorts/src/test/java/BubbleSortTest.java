

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.BubbleSort;

/**
 * Unit tests for the BubbleSort class.
 * <p>
 * This class contains tests to verify the functionality of the 
 * BubbleSort algorithm implementation, ensuring that the sorting 
 * operation and the algorithm description are correct.
 * </p>
 */
public class BubbleSortTest {
    
    /**
     * Tests the sorting functionality of the BubbleSort class.
     * <p>
     * This test verifies that the BubbleSort algorithm correctly sorts 
     * an unsorted array of integers in ascending order.
     * </p>
     */
    @Test
    void testSort() {
        int[] array = {5, 1, 4, 2, 8}; // Unsorted array
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array); // Sort the array
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, array); // Verify sorted order
    }

    /**
     * Tests the getDescription method of the BubbleSort class.
     * <p>
     * This test checks that the description returned by the 
     * BubbleSort algorithm is not null, indicating that 
     * the implementation provides a description.
     * </p>
     */
    @Test 
    void testDescription() {
        BubbleSort bubbleSort = new BubbleSort();
        assertNotNull(bubbleSort.getDescription(), "Description should not be null.");
    }
}
