package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InsertionSortTest {
    @Test
    public void emptyArrayTest() {
        int [] v = {};
        InsertionSort.sort(v);
        assertArrayEquals(new int[]{}, v);
    }

    @Test
    public void singleElementArrayTest() {
        int [] v = {10};
        InsertionSort.sort(v);
        assertArrayEquals(new int[]{10}, v);
    }

    @Test
    public void sortedTwoElementArrayTest() {
        int [] v = {10, 20};
        InsertionSort.sort(v);
        assertArrayEquals(new int[]{10, 20}, v);
    }

    @Test
    public void invertedTwoElementArrayTest() {
        int [] v = {20, 10};
        InsertionSort.sort(v);
        assertArrayEquals(new int[]{10, 20}, v);
    }

    @Test
    public void randomUnsortedArrayTest() {
        int [] v = {42, 56, 34, 71, 44, 35, 8, 84};
        InsertionSort.sort(v);
        assertArrayEquals(new int[]{8, 34, 35, 42, 44, 56, 71, 84}, v);
    }
}
