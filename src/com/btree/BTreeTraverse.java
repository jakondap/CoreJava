package com.btree;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class BTreeTraverse {
	
	private Stack<BTreeNode> exploreStack = new Stack<BTreeNode>();
	private Queue<BTreeNode> exploreQueue = new ArrayDeque <BTreeNode>();
	
	private BTreeNode root ;
	public static void main(String[] args) {
		BTreeTraverse bTreeTraverse = new BTreeTraverse();
		bTreeTraverse.initBTree();
		
		bTreeTraverse.dfsExplore(bTreeTraverse.root);
		//bTreeTraverse.bfsExplore(bTreeTraverse.root);
	}
	private void initBTree() {
		root = new BTreeNode();
		BTreeNode node1 = new BTreeNode();
		BTreeNode node2 = new BTreeNode();
		BTreeNode node3 = new BTreeNode();
		
		BTreeNode node4 = new BTreeNode();
		BTreeNode node5 = new BTreeNode();
		
		node1.setWeight(1);
		node2.setWeight(2);
		node3.setWeight(3);
		
		node4.setWeight(4);
		node5.setWeight(5);
		
		
		node1.setLeft(node3);
		node1.setRight(node4);
		
		node2.setLeft(node5);
		root.setLeft(node1);
		root.setRight(node2);		
		
	}
	private void dfsExplore(BTreeNode root) {
	   if(!root.isVisited()) {
		   root.setVisited( true);
		   System.out.print(root.getWeight()+"\t");
	   }
	   if(root.getLeft() != null || root.getRight()!=null) {
		   if((root.getLeft() != null && !root.getLeft().isVisited()) && 
				   (root.getRight() != null && !root.getRight().isVisited())) {
			   exploreStack.push(root);
		   }
	   }else {
		   if(!exploreStack.isEmpty()) {
			   BTreeNode tobeExplored = exploreStack.pop();
			   dfsExplore(tobeExplored);
		   }
	   }
	   if(root.getLeft() !=null && !root.getLeft().isVisited() ) {
		   dfsExplore(root.getLeft());
	   }else if(root.getRight() !=null && !root.getRight().isVisited() ) {
		   dfsExplore(root.getRight());
	   }
	}
	private void bfsExplore(BTreeNode root) {
		
		if(!root.isVisited()) {
			root.setVisited(true);
			System.out.print(root.getWeight()+"\t");
		}
		if(root.getLeft() !=null && !root.getLeft().isVisited()) {
			root.getLeft().setVisited(true);
			System.out.print(root.getLeft().getWeight()+"\t");
		}
		if(root.getRight() !=null && !root.getRight().isVisited()) {
			root.getRight().setVisited(true);
			System.out.print(root.getRight().getWeight()+"\t");
		}
		
		if(root.getLeft() !=null && (root.getLeft().getLeft() !=null || root.getLeft().getRight() !=null)) {
			exploreQueue.add(root.getLeft());
		}
		if(root.getRight() !=null && (root.getRight().getLeft() !=null || root.getRight().getRight() !=null)) {
			exploreQueue.add(root.getRight());
		}
		if(exploreQueue.size() != 0) {
			bfsExplore(exploreQueue.remove());
		}
	}
}
