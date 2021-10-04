package Classwork.Lists;

import java.util.Arrays;

public class BetterArray<E extends Comparable <? super E>> implements ListInterface<E> {

	private final int DEFAULT_ARRAY_SIZE = 100;
	private Object[] array;
	private int numElements = 0;

	public BetterArray() { array = new Object[DEFAULT_ARRAY_SIZE]; }
	
	public BetterArray(int initialSize) {
		if (initialSize < 0) { array = new Object[DEFAULT_ARRAY_SIZE]; }
		else { array = new Object[initialSize]; }
	}
	
	@Override
	public int size() { return numElements; }
	
	@Override
	public boolean isEmpty() { return numElements == 0; }
	
	@Override
	public ListInterface<E> copy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void add(E element) {
		if (numElements == array.length ) { makeArrayBigger(); }
		array[numElements++] = element;
	}
	
	@Override
	public void add(E element, int index) throws IndexOutOfBoundsException {
		if (index < 0) { throw new IndexOutOfBoundsException("index = " + index + " is invalid"); }
		
		if (index <= numElements) {
			if (index == numElements) { add(element); }
			else {
				if (numElements == array.length) { makeArrayBigger(); }
				if (numElements - index >= 0)
					System.arraycopy(array, index, array, index + 1, numElements - index);
				array[index] = element;
				numElements++;
			}
		} else { throw new IndexOutOfBoundsException("index = " + index +
							" is invalid for an array with only " + numElements + " elements"); }
	}
	
	@Override
	public void addSorted(E element) {
		// left as an exercise for HW 3
	}
	
	@Override
	public E replace(E element, int index) throws IndexOutOfBoundsException {
		// left as an exercise for HW 3
		return null;
	}
	
	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if ((index >= 0) && (index < this.numElements)) { return (E) array[index]; }
		else { throw new IndexOutOfBoundsException("index = " + index +
							" is invalid for an array with only " + numElements + " elements"); }
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if ((index < 0) || (index >= numElements)) { throw new IndexOutOfBoundsException("index = " + index +
					" is invalid for an array with only " + numElements + " elements"); }
		else {
			E oldElement = (E) array[index];
			if (numElements - 1 - index >= 0)
				System.arraycopy(array, index + 1, array, index, numElements - 1 - index);
			numElements--;
			return oldElement;
		}
	}
	
	@Override
	public void removeAll() {
		Arrays.fill(array, null);
		numElements = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("array = [");
		
		for ( int i = 0 ; i < numElements ; i++ ) {
			output.append(this.array[i]);
			if ( i != numElements - 1) { output.append(", "); }
			else { output.append("]"); }
		}
		return output.toString();
	}
	
	private void makeArrayBigger() {
		Object[] biggerArray = new Object[array.length * 2];
		System.arraycopy(this.array, 0, biggerArray, 0, array.length);
		array = biggerArray;
	}
	
	
	public static void main(String[] args) {
		BetterArray<String> ba = new BetterArray<>();
		
		
		ba.add("apples");
		ba.add("oranges");
		ba.add("eggplant");
		ba.add("olive oil");
		ba.add("lemons");
		ba.add("salt");
		ba.add("beer", 0);
		ba.add("milk", 2);
		
		System.out.println(ba);
		
		
	}

}
