package Zybooks.HomeworkOne;

public class TestTime implements TestTimesInterface{
    private long[] times = new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private long testTime;
    private int arrayPos = 0;

    @Override
    public void addTestTime(long testTime) {
        if (arrayPos > 9) {arrayPos = 0;}
        times[arrayPos] = testTime;
        this.testTime = testTime;
        arrayPos++;
    }

    @Override
    public double getAverageTestTime() {
        double total = 0;
        double numElements = 0;
        for (long time : times) {
            total += time;
            numElements++;
        }
        return total / numElements;
    }

    @Override
    public long getLastTestTime() {
        return testTime;
    }

    @Override
    public long[] getTestTimes() {
        return times;
    }

    @Override
    public void resetTestTimes() {
        times = new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}; arrayPos = 0;
    }
}
