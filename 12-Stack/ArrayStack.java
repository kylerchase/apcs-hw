import java.io.*;
import java.util.*;

public class ArrayStack {

	private String[] nodes;
	private int top;

	public ArrayStack() {
		nodes = new String[10];
		top = nodes.length-1;
	}

	public void grow() {
		String[] temp = new String[nodes.length+5];
		for (int i = 0; i <nodes.length; i++)
			temp[i+5] = nodes[i];
		nodes = temp;
		top = top+5;
	}

	public void push(String d) {
		if (nodes[top] == null) {
			nodes[top] = d;
			return;
		}
		else if (top == 0)
			grow();
		top--;
		nodes[top] = d;
	}

	public String pop() {
		String s = nodes[top];
		top++;
		return s;
	}

	public String peek() {
		return nodes[top];
	}

	public String toString() {
		String s = "";
		for (int i = top; i<nodes.length; i++)
			s = s + nodes[i] + ", ";
		return s;
	}

}














