// R-3.10 Give an implementation of the size() method for the CircularlyLinkedList class, assuming that
// we did not maintain size as an instance variable.

public int getSize() {
	if (tail == null) {
		return 0;
	}
	int sizeList = 0;
	Node<E> walk = tail;
	do {
		sizeList++;
		walk = walk.getNext();
	} while (walk != tail);
	return sizeList;
}
