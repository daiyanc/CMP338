package Zybooks.HomeworkOne;

public interface SearchDriverInterface {
    int[] getListOfNumbers();
    int[] getTargets();
    TestTimes runLinearSearch(int[] listOfNumbers, int target, int numberOfTimes);
    TestTimes runBinarySearch(int[] listOfNumbers, int target, int numberOfTimes);

}
