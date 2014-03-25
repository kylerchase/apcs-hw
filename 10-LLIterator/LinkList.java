import java.util.*;
import java.io.*;

public class LinkList<E> implements Iterable<E>{

	private Node<E> head;
	private Node<E> tail;

	public LinkList() {
		head = new Node<E>();
		tail = head;
	}

	public String toString() {
		Node<E> tmp = head.getNext();
		String s = "";
		while (tmp != null) {
			s = s + tmp + ", ";
			tmp = tmp.getNext();
		}
		return s;
	}

	public void add(E d) {
		Node<E> tmp = new Node<E>(d);
		tmp.setNext(head.getNext());
		head.setNext(tmp);
		if (tmp.getNext() == null)
			tail = tmp;
    	}

	public void addEnd(E d) {
		tail.setNext(new Node<E>(d));
		tail = tail.getNext();
	}

	public void add(int i, E s) {
		if (i == 0) {
			add(s);
			return;
		}
		Node<E> n = head.getNext();
		for (int j = 0; j<i; j++)
			n = n.getNext();
		Node<E> temp = new Node<E>(s);
		temp.setNext(n.getNext());
		n.setNext(temp);
		if (temp.getNext() == null)
			tail = temp;
	}


	public E get(int i) {
		int j = 0;
		Node<E> n = head.getNext();
		for (; j<i; j++)
			n = n.getNext();
		return n.getData();
	}

	public E set(int i, E s) {
		Node<E> n = head.getNext();
		for (int j = 0; j<i; j++)
			n = n.getNext();
		E r = n.getData();
		n.setData(s);
		return r;
	}

	public E remove(int i){
		Node<E> n = head.getNext();
		if (i == 0) {
			head.setNext(n.getNext());
			return n.getData();
		}
		else if (i >= length() - 1) {
			for (int j = 1; j<i-1; j++)
				n = n.getNext();
			tail = n;
			Node<E> r = n.getNext();
			n.setNext(null);
			return r.getData();
		}
		else {			
			for (int j = 1; j<i; j++)
				n = n.getNext();
			Node<E> r = n.getNext();
			n.setNext(n.getNext().getNext());
			return r.getData();
		}
	}

	public E find(int i) {
		Node<E> n = head.getNext();
		for (int j = 0; j<i; i++)
			n = n.getNext();
		return n.getData();
	}

	public int length() {
		Node<E> n = head.getNext();
		int r = 0;
		while (n != null) {
			n = n.getNext();
			r++;
		}
		return r;
	}
			
	public Iterator<E> iterator() {
		return new LLIterator(head);
	}











}
