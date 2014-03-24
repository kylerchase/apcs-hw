import java.util.*;
import java.io.*;

public class Node {
	private String data;
	private Node next;

	public Node(String d){
		data = d;
		next = null;
	}

	public String toString() {return data;}

	public String getData() {return data;}

	public void setData(String s) {
		data = s;
	}

	public Node getNext() {return next;}

	public void setNext(Node n) {
		next = n;
	}










}
