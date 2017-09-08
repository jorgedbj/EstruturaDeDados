// R-3.9 Give an implementation of the size() method for the SingularlyLinkedList class, assuming
// that we did not maintain size as an instance variable.

public int getSize() {
	int sizeList = 0;
	Node<E> walk = head;
	while (walk != null) {
		sizeList++;
		walk = walk.getNext();
	}
	return sizeList;
}
