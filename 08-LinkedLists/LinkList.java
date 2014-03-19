import java.util.*;
import java.io.*;

public class LinkList {

	private Node head;

	public LinkList() {
		head = null;
	}

	public String toString() {
		Node tmp = head;
		String s = "";
		while (tmp != null) {
			s = s + tmp + ", ";
			tmp = tmp.getNext();
		}
		return s;
	}

	public void add(String d) {
		Node tmp = new Node(d);
		tmp.setNext(head);
		head=tmp;
    	}

	public void add(int i, String s) {
		if (i == 0)
			add(s);
		Node n = head;
		for (int j = 0; j<i; j++)
			n = n.getNext();
		Node temp = new Node(s);
		temp.setNext(n.getNext());
		n.setNext(temp);
	}

	public String get(int i) {
		int j = 0;
		Node n = head;
		for (; j<i; j++)
			n = n.getNext();
		return n.getData();
	}

	public String set(int i, String s) {
		Node n = head;
		for (int j = 0; j<i; j++)
			n = n.getNext();
		String r = n.getData();
		n.setData(s);
		return r;
	}

	public String remove(int i){
		Node n = head;
		if (i == 0) {
			head = head.getNext();
			return n.getData();
		}
		for (int j = 1; j<i; j++)
			n = n.getNext();
		Node r = n.getNext();
		n.setNext(n.getNext().getNext());
		return r.getData();
	}

	public String find(int i) {
		Node n = head;
		for (int j = 0; j<i; i++)
			n = n.getNext();
		return n.getData();
	}

	public int length() {
		Node n = head;
		int r = 0;
		while (n != null) {
			n = n.getNext();
			r++;
		}
		return r;
	}
			












}
