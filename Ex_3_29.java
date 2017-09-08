// C-3.29 Suppose you are given two circularly linked lists, L and M. Describe an algorithm for telling
// if L and M store the same sequence of elements (but perhaps with different starting points).

public boolean sameSequence (CircularlyLinkedList<E> L, CircularlyLinkedList<E> M) {
	if (L.getSize() != M.getSize()) { return false; }
	Node<E> auxL = L.tail;
	Node<E> auxM = M.tail;
	Integer elementsEqual = 0;

	do {
		if (auxL.getElement() == auxM.getElement()) {
			elementsEqual++;
			do {
				auxL = auxL.getNext();
				auxM = auxM.getNext();
				if (auxL.getElement() == auxM.getElement()) {
					elementsEqual++;
					if (elementsEqual == L.size()) {
						return true;
					}
				}
			} while (auxL != L.tail);
			return false;
		}
		auxM = auxM.getNext();
	} while (auxM != M.tail);
	return false;
}
