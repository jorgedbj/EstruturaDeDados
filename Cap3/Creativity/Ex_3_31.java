// C-3.31 Our implementation of a doubly linked list relies on two sentinel nodes, header and trailer,
// but a single sentinel node that guards both ends of the list should suffice. Reimplement the
// DoublyLinkedList class using only one sentinel node.

public class DoublyLinkedListReimplemented<E> {

	private static class Node<E> {

		private E element;               // reference to the element stored at this node

		private Node<E> prev;            // reference to the previous node in the list

		private Node<E> next;            // reference to the subsequent node in the list

		public Node(E e, Node<E> p, Node<E> n) {
			element = e;
			prev = p;
			next = n;
		}

		public E getElement() { return element; }

		public Node<E> getPrev() { return prev; }

		public Node<E> getNext() { return next; }

		public void setPrev(Node<E> p) { prev = p; }

		public void setNext(Node<E> n) { next = n; }
	}

	private Node<E> sentinel;                    // header and trailer sentinels

	private int size = 0;                      // number of elements in the list

	public DoublyLinkedListReimplemented() {
		sentinel = new Node<>(null, null, null);      // create header
	}

	public int size() { return size; }

	public boolean isEmpty() { return size == 0; }

	public E first() {
		if (isEmpty()) return null;
		return sentinel.getPrev().getElement();   // first element is beyond header
	}

	public E last() {
		if (isEmpty()) return null;
		return sentinel.getNext().getElement();    // last element is before trailer
	}

	public void addFirst(E e) {
		addBetween(e, null, sentinel.getPrev());    // place just after the header
	}

	public void addLast(E e) {
		addBetween(e, sentinel.getNext(), null);  // place just before the trailer
	}

	public E removeFirst() {
		if (isEmpty()) return null;                  // nothing to remove
		return remove(sentinel, 'f');             // first element is beyond header
	}

	public E removeLast() {
		if (isEmpty()) return null;                  // nothing to remove
		return remove(sentinel, 'l');            // last element is before trailer
	}

	private void addBetween(E e, Node<E> predecessor, Node<E> successor) {
		// create and link a new node
		Node<E> newest = new Node<>(e, predecessor, successor);
		if (predecessor == null) {
			if (size != 0) {
				successor.setPrev(newest);
			}
			sentinel.setPrev(newest);
		}
		if (successor == null) {
			if (size != 0) {
				predecessor.setNext(newest);
			}
			sentinel.setNext(newest);
		}
		size++;
	}

	private E remove(Node<E> node, char option) {
		E aux;
		// Remove first 
		if (option == 'f') {
			aux = node.getPrev().getElement();
			node.getPrev().getNext().setPrev(null);
			node.setPrev(node.getPrev().getNext());
		} 
		// Remove last
		else {
			aux = node.getNext().getElement();
			node.getNext().getPrev().setNext(null);
			node.setNext(node.getNext().getPrev());
			
		}
		return aux;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("(");
		Node<E> walk = sentinel.getPrev();
		while (walk != null) {
			sb.append(walk.getElement());
			walk = walk.getNext();
			if (walk != null)
				sb.append(", ");
		}
		sb.append(")");
		return sb.toString();
	}
}
