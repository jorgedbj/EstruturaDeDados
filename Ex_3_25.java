// C-3.25 Describe an algorithm for concatenating two singly linked lists L and M, into a single list L′
// that contains all the nodes of L followed by all the nodes of M.

public SingularlyLinkedList<E> concatenate(SingularlyLinkedList<E> L1, SingularlyLinkedList<E> L2) {
	Node<E> auxL1 = L1.head;
	Node<E> auxL2 = L2.head;
	SingularlyLinkedList<E> newList = new SingularlyLinkedList<E>();
	while (auxL1 != null) {
		newList.addLast(auxL1.getElement());
		auxL1 = auxL1.getNext();
	}
	while (auxL2 != null) {
		newList.addLast(auxL2.getElement());
		auxL2 = auxL2.getNext();
	}
	return newList;
}
