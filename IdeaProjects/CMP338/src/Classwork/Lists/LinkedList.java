package Classwork.Lists;

public class LinkedList<E extends Comparable <? super E>> implements ListInterface<E> {

	private LinkedListNode<E> head;
	private LinkedListNode<E> tail;
	private int numElements;
	
	public LinkedList() {
		head = null;
		tail = null;
		numElements = 0;
	}
	
	@Override
	public ListInterface<E> copy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		return numElements;
	}

	@Override
	public boolean isEmpty() {
		return (numElements == 0);
	}

	@Override
	public void add(E element) {
		LinkedListNode<E> newNode = new LinkedListNode(element);

		if (isEmpty()) {
			head = newNode;
			tail = newNode;
			numElements = 1;
		} else {
			tail.setNext(newNode);
			tail = newNode;
			numElements++;
		}
	}
	
	@Override
	public void add(E element, int index) throws IndexOutOfBoundsException {
		if (index < 0) {
			throw new IndexOutOfBoundsException("index = " + index + " is invalid");
		}
		
		if (index <= numElements) {
			LinkedListNode<E> newNode = new LinkedListNode(element);

			if (index == numElements) {
				this.add(element);
			} else {
				LinkedListNode<E> curNode = head;
				int curIndex = 0;
				
				if (index == 0) {
					newNode.setNext(head);
					head = newNode;
				} else {
					while (curIndex < index - 1) {
						curNode = curNode.getNext();
						curIndex++;
					}
					newNode.setNext(curNode.getNext());
					curNode.setNext(newNode);
				}
				
				
				numElements++;
			}
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
							" is invalid for an array with only " + numElements + " elements");
		}
	}

	@Override
	public void addSorted(E element) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public E get(int index) throws IndexOutOfBoundsException {
		if ((index >= 0) && (index < numElements)) {
			LinkedListNode<E> curNode = head;
			int curIndex = 0;
			
			if (index == 0) {
				return head.getElement();
			} else if (index == numElements - 1) {
				return tail.getElement();
			} else {
				while (curIndex < index) {
					curNode = curNode.getNext();
					curIndex++;
				}

				return curNode.getElement();
			}
			
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
							" is invalid for an array with only " + numElements + " elements");
		}
	}

	@Override
	public E replace(E element, int index) throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public E remove(int index) throws IndexOutOfBoundsException {
		if ((index >= 0) && (index < this.numElements)) {
			LinkedListNode<E> prevNode = null;
			LinkedListNode<E> curNode = head;
			int curIndex = 0;
			E removedElement;

			if (index == 0) {
				removedElement = head.getElement();
				head = head.getNext();
			} else {
				while (curIndex != index) {
					prevNode = curNode;
					curNode = curNode.getNext();
					curIndex++;
				}
				
				removedElement = curNode.getElement();
				
				if (curNode == tail) {
					prevNode.setNext(null);
					tail = prevNode;
				} else {
					prevNode.setNext(curNode.getNext());
				}
			}

			numElements--;
			return removedElement;
		} else {
			throw new IndexOutOfBoundsException("index = " + index + 
					" is invalid for an array with only " + numElements + " elements");
		}	
	}

	@Override
	public void removeAll() {
		head = null;
		tail = null;
		numElements = 0;
	}

	@Override
	public String toString() {
		StringBuilder output = new StringBuilder("numElements = " + this.numElements + "\n");
		if (numElements > 0) {
			output.append("head --> ");
			LinkedListNode<E> curNode = head;
			while (curNode != null) {
				if (curNode != tail) {
					output.append(curNode.getElement()).append(" --> ");
				} else {
					output.append(curNode.getElement());
				}
				curNode = curNode.getNext();
			}
			output.append("\n" + "tail --> ").append(tail.getElement()).append("\n\n");
		}
		return output.toString();
	}

	
	public static void main(String[] args) {
		LinkedList<Integer> ll = new LinkedList<>();
		
		for ( int i = 1 ; i < 12 ; i += 2) {
			ll.add(i);
		}
	
		System.out.println(ll);

		ll.add(6, 3);
		
		System.out.println(ll);

		ll.add(4, 2);
		
		System.out.println(ll);

		ll.add(13, 8);
		
		System.out.println(ll);
	
		Integer removedElement = ll.remove(5);
		
		System.out.println(ll);

		System.out.println("Removed Element = " + removedElement + "\n\n");
		
		removedElement = ll.remove(7);
		
		System.out.println(ll);

		System.out.println("Removed Element = " + removedElement + "\n\n");
		
		ll.add(-5, 0);
		
		System.out.println(ll);
		
		removedElement = ll.remove(0);
		
		System.out.println(ll);

		System.out.println("Removed Element = " + removedElement + "\n\n");
	}
}
