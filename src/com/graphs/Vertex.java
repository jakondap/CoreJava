package com.graphs;

import java.util.ArrayList;
import java.util.List;

public class Vertex {
	private int vertexWeight;
	private boolean isVisited;
	
	List<Vertex> neighbour = new ArrayList<Vertex>();
	
	public int getVertexWeight() {
		return vertexWeight;
	}
	public void setVertexWeight(int vertexWeight) {
		this.vertexWeight = vertexWeight;
	}
	public boolean isVisited() {
		return isVisited;
	}
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	
	/**
	 * @return the neighbour
	 */
	public List<Vertex> getNeighbour() {
		return neighbour;
	}
	/**
	 * @param neighbour the neighbour to set
	 */
	public void setNeighbour(List<Vertex> neighbour) {
		this.neighbour = neighbour;
	}
	
}
