// C-3.35 Implement the clone() method for the DoublyLinkedListclass.

public DoublyLinkedList<E> clone () {
	DoublyLinkedList<E> newList = new DoublyLinkedList<E>();

	Node<E> walk = this.header.getNext();

	while (walk.getNext() != null) {
		newList.addLast(walk.getElement());
		walk = walk.getNext();
	}

	return newList;
}
