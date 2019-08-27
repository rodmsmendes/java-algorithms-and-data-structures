package sorting;

public class BubbleSort {
    public static void sort(int[] v) {
        if (v == null) {
            throw new IllegalArgumentException("v cannot be null.");
        }

        for(int j = v.length - 1; j >= 1; j--) {
            for (int i = 0; i < j; i++) {
                if (v[i] > v[i+1]) {
                    int aux = v[i];
                    v[i] = v[i+1];
                    v[i+1] = aux;
                }
            }
        }
    }
}
