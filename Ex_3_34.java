// C-3.34 Implement the clone() method for the CircularlyLinkedList class.

public CircularlyLinkedList<E> clone () {
	CircularlyLinkedList<E> newList = new CircularlyLinkedList<E>();

	Node<E> walk = this.tail.getNext();

	do {
		newList.addLast(walk.getElement());
		walk = walk.getNext();
	} while (walk != this.tail.getNext());

	return newList;
}
