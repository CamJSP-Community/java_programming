import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.BubbleSort;


public class BubbleSortTest {
    
    @Test
    void testSort() {
        int[] array = {5, 1, 4, 2, 8}; // Unsorted array
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(array); // Sort the array
        assertArrayEquals(new int[]{1, 2, 4, 5, 8}, array); // Verify sorted order
    }

    @Test 
    void testDescription() {
        BubbleSort bubbleSort = new BubbleSort();
        assertNotNull(bubbleSort.getDescription(), "Description should not be null.");
    }
}
