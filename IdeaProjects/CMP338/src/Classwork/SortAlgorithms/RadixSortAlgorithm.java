package Classwork.SortAlgorithms;

public class RadixSortAlgorithm {
    // Returns the maximum length, in number of digits, out of all elements in the array
    int RadixGetMaxLength(int[] array, int arraySize) {
        int maxDigits = 0;
        for (int i = 0; i < arraySize; i++) {
            int digitCount = RadixGetLength(array[i]);
            if (digitCount > maxDigits)
                maxDigits = digitCount;
        }
        return maxDigits;
    }

    // Returns the length, in number of digits, of value
    int RadixGetLength(int value) {
        if (value == 0)
            return 1;

        int digits = 0;
        while (value != 0) {
            digits = digits + 1;
            value = value / 10;
        }
        return digits;
    }
}
