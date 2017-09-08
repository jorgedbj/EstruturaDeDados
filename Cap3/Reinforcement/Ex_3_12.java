// R-3.12 Implement a rotate() method in the SinglyLinkedList class, which has semantics equal to
// addLast(removeFirst()), yet without creating any new node.

public void rotate () {
	if (isEmpty()) { return; }
	Node<E> aux = head.getNext();
	head.setNext(null);
	tail.setNext(head);
	head = aux;
	tail = tail.getNext();
}
