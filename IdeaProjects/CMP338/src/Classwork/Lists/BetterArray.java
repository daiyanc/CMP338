package Classwork.Lists;

import java.util.Arrays;

public class BetterArray<E extends Comparable <? super E>> implements ListInterface<E> {

	private final int DEFAULT_ARRAY_SIZE = 100;
	private Object[] array;
	private int numElements = 0;

	public BetterArray() {
		this.array = new Object[DEFAULT_ARRAY_SIZE];
	}
	
	public BetterArray(int initialSize) {
		if (initialSize < 0) {
			this.array = new Object[DEFAULT_ARRAY_SIZE];
		} else {
			this.array = new Object[initialSize];
		}
	}
	
	@Override
	public int size() {
		return this.numElements;
	}
	
	@Override
	public boolean isEmpty() {
		return (this.numElements == 0);
	}
	
	@Override
	public ListInterface<E> copy() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void add(E element) {
		if (numElements == array.length ) {
			this.makeArrayBigger();
		}
		this.array[numElements++] = element;
	}
	
	@Override
	public void add(E element, int index) throws IndexOutOfBoundsException {
		if (index < 0) {
			throw new IndexOutOfBoundsException("index = " + index + " is invalid");
		}
		
		if (index <= this.numElements) {
			if (index == this.numElements) {
				this.add(element);
			} else {
				if (this.numElements == this.array.length) {
					this.makeArrayBigger();
				}

				if (this.numElements - index >= 0)
					System.arraycopy(this.array, index, this.array, index + 1, this.numElements - index);
				this.array[index] = element;
				this.numElements++;
			}
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
							" is invalid for an array with only " + this.numElements + " elements");
		}
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
		if ((index >= 0) && (index < this.numElements)) {
			return (E) this.array[index];
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
							" is invalid for an array with only " + this.numElements + " elements");
		}
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if ((index < 0) || (index >= this.numElements)) {
			throw new IndexOutOfBoundsException("index = " + index + 
					" is invalid for an array with only " + this.numElements + " elements");
		} else {
			E oldElement = (E) this.array[index];
			if (this.numElements - 1 - index >= 0)
				System.arraycopy(this.array, index + 1, this.array, index, this.numElements - 1 - index);
			this.numElements--;
			return oldElement;
		}
	}
	
	@Override
	public void removeAll() {
		Arrays.fill(this.array, null);
		this.numElements = 0;
	}
	
	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("array = [");
		
		for ( int i = 0 ; i < this.numElements ; i++ ) {
			output.append(this.array[i]);
			if ( i != this.numElements - 1) {
				output.append(", ");
			} else {
				output.append("]");
			}
		}
		return output.toString();
	}
	
	private void makeArrayBigger() {
		Object[] biggerArray = new Object[this.array.length * 2];
		System.arraycopy(this.array, 0, biggerArray, 0, this.array.length);
		this.array = biggerArray;
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
