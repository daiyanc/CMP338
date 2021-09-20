package Zybooks.HomeworkTwo;

public class InsertionSort implements SortInterface{
    @Override
    public void sort(Integer[] array) {
        for (int i = 0; i < array.length; i++) {
            int hold = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > hold){
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = hold;
        }
    }
}