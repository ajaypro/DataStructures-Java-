package ds.queue;

public class App {

	public static void main(String[] args) {
		
		Queue queue = new Queue(5);
		queue.insert(130);
		queue.insert(450);
		queue.insert(120);
		queue.insert(670);
		queue.insert(340);
		queue.insert(440);
		queue.insert(40);
		queue.insert(40);
		queue.view();
		


	}

}
