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
		
		//bTreeTraverse.dfsExplore(bTreeTraverse.root);
		//bTreeTraverse.bfsExplore(bTreeTraverse.root);
		//bTreeTraverse.inOrderTraverse(bTreeTraverse.root);
		//bTreeTraverse.levelTraverse(bTreeTraverse.root);
		bTreeTraverse.findNode(bTreeTraverse.root, 0);
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
	
	private void inOrderTraverse(BTreeNode root) {
		BTreeNode temp = root;
		
		while(temp!=null && temp.getLeft()!=null) {
			exploreStack.push(temp);
			temp = temp.getLeft();
		}
		temp = exploreStack.pop();
		String printStr = "";
		
		while(temp != root) {
			if(temp.getLeft()!=null) {
				printStr += temp.getLeft().getWeight();
			}
			printStr +="\t"+temp.getWeight();
			
			if(temp.getRight()!=null) {
				printStr += "\t"+ temp.getRight().getWeight();
			}
			 System.out.print("\t"+printStr);
			 temp = exploreStack.pop();
		}
		System.out.print("\t"+temp.getWeight());
		
		temp = root;
		while(temp!=null && temp.getRight()!=null) {
			exploreStack.push(temp);
			temp = temp.getRight();
		}
		
		temp = exploreStack.pop();
		while(temp != root) {
			if(temp.getLeft()!=null) {
				printStr += temp.getLeft().getWeight();
			}
			printStr +="\t"+temp.getWeight();
			
			if(temp.getRight()!=null) {
				printStr += temp.getRight().getWeight();
			}
			 System.out.println(printStr+"\t");
			 temp = exploreStack.pop();
		}
		
		
	}
	private void addElement(BTreeNode node) {
		int leftLevel = 0;
		int rightLevel = 0;
		if(root == null) {
			root = node;
		}else if(root.getLeft() == null) {
			root.setLeft(node);
		}else if(root.getLeft() == null) {
			root.setRight(node);
		}else {
			BTreeNode temp = root;
			while(temp.getLeft() != null) {
				if(temp.getLeft() == null) {
					temp.setLeft(node);
					return;
				}	
				else if(temp.getRight() == null) {
					temp.setRight(node);
					return;
				}	
				else if(temp.getLeft() != null && temp.getRight() != null) {
					leftLevel++;
					temp = temp.getLeft();
				}
			}
			temp = root;
			while(temp.getRight() != null) {
				if(temp.getLeft() == null) {
					temp.setLeft(node);
					return;
				}	
				else if(temp.getRight() == null) {
					temp.setRight(node);
					return;
				}	
				else if(temp.getLeft() != null && temp.getRight() != null) {
					rightLevel++;				
				}
				temp = temp.getLeft();				
			}
			
		}
	}
	
	
	private  BTreeNode findNode(BTreeNode root, int nodeToFind) {
		exploreQueue = new ArrayDeque <BTreeNode>();
		BTreeNode temp = root;
		
		System.out.print(root.getWeight()+"\t");
		
		if(root.getLeft() != null) {
			exploreQueue.add(root.getLeft());
			System.out.print(root.getLeft().getWeight()+"\t");
			
			if(nodeToFind== temp.getLeft().getWeight())
				return temp.getLeft();
		}
		if(root.getRight() != null) {
			exploreQueue.add(temp.getRight());
			System.out.print(temp.getRight().getWeight()+"\t");
			
			if(nodeToFind == temp.getRight().getWeight())
				return temp.getRight();
		}
		while(!exploreQueue.isEmpty()) {
			temp = exploreQueue.remove();
			
			if(temp.getLeft() != null) {
				exploreQueue.add(temp.getLeft());
				System.out.print(temp.getLeft().getWeight()+"\t");
				
				if(nodeToFind == temp.getLeft().getWeight())
					return temp.getLeft();
			}
			if(temp.getRight() != null) {
				exploreQueue.add(temp.getRight());
				System.out.print(temp.getRight().getWeight()+"\t");
				
				if(nodeToFind == temp.getRight().getWeight())
					return temp.getRight();
			}
			
		}
		return null;
		
	}
}
