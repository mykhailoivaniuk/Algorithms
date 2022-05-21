import com.misha.sortingalgorithms.InsertionSort;
import com.misha.sortingalgorithms.SortingAlgorithm;
import com.misha.sortingalgorithms.AlgoUtils;
import org.junit.jupiter.api.*;

import java.util.ArrayList;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SortAlgoTest {

    ArrayList<Integer> numbers;
    ArrayList<Integer> numbers_sorted;
    static SortingAlgorithm algo;

    @Test
    void testNothing(){
        assertTrue(true);
    }

    @Nested
    @DisplayName("Insertion Sort Tests")
    class InSort {

        @BeforeAll
        static void setAlgo(){
            algo = new InsertionSort();
        }

        @BeforeEach
        void setUp() {
            numbers = AlgoUtils.fillRandom(10_000);
            numbers_sorted = new ArrayList<>(numbers);
            numbers_sorted.sort(null);
        }

        @Test
        void InsertionSortRandomTest() {
            algo.sort(numbers);
            assertEquals(numbers_sorted, numbers);
        }

        @Test
        void InsertionSortAlreadySorted() {
            ArrayList<Integer> expected = AlgoUtils.fillSorted(true, 10_000);
            ArrayList<Integer> actual = AlgoUtils.fillSorted(true, 10_000);
            algo.sort(actual);
            assertEquals(expected, actual);
        }
        @Test
        void InsertionSortSortedInReverse() {
            ArrayList<Integer> expected = AlgoUtils.fillSorted(true, 10_000);
            ArrayList<Integer> actual = AlgoUtils.fillSorted(false, 10_000);
            algo.sort(actual);
            assertEquals(expected, actual);
        }
    }


}
