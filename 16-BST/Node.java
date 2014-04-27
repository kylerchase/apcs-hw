import java.util.*;
import java.io.*;

public class Node {
	private int data;
	private Node left, right;

	public Node(int n) {
		data = n;
	}

	public void setLeft(Node n) {
		left = n;
	}

	public void setRight(Node n) {
		right = n;
	}

	public Node getRight() {return right;}
	public Node getLeft() {return left;}

	public String toString() {
		return ""+data;
	}

	public int getData() {return data;}

}
