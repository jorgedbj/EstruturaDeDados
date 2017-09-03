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
