import java.util.*;
import java.io.*;

public class Node<E> {
	private E data;
	private Node<E> next;

	public Node(E d){
		data = d;
		next = null;
	}

	public Node(){
		data = null;
		next = null;
	}

	public String toString() {return "" + data;}

	public E getData() {return data;}

	public void setData(E s) {
		data = s;
	}

	public Node<E> getNext() {return next;}

	public void setNext(Node<E> n) {
		next = n;
	}










}
