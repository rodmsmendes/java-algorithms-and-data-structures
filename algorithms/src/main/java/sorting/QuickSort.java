package sorting;

public class QuickSort {
    public static void sort(int v[]) {
        if (v == null) {
            throw new IllegalArgumentException("v cannot be null");
        }

        quickSort(v, 0, v.length-1);
    }

    private static void quickSort(int[] v, int start, int end) {
        if (end > start) {
            int pivot = partition(v, start, end);
            quickSort(v, start, pivot - 1);
            quickSort(v, pivot + 1, end);
        }
    }

    private static int partition(int[] v, int start, int end) {
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (v[j] < v[end]) {
                i++;
                int aux = v[i];
                v[i] = v[j];
                v[j] = aux;
            }
        }

        int aux = v[i+1];
        v[i+1] = v[end];
        v[end] = aux;

        return i + 1;
    }
}
