// Give an algorithm for finding the second-to-last node in a singly linked list in which the last node
// is indicated by a null next reference.

public E findSecondLast() {
	if (size <= 1) {
		return null;
	} else {
		Node<E> walk = head;
		while (walk != null) {
			if (walk.getNext().getNext() == null) {
				break;
			}
			walk = walk.getNext();
		}
		return walk.getElement();
	}
}
