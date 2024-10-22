import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.brandoniscoding.algorithms.SelectionSort;

public class SelectionSortTest {

    @Test
    void sortTest() {
        int[] array = {4, 78, 54, 1, 0};
        SelectionSort selection = new SelectionSort();
        selection.sort(array);
        assertArrayEquals(new int[] {0, 1, 4, 54, 78} ,array);
    }

    @Test
    void getDescription() {
        SelectionSort selectionSort= new SelectionSort();
        assertNotNull(selectionSort.getDescription(), "Description should not be null.");
    }
    
}
