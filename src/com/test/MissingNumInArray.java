package com.test;

public class MissingNumInArray {
	private static int arr[] = {1,2,5,6,7,8,4,10};
	private static int finalArr[] = new int[10];
	public static void main(String[] args) {
		
		for(int i=0;i<arr.length;i++) {
			finalArr[arr[i]-1] = arr[i];
		}
		System.out.println("Missing numbers \t");
		for( int i=0;i<finalArr.length;i++) {
			if(finalArr[i] == 0) {
				System.out.print(i+1+"\t");
			}
		}
	}
}
