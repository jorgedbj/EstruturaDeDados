// R-3.8 Describe a method for finding the middle node of a doubly linked list with header and trailer
// sentinels by “link hopping,” and without relying on explicit knowledge of the size of the list.
// In the case of an even number of nodes, report the node slightly left of center as the “middle.”
// What is the running time of this method?

public Node<E> findMiddle() {
	Node<E> walkHead = header;
	Node<E> walkTrailer = trailer;
	while (walkHead.getNext() != walkTrailer.getPrev()) {
		if (walkHead == walkTrailer.getPrev()) {
			return walkHead;
		}
		walkHead = walkHead.getNext();
		walkTrailer = walkTrailer.getPrev();
	}
	return walkHead.getNext();
}
