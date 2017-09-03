// R-3.7 Consider the implementation of CircularlyLinkedList.addFirst, in Code Fragment 3.16.
// The else body at lines 39 and 40 of that method relies on a locally declared variable, newest.
// Redesign that clause to avoid use of any local variable.

public void addFirst(E e) {
    if (size == 0) {
      tail = new Node<>(e, null);
      tail.setNext(tail);
    } else {
      tail.setNext(new Node<>(e, tail.getNext()));
    }
    size++;
}
