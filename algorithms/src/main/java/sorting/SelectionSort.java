package sorting;

public class SelectionSort {
    public static void sort(int [] v) {
        if (v == null) {
            throw new IllegalArgumentException("v cannot be null");
        }

        for (int j = 0 ; j < v.length - 1; j++) {
            int minIndex = j;
            for (int i = j + 1; i < v.length; i++) {
                if (v[minIndex] > v[i]) {
                    minIndex = i;
                }
            }

            int aux = v[minIndex];
            v[minIndex] = v[j];
            v[j] = aux;
        }
    }
}
