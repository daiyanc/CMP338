package Zybooks.HomeworkOne;

import java.util.Arrays;

public class BinarySearch implements SearchInterface{
    @Override
    public int search(int[] arr, int target) {
        int value = Arrays.binarySearch(arr, target);
        if (value < 0)
            return -1;
        return value;
    }
}
