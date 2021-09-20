package PsuedoCodeZB;

// Pseudo code for BubbleSort and SelectionSort
public class SortingAlgorithm {
    int[] BubbleSort(int[] array){
        int last = array.length - 1;
        while (last > 0) {
            int i = 0;
            while (i < last) {
                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
                i++;
            }
            last--;
        }
        return array;
    }

    int[] SelectionSort(int[] array) {
        int cur; int min = 0;
        for (cur = 0; cur < array.length; cur++) {
            min = cur;
            for (int i = cur + 1; i < array.length; i++) {
                if (array[i] < array[min]) { min = i;}
            }
        }
        if (min != cur) {
            int temp = array[min];
            array[min] = array[cur];
            array[cur] = temp;
        }
        return array;
    }
}
