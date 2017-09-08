// R-3.11 Give an implementation of the size() method for the DoublyLinkedList class, assuming that
// we did not maintain size as an instance variable.

public int getSize() {
	int sizeList = 0;
	Node<E> walk = header.getNext();
	while (walk != trailer) {
		sizeList++;
		walk = walk.getNext();
	}
	return sizeList;
}
