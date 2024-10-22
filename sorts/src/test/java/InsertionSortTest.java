import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.BubbleSort;
import com.brandoniscoding.algorithms.InsertionSort;

public class InsertionSortTest {
    
    @Test
    void testSort() {
        int[] array = {3, 6, 9, 10, 7};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(array);
        assertArrayEquals(new int[] {3, 6, 7, 9, 10}, array);
    }

    @Test 
    void testDescription() {
        InsertionSort insertionSort= new InsertionSort();
        assertNotNull(insertionSort.getDescription(), "Description should not be null.");
    }
}
