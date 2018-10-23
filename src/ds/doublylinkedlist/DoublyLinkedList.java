package ds.doublylinkedlist;

public class DoublyLinkedList {

	public Node first;
	public Node last;

	public DoublyLinkedList() {
		this.first = first;
		this.last = last;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int data) {
		Node newNode = new Node();
		newNode.data = data;

		if(isEmpty()) {
			last = newNode;
		} else {
			first.previous = newNode;
		}
		newNode.next = first;
		this.first = newNode;
	}

	public void insertLast(int data) {
		Node lastNode  = new Node();
		lastNode.data = data;
		
		if(isEmpty()) {
			first = lastNode;
		} else {
		last.next = lastNode;
		lastNode.previous = last;
		}
		
		this.last = lastNode;
	}
	
	public Node deleteFirst() {
		
		Node temp  = first;
		if(first.next == null) {
			last = null;
		} else {
			first.next.previous = null;
		}
		first = first.next;
		return temp;
	}
	
	public Node deleteLast() {
		
		Node temp = last;
		if(first.next == null) {
			first = null;
		} else {
			last.previous.next = null;
		}
		last.previous = last;
		return temp;
	}
	
	public  boolean insertAfter(int key, int data) {
		Node current = first;
		
		while(current.data != key) {
			current = current.next;
			if(current == null) 
				return false;
		}
		
		Node newNode = new Node();
		newNode.data = data;
		
		if(current == last) {
			current.next = null;
			last = newNode;
			
		}else {
			newNode.next = current.next;
			current.next.previous = newNode;
			
		}
		current.next = newNode;
		newNode.next = last;
		
		return true;
			
		}
	
	public Node deleteKey(int key) {
		
		Node current = first;
		
		while(current.data != key) {
			   current = current.next;
			   if(current == null) {
				   return null;
			   }
			   Node newNode = new Node();
			   if(current == first) {
				   first = current.next;
				   current.next.previous = current.next;
			   }
			   
			   if(current == last) {
				   last = current.previous;
			   }else {
				   current.next.previous = current.previous;
			   }
		}
		return current;
	}
		
}
	