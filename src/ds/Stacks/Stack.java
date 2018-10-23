package ds.Stacks;

public class Stack {

	private int size; // Size of stack 
	private long stackArray[];
	private int top; 

	public Stack(int size) {
		this.size = size;
		this.stackArray = new long[size];
		this.top = -1; // denotes the last element in the stack.

	}

	public void push(long value) {
		// we throw exception if user tries to insert more than the actual size.
		
		if(isFull()) {
			System.out.println("Items cannot be inserted in stack");
		} else {

			top++; // increment index position
			stackArray[top] = value; // assign value to index position
		}
	}

	public long pop() {
		
		if(isEmpty()) {
			System.out.println("Items cannot be popped out anymore");
			return -1;
		} else {
			long item = stackArray[top];
			top--;
			return item;		
		}
		
		
		//another method
		/*int tempTop = top;
		top--;
		return stackArray[tempTop];*/
	}

	// to view what was last inserted
	public long peak() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1); // when stack is empty it wil be -1
	}

	public boolean isFull() {
		return (size -1 == top); // We have -1 because size is size of array, top is index position and every array starts with 
		// index position 0, so we need to do arraylength() -1
	}

}
