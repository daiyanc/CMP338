package Classwork.SortAlgorithms;

public class QuickSortAlgorithm {
    static int Partition(int[] numbers, int lowIndex, int highIndex) {
        // Pick middle element as pivot
        int midpoint = lowIndex + (highIndex - lowIndex) / 2;
        int pivot = numbers[midpoint];

        boolean done = false;
        while (!done) {
            // Increment lowIndex while numbers[lowIndex] < pivot
            while (numbers[lowIndex] < pivot) {
                lowIndex += 1;
            }

            // Decrement highIndex while pivot < numbers[highIndex]
            while (pivot < numbers[highIndex]) {
                highIndex -= 1;
            }

            // If zero or one element remain, then all numbers are
            // partitioned. Return highIndex.
            if (lowIndex >= highIndex) {
                done = true;
            }
            else {
                // Swap numbers[lowIndex] and numbers[highIndex]
                int temp = numbers[lowIndex];
                numbers[lowIndex] = numbers[highIndex];
                numbers[highIndex] = temp;

                // Update lowIndex and highIndex
                lowIndex += 1;
                highIndex -= 1;
            }
        }

        return highIndex;
    }

    static int Quicksort(int[] numbers, int lowIndex, int highIndex) {
        // Base case: If the partition size is 1 or zero
        // elements, then the partition is already sorted
        if (lowIndex >= highIndex) {
            return -1;
        }

        // Partition the data within the array. Value lowEndIndex
        // returned from partitioning is the index of the low
        // partition's last element.
        int lowEndIndex = Partition(numbers, lowIndex, highIndex);

        // Recursively sort low partition (lowIndex to lowEndIndex)
        // and high partition (lowEndIndex + 1 to highIndex)
        Quicksort(numbers, lowIndex, lowEndIndex);
        return Quicksort(numbers, lowEndIndex + 1, highIndex);
    }

    public static void main(String[] args) {
        int[] numbers = { 10, 2, 78, 4, 45, 32, 7, 11 };
        int NUMBERS_SIZE = 8;

        System.out.print("UNSORTED: ");
        for(int i = 0; i < NUMBERS_SIZE; ++i) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Initial call to quicksort
        Quicksort(numbers, 0, NUMBERS_SIZE - 1);

        System.out.print("SORTED: ");
        for(int i = 0; i < NUMBERS_SIZE; ++i) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
