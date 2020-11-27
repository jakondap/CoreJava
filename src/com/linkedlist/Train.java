package com.linkedlist;

public class Train {
	private static Bogie bogies = null;
	private static Bogie temp = null;
	
	public static void addBogie(Bogie bogieToadd) {
		
		if(bogies == null) {
			bogies = bogieToadd;			
		}else {
			Bogie temp = bogies;
			while(temp.getNext()!=null) {
				temp = temp.getNext();
			}
			temp.setNext(bogieToadd);
			
		}
		
	}
	public static void traverseBogies() {
		
		Bogie temp = bogies;
		//System.out.println(bogies.getName()+"\t");
		while(temp !=null && temp.getNext() !=null) {
			System.out.print(temp.getName()+"\t");
			temp = temp.getNext();			
		}
		if(temp != null)
			System.out.print(temp.getName()+"\t");
		
	}
	public static void removeBogie(String bogieName) {
		System.out.println();
		Bogie temp = bogies;
		Bogie prev = bogies;
		
		if(bogies == null)
			return;
		
		if(temp.getName().equals(bogieName)) {
			prev = temp.getNext();
			temp = null;
			bogies = prev;
			return;
		}
				
		while(temp != null){
			if(temp.getName().equals(bogieName)) {
				prev.setNext( temp.getNext());
				temp = null;
				break;
			}else if(temp.getNext() != null){
				prev = temp;
				temp = temp.getNext();				
			}else {
				break;
			}
		}
		
	}
	private static void trainLength() {
		if(bogies == null) {
			System.out.println("No train found");
			return;
		}else if(bogies.getNext() == null){
			System.out.println("Train length 1!");
			return;
		}
		int trainLength = 1;
		Bogie temp = bogies;
		while(temp.getNext() != null) {
			trainLength++;
			temp = temp.getNext(); 
		}
		System.out.println("\nTrain Length \t" + (trainLength));
	}
	static int trainRecLength = 0;
	
	private static void trainLenRecur(Bogie bogies) {
		if(bogies !=null) {
				if(bogies.getNext() !=null ) {
					trainRecLength++;
					trainLenRecur(bogies.getNext());
				}else {
					trainRecLength++;
					return;
				}
		}
			
	}
	static int elePosRec =0;
	
	private static void findEleRecur(Bogie ele) {		
		if(temp == null || ele == null)
			return;
		else if(temp.getName().equals(ele.getName())) {
			elePosRec++;
			return;
		}else {
			elePosRec++;
			temp =temp.getNext();
			findEleRecur(ele);
		}
	}
	
	public static void main(String[] args) {
		Bogie bogie1 = new Bogie();
		bogie1.setName("S1");
		addBogie(bogie1);
		
		Bogie bogie2 = new Bogie();
		bogie2.setName("S2");
		addBogie(bogie2);
		
		Bogie bogie3 = new Bogie();
		bogie3.setName("S3");
		addBogie(bogie3);
		
		Bogie bogie4 = new Bogie();
		bogie4.setName("S4");
		addBogie(bogie4);
		
		Bogie bogie5 = new Bogie();
		bogie5.setName("S5");
		addBogie(bogie5);
		
		Bogie bogie6 = new Bogie();
		bogie6.setName("S6");
		addBogie(bogie6);
		
		Bogie bogie7 = new Bogie();
		bogie7.setName("S7");
		addBogie(bogie7);
		
		Bogie bogie8 = new Bogie();
		bogie8.setName("S8");
		addBogie(bogie8);
		
		
		traverseBogies();
		/*traverseBogies();
		removeBogie("S1");
		traverseBogies();
		removeBogie("S2");
		traverseBogies();
		removeBogie("S6");
		traverseBogies();
		removeBogie("S3");
		traverseBogies();
		removeBogie("S5");
		traverseBogies();
		removeBogie("S4");
		traverseBogies();*/
		trainLength();
		temp = bogies;
		
		trainLenRecur(temp);
		System.out.println("Train length\tRecursive\t"+trainRecLength);
		temp = bogies;
		findEleRecur(bogie2);
		
		System.out.println("Element found at \t"+(elePosRec));
	}
}
