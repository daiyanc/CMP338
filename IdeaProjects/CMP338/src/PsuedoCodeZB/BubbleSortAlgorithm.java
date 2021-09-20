package PsuedoCodeZB;

public class BubbleSortAlgorithm {
    void bubbleSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i- 1; j++)
                if (arr[j] > arr[j + 1])
                {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }

    /* Prints the array */
    void printArray(int[] arr)
    {
        for (int j : arr) System.out.print(j + " ");
        System.out.println();
    }

    // Driver method to test above
    public static void main(String[] args)
    {
        BubbleSortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        sortAlgorithm.bubbleSort(arr);
        System.out.println("Sorted array");
        sortAlgorithm.printArray(arr);
    }
}
