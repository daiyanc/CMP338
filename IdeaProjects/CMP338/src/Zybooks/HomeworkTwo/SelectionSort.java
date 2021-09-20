package Zybooks.HomeworkTwo;

public class SelectionSort implements SortInterface{
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            int hold = array[index];
            array[index] = array[i];
            array[i] = hold;
        }
    }
}