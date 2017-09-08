// C-3.27 Describe in detail how to swap two nodes x and y (and not just their contents) in a singly
// linked list L given references only to x and y. Repeat this exercise for the case when L is a doubly
// linked list. Which algorithm takes more time?

// Swap for the SinglyLinkedList
public void swap(Integer x, Integer y) {
	if (x > this.size || y > this.size) { return; }
	Integer max = (x > y) ? x : y;
	Integer min = (x > y) ? y : x;
	Integer counter = 0;
	Node<E> walk = this.head;
	Node<E> auxAntX = this.head;
	Node<E> auxX = this.head;
	Node<E> auxAntY = this.head;
	Node<E> auxY = this.head;

	while (walk != null) {
		if (counter == min-1) {
			auxAntX = walk;
			auxX = walk.getNext();
		}
		if (counter == max-1) {
			auxAntY = walk;
			auxY = walk.getNext();
			break;
		}
		counter++;
		walk = walk.getNext();
	}

	if (auxX == this.head) {
		this.head = auxY;
	} else {
		auxAntX.setNext(auxY);
	}

	if (auxY == this.tail) {
		this.tail = auxX;
	}

	Node<E> xNext;
	if (auxX.getNext() == auxY) {
		xNext = auxX;
	} else {
		xNext = auxX.getNext();
	}
	auxX.setNext(auxY.getNext());
	auxY.setNext(xNext);
	if (auxAntY != auxX) {
		auxAntY.setNext(auxX);
	}
}
