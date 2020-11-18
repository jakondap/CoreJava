package com.test;

public class RotateAnArray {

	//private static int[] arr = {15,13,10,5,25,55};
	private static int[] arr = {5,20,30};
	
	public static void main(String[] args) {
		rotateArr();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		rotateArr();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		rotateArr();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
	private static void rotateArr() {
		if(arr.length == 0)
			return;
		
		int temp = arr[0];
		arr[0] = arr[arr.length-1];
		
		for(int i= arr.length-1;i>1;i--) {
			arr[i] = arr[i-1];
		}
		
		
		if(arr.length > 1)
			arr[1] = temp;
	}
}
