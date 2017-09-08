// C-3.30 Given a circularly linked list L containing an even number of nodes, describe how to
// split L into two circularly linked lists of half the size.

public CircularlyLinkedList<E> split () {
	if (this.size() % 2 != 0) { return null; }
	Integer counter = 0, metade = this.size() / 2;
	CircularlyLinkedList<E> halfList = new CircularlyLinkedList<E>();
	do {
		halfList.addLast(this.removeFirst());
		counter++;
	} while (counter != metade);
	return halfList;
}
