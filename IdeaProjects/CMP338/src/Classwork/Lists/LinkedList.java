package Classwork.Lists;

public class LinkedList<E extends Comparable <? super E>> implements ListInterface<E> {

	private LinkedListNode<E> head;
	private LinkedListNode<E> tail;
	private int numElements;
	
	public LinkedList() {
		this.head = null;
		this.tail = null;
		this.numElements = 0;
	}
	
	@Override
	public ListInterface<E> copy() {
		// TODO Auto-generated method stub
		return null;
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
	public void add(E element) {
		LinkedListNode<E> newNode = new LinkedListNode<>(element);

		if (this.isEmpty()) {
			this.head = newNode;
			this.tail = newNode;
			this.numElements = 1;
		} else {
			tail.setNext(newNode);
			tail = newNode;
			this.numElements++;
		}
	}
	
	@Override
	public void add(E element, int index) throws IndexOutOfBoundsException {
		if (index < 0) {
			throw new IndexOutOfBoundsException("index = " + index + " is invalid");
		}
		
		if (index <= this.numElements) {
			LinkedListNode<E> newNode = new LinkedListNode<>(element);

			if (index == this.numElements) {
				this.add(element);
			} else {
				LinkedListNode<E> curNode = this.head;
				int curIndex = 0;
				
				while (curIndex < index - 1) {
					curNode = curNode.getNext();
					curIndex++;
				}
				newNode.setNext(curNode.getNext());
				curNode.setNext(newNode);
				this.numElements++;
			}
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
							" is invalid for an array with only " + this.numElements + " elements");
		}
	}

	@Override
	public void addSorted(E element) {
		// TODO Auto-generated method stub
		
	}

	// curIndex  3
	// curNode                     *
	//           0     1     2     3     4
	//    H --> a|--> b|--> e|--> c|--> d|x
	//    T -----------------------------^
	// numElements = 4
	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if ((index >= 0) && (index < this.numElements)) {
			LinkedListNode<E> curNode = this.head;
			int curIndex = 0;
			
			while (curIndex < index) {
				curNode = curNode.getNext();
				curIndex++;
			}

			return curNode.getElement();
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
							" is invalid for an array with only " + this.numElements + " elements");
		}
	}

	@Override
	public E replace(E element, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeAll() {
		this.head = null;
		this.tail = null;
		this.numElements = 0;
	}

}
