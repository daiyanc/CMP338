package Zybooks.HomeworkOne;

public interface SearchDriverInterface {
    int[] getListOfNumbers();
    int[] getTargets();
    TestTime runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes);
    TestTime runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes);

}
