import java.util.*;
import java.io.*;

public class LinkList {

	private Node head;
	private Node tail;

	public LinkList() {
		head = new Node("");
		tail = head;
	}

	public String toString() {
		Node tmp = head.getNext();
		String s = "";
		while (tmp != null) {
			s = s + tmp + ", ";
			tmp = tmp.getNext();
		}
		return s;
	}

	public void add(String d) {
		Node tmp = new Node(d);
		tmp.setNext(head.getNext());
		head.setNext(tmp);
		if (tmp.getNext() == null)
			tail = tmp;
    	}

	public void addEnd(String d) {
		tail.setNext(new Node(d));
		tail = tail.getNext();
	}

	public void add(int i, String s) {
		if (i == 0) {
			add(s);
			return;
		}
		Node n = head.getNext();
		for (int j = 0; j<i; j++)
			n = n.getNext();
		Node temp = new Node(s);
		temp.setNext(n.getNext());
		n.setNext(temp);
		if (temp.getNext() == null)
			tail = temp;
	}


	public String get(int i) {
		int j = 0;
		Node n = head.getNext();
		for (; j<i; j++)
			n = n.getNext();
		return n.getData();
	}

	public String set(int i, String s) {
		Node n = head.getNext();
		for (int j = 0; j<i; j++)
			n = n.getNext();
		String r = n.getData();
		n.setData(s);
		return r;
	}

	public String remove(int i){
		Node n = head.getNext();
		if (i == 0) {
			head.setNext(n.getNext());
			return n.getData();
		}
		else if (i >= length() - 1) {
			for (int j = 1; j<i-1; j++)
				n = n.getNext();
			tail = n;
			Node r = n.getNext();
			n.setNext(null);
			return r.getData();
		}
		else {			
			for (int j = 1; j<i; j++)
				n = n.getNext();
			Node r = n.getNext();
			n.setNext(n.getNext().getNext());
			return r.getData();
		}
	}

	public String find(int i) {
		Node n = head.getNext();
		for (int j = 0; j<i; i++)
			n = n.getNext();
		return n.getData();
	}

	public int length() {
		Node n = head.getNext();
		int r = 0;
		while (n != null) {
			n = n.getNext();
			r++;
		}
		return r;
	}
			












}
