import java.util.*;
import java.io.*;

public class BST {
	private Node root;

	public BST(Node n) {
		root = n;
	}

	public void insert(int x, Node n;) {
		Node tmp = n;
		Node next = n;
		while (next != null) {
			tmp = next;
			if (x > tmp.getData())
				next = tmp.getRight();
			else
				next = tmp.getLeft();
		}
		if (x > tmp.getData())
			tmp.setRight(new Node(x));
		else
			tmp.setLeft(new Node(x));
	}
			
	public Node search(int x) {
		Node tmp = root;
		while (tmp != null) {
			if (x > tmp.getData())
				tmp = tmp.getRight();
			else if (x < tmp.getData())
				tmp = tmp.getLeft();
			else
				return tmp;
		}
		return null;
	}

	public Node Search2(int x) {
		return Search2_help(x, root);
	}

	public Node Search2_help(int x, Node n) {
		if (n == null)
			return null;
		else if (n.getData() == x)
			return n;
		else if (x > n.getData())
			return Search2_help(x,n.getRight());
		else
			return Search2_help(x,n.getLeft());
	}
		
	public void delete(int x) {
		Node tmp = root;
		Node r,l,n;
		while (tmp != null) {
			if (tmp.getRight().getData() == x) {
				n = tmp.getRight();
				r = tmp;
				tmp = null;
			}
			else if (tmp.getLeft().getData() == x) {
				n = tmp.getLeft();
				l = tmp;
				tmp = null;
			}
			else if (x > tmp.getData())
				tmp = tmp.getRight();
			else if (x < tmp.getData())
				tmp = tmp.getLeft();
		}
		if (r != null) {
			r.setRight(n.getRight());
			tmp = n.getLeft();
			while (tmp != null) {
				if (tmp.getValue() < r.getValue()) {
					delete(tmp.getValue());
					insert(tmp.getValue(), r);
					return;
				"
			}

		else
			n.setLeft(r.getLeft());
	









}
