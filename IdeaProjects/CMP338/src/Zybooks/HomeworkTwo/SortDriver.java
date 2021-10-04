package Zybooks.HomeworkTwo;

// http://comet.lehman.cuny.edu/sfakhouri/teaching/cmp/cmp338/f21/index.html

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class SortDriver implements SortDriverInterface{
    @Override
    public Integer[] createArray(ArrayType arrayType, int arraySize) {
        Integer[] arrayInt = new Integer[arraySize];
        Random random = new Random();
        int bound = Integer.MAX_VALUE;
        int sum = 0;

        switch (arrayType) {
            case Equal:
                Arrays.fill(arrayInt, 1);
                break;
            case Decreasing:
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = arraySize;
                    arraySize--;
                }
                break;
            case Increasing:
                for (int i = 0; i < arrayInt.length; i++) {
                    arrayInt[i] = sum;
                    sum++;
                } break;
            case IncreasingAndRandom:
                for (int i = 0; i < arraySize; i++) {
                    if (i == 0) {
//                        while (arrayInt[i - 1] == null && arrayInt[i] == null || sum < arrayInt[i - 1]) {
                        sum = random.nextInt(bound/(arraySize - i)) ;
//                        }
                    } else {
                        while (sum <= arrayInt[i - 1]) {
                            sum = random.nextInt(bound/(arraySize - i));
                        }
                    }
                    arrayInt[i] = sum;
                } break;
            case Random:
                for (int i = 0; i < arrayInt.length; i++) {
                    while (Arrays.asList(arrayInt).contains(sum)) {
                        sum = random.nextInt(bound/(arraySize - i));
                    }
                    arrayInt[i] = sum;
                } break;
        }
        return arrayInt;
    }

    @Override
    public Object[] runSort(SortType sortType, ArrayType arrayType, int arraySize, int numOfTimes) {
        Object[] arrayObj = new Object[numOfTimes * 2 + 1];
        SortDriver sd = new SortDriver();
        TestTimes tt = new TestTimes();
        long startTime = System.nanoTime();

        for (int i = 0; i < numOfTimes; i++) {
            Integer[] unsortedArray = sd.createArray(arrayType, arraySize);
            arrayObj[i * 2] = unsortedArray;

            switch (sortType) {
                case BubbleSort:
                    BubbleSort bs = new BubbleSort();
                    bs.sort(unsortedArray);
                    break;

                case InsertionSort:
                    InsertionSort is = new InsertionSort();
                    is.sort(unsortedArray);
                    break;

                case SelectionSort:
                    SelectionSort ss = new SelectionSort();
                    ss.sort(unsortedArray);
                    break;

            }

            if (arrayType == ArrayType.Decreasing) {
                Collections.reverse(Arrays.asList(unsortedArray));
            }

            long endTime = System.nanoTime();
            long time = endTime - startTime;
            tt.addTestTime(time);
            arrayObj[i * 2 + 1] = unsortedArray;
            arrayObj[numOfTimes * 2] = tt;
        }
        return arrayObj;
    }

    public static void main(String[] args) {
        SortDriver sd = new SortDriver();
//        System.out.println("Insertion Sort: Equal");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.InsertionSort, ArrayType.Equal, 1000, 10)));
//        System.out.println("Insertion Sort: Random");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.InsertionSort, ArrayType.Random, 1000, 10)));
//        System.out.println("Insertion Sort: Increasing");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.InsertionSort, ArrayType.Increasing, 1000, 10)));
//        System.out.println("Insertion Sort: Decreasing");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.InsertionSort, ArrayType.Decreasing, 1000, 10)));
//        System.out.println("Insertion Sort: IncreasingAndRandom");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.InsertionSort, ArrayType.IncreasingAndRandom, 1000, 10)));
//        System.out.println("Bubble Sort: Equal");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.BubbleSort, ArrayType.Equal, 1000, 2)));
//        System.out.println("Bubble Sort: Random");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.BubbleSort, ArrayType.Random, 5, 10)));
//        System.out.println("Bubble Sort: Increasing");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.BubbleSort, ArrayType.Increasing, 5, 10)));
//        System.out.println("Bubble Sort: Decreasing");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.BubbleSort, ArrayType.Decreasing, 1000, 1)));
//        System.out.println("Bubble Sort: IncreasingAndRandom");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.BubbleSort, ArrayType.IncreasingAndRandom, 5, 10)));
//        System.out.println("Selection Sort: Equal");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.SelectionSort, ArrayType.Equal, 5, 10)));
//        System.out.println("Selection Sort: Random");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.SelectionSort, ArrayType.Random, 5, 10)));
//        System.out.println("Selection Sort: Increasing");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.SelectionSort, ArrayType.Increasing, 5, 10)));
//        System.out.println("Selection Sort: Decreasing");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.SelectionSort, ArrayType.Decreasing, 5, 10)));
//        System.out.println("Selection Sort: IncreasingAndRandom");
//        System.out.println(Arrays.deepToString(sd.runSort(SortType.SelectionSort, ArrayType.IncreasingAndRandom, 5, 10)));

    }
}
