package Classwork.SortAlgorithms;

public class SelectionSortAlgorithm {
    static void SelectionSort(int[] numbers, int numbersSize) {
        int i;
        int j;
        int indexSmallest;
        int temp = 0;  // Temporary variable for swap

        for (i = 0; i < numbersSize - 1; ++i) {

            // Find index of the smallest remaining element
            indexSmallest = i;
            for (j = i + 1; j < numbersSize; ++j) {
                if ( numbers[j] < numbers[indexSmallest] ) {
                    indexSmallest = j;
                }
            }

            // Swap numbers[i] and numbers[indexSmallest]
            temp = numbers[i];
            numbers[i] = numbers[indexSmallest];
            numbers[indexSmallest] = temp;
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 2, 78, 4, 45, 32, 7, 11 };
        int NUMBERS_SIZE = 8;

        System.out.print("UNSORTED: ");
        for (int i = 0; i < NUMBERS_SIZE; ++i) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        SelectionSort(numbers, NUMBERS_SIZE);

        System.out.print("SORTED: ");
        for (int i = 0; i < NUMBERS_SIZE; ++i) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
