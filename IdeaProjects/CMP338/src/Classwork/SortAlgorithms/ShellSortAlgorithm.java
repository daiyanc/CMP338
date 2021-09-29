package Classwork.SortAlgorithms;

import java.util.Arrays;

public class ShellSortAlgorithm {
    /* An utility function to print array of size n*/
    static void printArray(int[] arr) {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    /* function to sort arr using shellSort */
    void sort(int[] arr) {
        int n = arr.length;

        // Start with a big gap, then reduce the gap
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // Do a gapped insertion sort for this gap size.
            // The first gap elements a[0..gap-1] are already
            // in gapped order keep adding one more element
            // until the entire array is gap sorted
            for (int i = gap; i < n; i += 1) {
                // add a[i] to the elements that have been gap
                // sorted save a[i] in temp and make a hole at
                // position i
                int temp = arr[i];

                // shift earlier gap-sorted elements up until
                // the correct location for a[i] is found
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                    arr[j] = arr[j - gap];

                // put temp (the original a[i]) in its correct
                // location
                arr[j] = temp;
            }
        }
    }

    // Driver method
    public static void main(String[] args) {
        int[] arr = {82, 77, 13, 67, 34, 85, 80, 55, 53, 54, 89};
        System.out.println("Array before sorting");
        System.out.println(Arrays.toString(arr));

        ShellSortAlgorithm ob = new ShellSortAlgorithm();
        ob.sort(arr);

        System.out.println("Array after sorting");
        printArray(arr);
    }
}
