import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.QuickSort;

public class QuickSortTest {

    @Test
    void testSort() {
        int[] array = {3, 6, 9, 10, 7};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(array);
        assertArrayEquals(new int[] {3, 6, 7, 9, 10}, array);
    }

    @Test 
    void testDescription() {
        QuickSort quickSort = new QuickSort();
        assertNotNull(quickSort.getDescription(), "Description should not be null.");
    }
}

