package com.graphs;

public class GraphRepresentation {
	private Vertex[] vertices = new Vertex[4];
	
	public static void main(String[] args) {
		GraphRepresentation myGraph = new GraphRepresentation();
		myGraph.initGraph(myGraph);
		
	}
	private void initGraph(GraphRepresentation myGraph) {
		Vertex vertex0 = new Vertex();
		vertex0.setVertexWeight(0);
		
		Vertex vertex1 = new Vertex();
		vertex1.setVertexWeight(1);
		
		Vertex vertex2 = new Vertex();
		vertex2.setVertexWeight(2);
		
		Vertex vertex3 = new Vertex();
		vertex3.setVertexWeight(3);
		
		Vertex vertex4 = new Vertex();
		vertex4.setVertexWeight(4);
		
		Vertex vertex5 = new Vertex();
		vertex5.setVertexWeight(5);
		
		vertex0.getNeighbour().add(vertex1);
		vertex0.getNeighbour().add(vertex2);
		
		vertex1.getNeighbour().add(vertex0);
		vertex1.getNeighbour().add(vertex3);
		
		vertex2.getNeighbour().add(vertex3);
		vertex2.getNeighbour().add(vertex0);
		
		vertex3.getNeighbour().add(vertex1);
		vertex3.getNeighbour().add(vertex4);
		vertex3.getNeighbour().add(vertex2);
		
		vertex4.getNeighbour().add(vertex5);
		
		myGraph.vertices[0]=vertex0;
		myGraph.vertices[1]=vertex1;
		myGraph.vertices[2]=vertex2;
		
		myGraph.vertices[3]=vertex3;
	}
	public static GraphRepresentation createGraph() {
		GraphRepresentation myGraph = new GraphRepresentation();
		myGraph.initGraph(myGraph);
		return myGraph; 
	}

	/**
	 * @return the vertices
	 */
	public Vertex[] getVertices() {
		return vertices;
	}

	/**
	 * @param vertices the vertices to set
	 */
	public void setVertices(Vertex[] vertices) {
		this.vertices = vertices;
	}
}
