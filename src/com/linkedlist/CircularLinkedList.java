package com.linkedlist;

public class CircularLinkedList {
	
	private static Bogie head = null;
	private static Bogie temp = null;
	private static int elePos = 0;
	
	public static void main(String[] args) {
		Bogie bogie1 = new Bogie();
		bogie1.setName("S1");
		addElement(bogie1);
		
		Bogie bogie2 = new Bogie();
		bogie2.setName("S2");
		addElement(bogie2);
		
		Bogie bogie3 = new Bogie();
		bogie3.setName("S3");
		addElement(bogie3);
		
		Bogie bogie4 = new Bogie();
		bogie4.setName("S4");
		addElement(bogie4);
		
		Bogie bogie5 = new Bogie();
		bogie5.setName("S5");
		addElement(bogie5);
		
		Bogie bogie6 = new Bogie();
		bogie6.setName("S6");
		addElement(bogie6);
		
		traverse();
		
		//removeEle(bogie2);
		//removeEle(bogie3);
		//traverse();
		temp = head;
		elePos = 0;
		//findEle(temp, bogie1);
		temp = head;
		bogieLength(temp,0);
	}
	private static void addElement(Bogie ele) {
		temp = head;
		
		if(head == null) {
			head = ele;
			head.setNext(ele);
			return;
		}	
		
		while(temp.getNext() != head) {
			temp = temp.getNext();
		}
		temp.setNext(ele);
		ele.setNext(head);
	}
	private static void traverse() {
		temp = head;
		if(temp == null)
			return;
		if(temp.getNext() == head)
			System.out.println(temp.getName());
			System.out.println();
		while(temp.getNext() != head) {
			System.out.print(temp.getName()+"\t");
			temp = temp.getNext();
		}
		System.out.println(temp.getName());
	}
	private static void removeEle(Bogie ele) {
		temp = head;
		Bogie prev = head;
		
		if(temp.getName().equals(ele.getName())) {
			head = temp.getNext();
			temp = null;
		
		temp = head;
		while(temp.getNext() != ele) {
			temp = temp.getNext();
		}
		temp.setNext(head);
		}else {			
			while(temp.getName() != ele.getName()) {
				prev = temp;
				temp = temp.getNext();
			}
			prev.setNext(temp.getNext());
		}
	}
	private static void findEle(Bogie temp, Bogie ele) {
		if(temp == null)
			return;
		if(temp.getName().equals(ele.getName())) {
			System.out.println("Element found at "+(++elePos));
			return;
		}else {
			elePos++;
			temp = temp.getNext();
			findEle(temp, ele);
		}
			
	}
	private static void bogieLength(Bogie temp, int len) {
		if(temp == null)
			return;
		
		if(temp.getNext() == head) {
			System.out.println("length is \t"+(++len));
			return;
		}else {
			bogieLength(temp.getNext(),++len);
		}
	}
}
