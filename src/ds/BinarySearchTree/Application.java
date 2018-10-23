package ds.BinarySearchTree;


public class Application {
	
	public static void main(String []args) {
		
		
		BST tree = new BST();
		tree.insert(1,  "chikku");
		tree.insert(12,  "chintu");
		tree.insert(7,  "chikkupapa");
		tree.insert(90,  "europe");
		tree.insert(100,  "Android");
		
		
		
		System.out.println(tree.findMin().value);
		System.out.println(tree.findMax().value);
		
	}

}
