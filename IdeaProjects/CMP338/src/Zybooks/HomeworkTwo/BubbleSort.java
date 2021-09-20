package Zybooks.HomeworkTwo;

public class BubbleSort implements SortInterface{
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int holder = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = holder;
                }
            }
        }
    }
}
