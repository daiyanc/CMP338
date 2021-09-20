package Zybooks.HomeworkTwo;

public interface SortDriverInterface {
    Integer[] createArray(ArrayType arrayType, int arraySize);
    Object[] runSort(SortType sortType, ArrayType arrayType,
                               int arraySize, int numOfTimes);

}
