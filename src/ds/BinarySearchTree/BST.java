package ds.BinarySearchTree;


//Implementation class 

public class BST{

	private Node root;

	public void insert(int key, String value) {

		Node newNode = new Node(key, value);

		if(root == null) {	
			root = newNode;
		} 
		else {
			Node current = root; 
			/**
			 *  we have only root as a node so we are assuming it as current
			 *  node but current keeps changing as it will be reassigned 
			 */
			Node parent; 

			while(true) { 
				parent = current;
				if(key < current.key) {
					// we advance current here and it moves down the left so we are reassigning it 
					current = current.leftNode;
					// It reaches to position where current is null and we assign the value there.
					if(current == null) {
						parent.leftNode = newNode;
						return;
					} 
				} else {
					current = current.rightNode;
					if(current == null) {
						parent.rightNode = newNode;
						return;
					}
				}

			}
		}
	}

	//Insert method for java8


	public Node findMin() {

		Node current = root;
		Node last = null;

		while(current != null) {
			last = current;
			current = current.leftNode;
		}
		return last;
	}

	public Node findMax() {
		Node current = root;
		Node last = null;

		while(current != null) {
			last = current;
			current = current.rightNode;
		}
		return last;
	}

	/**
	 * Removing or Deleting nodes in BST 
	 * deleting a node
	 * we have to make its parent(left or right node ) to be null

  deleting a node with a child 
	 * we make the node to be deleted as null and plug its subtree to its parent position 
     i.e parent.leftnode 

  deleting 1 node which has 2 child nodes and which has further nodes
	 * Implement in-order successor technique 
	 * We need to find the least largest of the deleting node (all larger nodes are on right side and choosing the smallest of them to replace the
  deleting node)
	 * We implement that by choosing the right side(larger side) and keep going left till we reach left node = null and assign it parent.leftNode = current

	 */

	
	public  boolean removeNode(int key) {

		Node currentNode = root;
		Node parentNode = root;
		boolean isLeftNode = false;

		//Searching for the given node 

		while(currentNode.key != key) {
			parentNode = currentNode;
			if(key< currentNode.key) {
				isLeftNode = true;
				currentNode = currentNode.leftNode;
			} else {
				isLeftNode = false;
				currentNode = currentNode.rightNode;
			} if (currentNode == null) {
				return false;
			}
		}

		/**
		 * when existing out of this while loop means we found 
		 * the node
		 */

		// found the node
		Node nodeToDelete = currentNode;

		// if node is leaf( no children)
		if(nodeToDelete.leftNode == null && nodeToDelete.rightNode == null) {

			if(nodeToDelete == root) {
				root = null;
			} else if( isLeftNode) {
				parentNode.leftNode = null;
			} else {
				parentNode.rightNode = null;
			}
			
			/**
			 * IF NODE HAS ONE CHILD
			 */
			
			// if node has one child that is left		
		} else if(nodeToDelete.rightNode == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.leftNode;
			}else if(isLeftNode) {
				parentNode.leftNode = nodeToDelete.leftNode;
			}else {
				parentNode.rightNode = nodeToDelete.leftNode;
			}
		}
		// if node has one child that is right
		else if(nodeToDelete.leftNode == null) {
			if(nodeToDelete == root) {
				root = nodeToDelete.rightNode;
			}else if(isLeftNode) {
				parentNode.rightNode = nodeToDelete.rightNode;
			}else {
				parentNode.leftNode = nodeToDelete.rightNode;
			}
		}
		
		// if node has 2 children
	  else {
		 Node successor =  getSuccessor(nodeToDelete);
		 if(nodeToDelete == root) {
			 root = successor;
	}
		 if(isLeftNode) {
			 parentNode.leftNode = successor;
		 } else {
			 parentNode.rightNode = successor;
		 }
		  successor.leftNode = nodeToDelete.leftNode;
		  
		 
}
		return true;
	}

	private Node getSuccessor(Node nodeToDelete) {
		Node successorParent = nodeToDelete;
		Node successor = nodeToDelete;
		
		Node current = nodeToDelete.rightNode;
		while(current != null) {
			successorParent = successor;
			successor = current;
			current = current.leftNode;
		}
		// At this point we have found successorParent and successor
		
		
		
		return successor;
		}
		
		
		
}

