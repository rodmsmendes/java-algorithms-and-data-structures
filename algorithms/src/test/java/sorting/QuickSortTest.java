package sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class QuickSortTest {
    @Test
    public void emptyArrayTest() {
        int [] v = {};
        QuickSort.sort(v);
        assertArrayEquals(new int[]{}, v);
    }

    @Test
    public void singleElementArrayTest() {
        int [] v = {10};
        QuickSort.sort(v);
        assertArrayEquals(new int[]{10}, v);
    }

    @Test
    public void sortedTwoElementArrayTest() {
        int [] v = {10, 20};
        QuickSort.sort(v);
        assertArrayEquals(new int[]{10, 20}, v);
    }

    @Test
    public void invertedTwoElementArrayTest() {
        int [] v = {20, 10};
        QuickSort.sort(v);
        assertArrayEquals(new int[]{10, 20}, v);
    }

    @Test
    public void randomUnsortedArrayTest() {
        int [] v = {42, 84, 34, 71, 44, 35, 8, 56};
        QuickSort.sort(v);
        assertArrayEquals(new int[]{8, 34, 35, 42, 44, 56, 71, 84}, v);
    }
}
