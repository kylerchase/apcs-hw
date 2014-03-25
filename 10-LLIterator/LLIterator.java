import java.util.*;
import java.io.*;

public class LLIterator<E> implements Iterator<E> {

	private Node<E> current;
	

	public LLIterator(Node<E> n) {
		current = n;
	}

	public boolean hasNext() {
		if (current.getNext() == null)
			return false;
		else
			return true;
	}

	public E next() {
		Node<E> n = current;
		current = current.getNext();
		return n.getData();
	}

	public void remove() {}









}
