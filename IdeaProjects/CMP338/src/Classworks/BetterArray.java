package Classworks;

import java.util.Arrays;

public class BetterArray {
    private int[] array;
    private final int ARRAY_SIZE = 100;
    private int index = 0;

    public BetterArray() {
        array = new int[ARRAY_SIZE];
    }

    public BetterArray(int size){
        if (size < 0) { size = ARRAY_SIZE; }
        array = new int[size];
    }

    void add(int value) {
        if (index == array.length) { array = Arrays.copyOf(array, array.length + 1); }
        array[index] = value;
        index++;
    }

    int get(int index) {
        if (index < 0 || index > array.length - 1) { return 0; }
        return array[index];
    }

    int size() { return index; }
    public boolean isEmpty() { return index == 0; }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder("array = [ ");
        for (int i = 0; i < index; i++) {
            output.append(array[i]);
            if (i != index - 1) { output.append(", "); }
            else { output.append(" ]"); }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        BetterArray array = new BetterArray();
        BetterArray custom = new BetterArray(50);

        for (int i = 0; i < array.ARRAY_SIZE; i++) { array.add(( i * 4 ) - 6); }
        for (int i = 0; i < custom.array.length; i++) { custom.add(i * 3 - 1); }

        System.out.println(array);
        System.out.println(custom);
    }
}
