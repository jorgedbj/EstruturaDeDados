// R-3.15 Implement the equals() method for the CircularlyLinkedList class, assuming that two lists
// are equal if they have the same sequence of elements, with correspond- ing elements currently
// at the front of the list.

public boolean equals(CircularlyLinkedList<E> list) {
	if (list.size() != this.size()) { return false; }
	Node<E> auxList1 = tail;
	Node<E> auxList2 = list.tail;
	do {
		if (auxList1.getElement() != auxList2.getElement()) { return false; }
		auxList1 = auxList1.getNext();
		auxList2 = auxList2.getNext();
	} while (auxList1 != tail);
	return true;
}
