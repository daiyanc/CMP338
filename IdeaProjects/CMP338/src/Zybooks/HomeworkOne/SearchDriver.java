package Zybooks.HomeworkOne;

import java.util.Arrays;

public class SearchDriver implements SearchDriverInterface{
    public static void main(String[] args) {
        TestTimes testTimes = new TestTimes();
        for (int i = 30; i < 83; i++) {
            testTimes.addTestTime(i);
        }
        LinearSearch linearSearch = new LinearSearch();
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(testTimes.getLastTestTime());
        testTimes.getTestTimes();
        SearchDriver searchDriver = new SearchDriver();
        System.out.println(Arrays.toString(searchDriver.getListOfNumbers()));
        int[] listOfNumbers = searchDriver.getListOfNumbers();
        System.out.println(searchDriver.runLinearSearch(listOfNumbers, 555_555, 5));
    }

    @Override
    public int[] getListOfNumbers() {
        int[] list = new int[10_000_000];
        for (int i = 0; i <= 9_999_999; i++) {
            list[i] = i + 1;
        }
        return list;
    }

    @Override
    public int[] getTargets() {
        return new int[]{500, 10_000, 100_000, 1_000_000, 5_000_000, 7_500_000, 10_000_000};
    }

    @Override
    public TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes) {
        TestTimes testTimes = new TestTimes();
        LinearSearch search = new LinearSearch();
        for (int i = 0; i < numberOfTimes; i++) {
            long startTime = System.nanoTime();
            int index = search.search(listOfNumbers, target);
            long endTime = System.nanoTime();
            long runTime = endTime - startTime;
            testTimes.addTestTime(runTime);
        }
        return testTimes;
    }

    @Override
    public TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes) {
        TestTimes testTimes = new TestTimes();
        BinarySearch search = new BinarySearch();
        for (int i = 0; i < numberOfTimes; i++) {
            long startTime = System.nanoTime();
            int index = search.search(listOfNumbers, target);
            long endTime = System.nanoTime();
            long runTime = endTime - startTime;
            testTimes.addTestTime(runTime);
        }
        return testTimes;
    }
}
