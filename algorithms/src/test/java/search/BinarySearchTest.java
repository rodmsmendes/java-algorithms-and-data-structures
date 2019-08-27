package search;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearchTest {
    @Test
    public void searchEmptyArray() {
        int [] v = {};
        assertEquals(-1, BinarySearch.search(10, v));
    }

    @Test
    public void keyIsNotPresentInSingleElementArray() {
        int [] v = {50};
        assertEquals(-1, BinarySearch.search(10, v));
    }

    @Test
    public void keyIsPresentInSingleElementArray() {
        int [] v = {10};
        assertEquals(0, BinarySearch.search(10, v));
    }

    @Test
    public void keyIsInTheMiddle() {
        int [] v = {1, 2, 3, 5, 7, 11, 13};
        assertEquals(3, BinarySearch.search(5, v));
    }

    @Test
    public void keyIsInTheLeftSide() {
        int [] v = {1, 2, 3, 5, 7, 11, 13};
        assertEquals(0, BinarySearch.search(1, v));
    }

    @Test
    public void keyIsInTheRightSide() {
        int [] v = {1, 2, 3, 5, 7, 11, 13};
        assertEquals(4, BinarySearch.search(7, v));
    }

    @Test
    public void keyIsGreaterThanAll() {
        int [] v = {1, 2, 3, 5, 7, 11, 13};
        assertEquals(-1, BinarySearch.search(20, v));
    }

    @Test
    public void keyIsLessThanAll() {
        int [] v = {1, 2, 3, 5, 7, 11, 13};
        assertEquals(-1, BinarySearch.search(-10, v));
    }
}
