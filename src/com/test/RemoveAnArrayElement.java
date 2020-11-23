package com.test;

public class RemoveAnArrayElement {
	
	private static int[] arr = {10,15,30,25};
	
	public static void main(String[] args) {
		removeEle(4);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ "\t");
		}
	}
	private static void removeEle(int pos) {
		if(pos <1 || pos >arr.length) {
			System.out.println("Wrong element position ");
			return;
		}	
		int i = pos - 1;
		System.out.println("Element to be removed \t "+arr[i]);
		
		while(i<=arr.length-2) {
			arr[i] = arr[i+1];
			i++;
		}
		arr[arr.length-1] = -30454;
		
	}
}
