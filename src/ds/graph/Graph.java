package ds.graph;

import java.util.ArrayList;

public class Graph {
	
	private int vCount; // no of count for vertices
	private int eCount; // no of count for edges
	private ArrayList<Integer>[] adjacents; // array of integer lists
	
	public Graph(int vCount) {
		this.vCount = vCount;
		this.eCount = 0;
		adjacents = new ArrayList[vCount];
		
		// For every count of vCount in array we have an arraylist of edges created
		for(int i = 0; i< vCount; i++) {
			adjacents[i] = new ArrayList<Integer>();
		}	
	}
	
	public int getVertices() {
		return vCount;
	}
	
	public int getEdges() {
		return eCount;
	}
	
	public void addEdges(int sorVertice, int desVertice) {
		 // For each source we add destination and increment edge count                                                         
		// the desVertice will be added to the list as each adjacent has edges stores as list
		adjacents[sorVertice].add(desVertice);
		eCount++;
	}
	
	//This method turns all Vertices adjacent to given vertex
	// These destination vertices are added  by giving sourcevertex in previous method addEdges()
	public Object[] adj(int sorVertice) {
		return adjacents[sorVertice].toArray();
	}
 
}
