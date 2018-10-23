package ds.queue;

public class Queue {

	private int size; //slot of array
	private long[] queArray; //array to store elements
	private int front; //index position for element in front
	private int rear; // index position for element in last
	private int nItems; // counter to maintain items in queue

	public Queue(int size) {
		this.size  = size;
		this.queArray = new long[size];
		front = 0; // front index position of a array
		rear = -1; // rear index position of an array
		nItems = 0; // counter is initialized to 0 
	}

	public void insert(long value) {
		
			// this overrides the last element inserted with new element this is circular queue
			if(rear == size-1) {
				rear = -1;
			}
			rear++;
			queArray[rear] = value;
			nItems++;
		
	}
	public long remove() { // remove item from front of array

		if(isEmpty()) {
			System.out.println("Queue is empty");
			return -1;
		} else {
			long item = queArray[front] ;
			front++;
			if(front == size) { // so that we can reuse the array if array is empty
				front = 0;
			}
			nItems--;
			return item;
		}

	}

	public long peekFront() {
		return queArray[front];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == size);
	}

	public void view() {	
		for(int i = 0; i < queArray.length-1; i++) {
			System.out.println(queArray[i]+" ");
		}
	}

}
