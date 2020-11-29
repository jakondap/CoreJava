package com.btree;

public class BTreeNode {
	private int weight;
	private BTreeNode left;
	private BTreeNode right;
	private boolean isVisited;
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the left
	 */
	public BTreeNode getLeft() {
		return left;
	}
	/**
	 * @param left the left to set
	 */
	public void setLeft(BTreeNode left) {
		this.left = left;
	}
	/**
	 * @return the right
	 */
	public BTreeNode getRight() {
		return right;
	}
	/**
	 * @param right the right to set
	 */
	public void setRight(BTreeNode right) {
		this.right = right;
	}
	/**
	 * @return the isVisited
	 */
	public boolean isVisited() {
		return isVisited;
	}
	/**
	 * @param isVisited the isVisited to set
	 */
	public void setVisited(boolean isVisited) {
		this.isVisited = isVisited;
	}
	

}
