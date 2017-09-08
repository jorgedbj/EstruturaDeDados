// C-3.28 Describe in detail an algorithm for reversing a singly linked list L using only a
// constant amount of additional space.

public void reverse() {
	if (size < 2) { return; }
	Node<E> ant = this.head;
	Node<E> aux = this.head.getNext();
	Node<E> prox = this.head.getNext().getNext();

	ant.setNext(null);

	while (prox != null) {
		aux.setNext(ant);
		ant = aux;
		aux = prox;
		prox = prox.getNext();
	}

	aux.setNext(ant);
	Node<E> headAux = this.head;
	this.head = this.tail;
	this.tail = headAux;
}
