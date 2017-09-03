// R-3.16 Implement the equals() method for the DoublyLinkedListclass.

public boolean equals(DoublyLinkedList<E> list) {
	if (list.size() != this.size()) { return false; }
	Node<E> auxList1 = header;
	Node<E> auxList2 = list.header;
	while (auxList1 != null) {
		if (auxList1.getElement() != auxList2.getElement()) { return false; }
		auxList1 = auxList1.getNext();
		auxList2 = auxList2.getNext();
	}
	return true;
}
