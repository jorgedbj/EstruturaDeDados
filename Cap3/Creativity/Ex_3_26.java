// C-3.26 Give an algorithm for concatenating two doubly linked lists L and M, with header and trailer
// sentinel nodes, into a single list L′.

public DoublyLinkedList<E> concatenate (DoublyLinkedList<E> L1, DoublyLinkedList<E> L2) {
	Node<E> auxL1 = L1.header.getNext();
	Node<E> auxL2 = L2.header.getNext();
	DoublyLinkedList<E> newList = new DoublyLinkedList<E>();

	while (auxL1.getNext() != null) {
		newList.addLast(auxL1.getElement());
		auxL1 = auxL1.getNext();
	}
	while (auxL2.getNext() != null) {
		newList.addLast(auxL2.getElement());
		auxL2 = auxL2.getNext();
	}

	return newList;
}
