package ds.Stacks;

public class App {

	public static void main(String[] args) {
		Stack stack = new Stack(5);
		stack.push(20);
		stack.push(50);
		stack.push(30);
		stack.push(80);
		stack.push(90);
		stack.push(100);
		
		// poping out elements of stack
		
		while(!stack.isEmpty()) {
			long value = stack.pop();
			System.out.println(value);
			// The results print LIFO like 90,80,30... this is helpful in solving many problems 
		}
		
	}
	public String reverseString(String str) {
		int length = str.length();
		Stack stack = new Stack(length);
		for(int i=0; i< length; i++) {
			char ch = str.charAt(i);
			stack.push(ch);
		}
		
		String result = "";
		while(!stack.isEmpty()) {
			/*char ch = stack.pop();   // Ensure in pop(), push() method returns types are changed to char to run this method
			result = result+ch;
			System.out.println(value);*/	 
		}
		return result;
	}

}
