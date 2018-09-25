package ds.graph;

public class App {
	
	public static void main(String []args) {
		Graph graph = new Graph(5);
		graph.addEdges(0, 1);
		graph.addEdges(0, 2);
		graph.addEdges(0, 3);
		graph.addEdges(1, 2);
		graph.addEdges(1, 4);
		graph.addEdges(2, 3);
		graph.addEdges(3, 1);
		graph.addEdges(4, 0);
		graph.addEdges(4, 3);
		
		Object[] adjacentVertex = graph.adj(0);
		for(Object values : adjacentVertex)
			 System.out.println(values);
		
	}

}
