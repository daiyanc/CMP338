package Classwork.Lists;

public class LinkedListNode<E extends Comparable <? super E>> {

	private E element;
	private LinkedListNode<E> next;
	
	public LinkedListNode() {
		element = null;
		next = null;
	}
	
	public LinkedListNode(E element) {
		this.element = element;
		next = null;
	}

	public E getElement() {
		return element;
	}

	public void setElement(E element) {
		this.element = element;
	}

	public LinkedListNode<E> getNext() {
		return next;
	}

	public void setNext(LinkedListNode<E> next) {
		this.next = next;
	}
}
