package com.graphs;

import java.util.Stack;

public class DFS {
	private Stack<Vertex> exploreStack = new Stack<Vertex>();
	public static void main(String[] args) {
		GraphRepresentation myGraph = GraphRepresentation.createGraph();
		DFS dfs = new DFS();
		
		System.out.println("DFS Steps\n");
			dfs.traverseGraph(myGraph);
	}
	private void traverseGraph(GraphRepresentation myGraph) {
		exploreGraph(myGraph.getVertices()[0]);
	}
	private void exploreGraph(Vertex vertex) {
		if(vertex.isVisited()) {
			return;
		}
		vertex.setVisited(true);
		System.out.print(vertex.getVertexWeight()+"\t");
		
		
		for(int i=0;i < vertex.getNeighbour().size();i++) {
			Vertex nextVertex = vertex.getNeighbour().get(i);			
			if(!nextVertex.isVisited()) {
				exploreStack.add(vertex);
				exploreGraph(nextVertex);
			}
		}
		    if(!exploreStack.isEmpty()) {			    	
		    	Vertex temp = exploreStack.pop();
				exploreGraph(temp);
		    }				
		}
	
}
