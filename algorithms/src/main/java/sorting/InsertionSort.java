package sorting;

public class InsertionSort {
    public static void sort(int v[]) {
        if (v == null) {
            throw new IllegalArgumentException("v cannot be null");
        }

        for (int j = 1; j < v.length; j++) {
            //find insertion position
            int i = 0;
            while(v[j] >= v[i] && i < j) {
                i++;
            }

            //save inserted element
            int aux = v[j];

            //shift elements
            for (int k = j; k > i; k--){
                v[k] = v[k-1];
            }

            //place element at position
            v[i] = aux;
        }
    }
}
