import java.util.*;
import java.io.*;

public class Driver {
	public static void main(String[] args) {

	HeapSort h = new HeapSort();

	h.add(13);
	h.add(42);
	h.add(99);
	h.add(4);
	h.add(9);
	h.add(14);
	System.out.println(h);
	
	System.out.println("///////////////");

	System.out.println(h.remove());

	System.out.println(h);

	h.add(99);
	System.out.println(Arrays.toString(h.sort()));

























	}
}
