package Zybooks.HomeworkTwo;

import Zybooks.HomeworkOne.TestTimesInterface;

import java.util.ArrayList;

public class TestTimes implements TestTimesInterface {
    ArrayList<Long> listObj = new ArrayList<>();

    public long getLastTestTime() { return listObj.get(listObj.size() - 1); }

    public long[] getTestTimes() {
        long[] array = new long[listObj.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = listObj.get(i);
        }
        return array;
    }

    public void resetTestTimes() { listObj.clear(); }

    public void addTestTime(long testTime) {
        if (listObj.size() >= 10) {
            listObj.remove(0);
        }
        listObj.add(testTime);
    }

    public double getAverageTestTime() {
        double sum = 0.0;
        for (Long aLong : listObj) {
            sum += aLong;
        }
        return sum / listObj.size();
    }
}
