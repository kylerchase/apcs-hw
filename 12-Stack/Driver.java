public class Driver {
	public static void main(String[] args) {

	ArrayStack as = new ArrayStack();
	for (int i = 0; i<16; i++)
		as.push(""+i);
	System.out.println(as);
	System.out.println(as.pop());
	System.out.println(as.pop());
	System.out.println(as);
	System.out.println(as.peek());



	}
}
