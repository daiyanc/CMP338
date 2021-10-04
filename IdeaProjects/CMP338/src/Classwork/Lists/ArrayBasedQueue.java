package Classwork.Lists;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayBasedQueue<E> implements QueueInterface<E> {

	private final int DEFAULT_ARRAY_SIZE = 10_000;

	private Object[] array;
	private int front;
	private int back;
	private int numELements;
	
	public ArrayBasedQueue() {
		array = new Object[this.DEFAULT_ARRAY_SIZE];
		numELements = 0;
		front = -1;
		back = -1;
	}
	
	public ArrayBasedQueue(int arraySize) {
		this();
		if (arraySize > 0) {
			array = new Object[arraySize];
			numELements = 0;
			front = -1;
			back = -1;
		}
	}
	
	@Override
	public Iterator<E> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isEmpty() {
		return numELements == 0;
	}

	@Override
	public int size() {
		return numELements;
	}

	@Override
	public QueueInterface<E> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enqueue(E element) throws IllegalStateException, NullPointerException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E dequeue(int index) throws NoSuchElementException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		if (array.length != DEFAULT_ARRAY_SIZE) {
			array = new Object[array.length];
		} else {
			array = new Object[DEFAULT_ARRAY_SIZE];
		}
		numELements = 0;
		front = -1;
		back = -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
