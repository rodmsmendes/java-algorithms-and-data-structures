package search;

public class BinarySearch {
    public static int search(int key, int [] v) {
        if (v == null) {
            throw new IllegalArgumentException("v cannot be null");
        }

        return binarySearch(key, v, 0, v.length);
    }

    private static int binarySearch(int key, int[] v, int start, int end) {
        int pos = -1;

        if (start < end) {
            int mid = (start + end) / 2;

            if (key < v[mid]) {
                pos = binarySearch(key, v, start, mid);
            } else if (key > v[mid]) {
                pos = binarySearch(key, v, mid + 1, end);
            } else {
                pos = mid;
            }
        }

        return pos;
    }
}
