import java.util.*;
import java.io.*;

public class RPN {

	public int op(String s) {
		ArrayStack as = new ArrayStack();
		int r = 0;
		String temp = "";
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i) > 47 && s.charAt(i) < 58)
				temp = temp + s.substring(i,i+1);
			else if (s.charAt(i) == ' ' && temp != "") {
				as.push(temp);
				temp = "";
			}
			else if (s.charAt(i) == 43) {
				r = Integer.parseInt(as.pop()) + Integer.parseInt(as.pop());
				as.push("" + r);
			}
			else if (s.charAt(i) == 42) {
				r = Integer.parseInt(as.pop()) * Integer.parseInt(as.pop());
				as.push("" + r);
			}
			else if (s.charAt(i) == 45) {
				r = Integer.parseInt(as.pop());
				r = Integer.parseInt(as.pop())-r;
				as.push("" + r);
			}
			else if (s.charAt(i) == 43) {
				r = Integer.parseInt(as.pop());
				r = Integer.parseInt(as.pop())/r;
				as.push("" + r);
			}
		}
		return Integer.parseInt(as.pop());
	}
				











}
