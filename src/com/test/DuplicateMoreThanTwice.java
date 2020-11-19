package com.test;

public class DuplicateMoreThanTwice {
	private static int arr[]= {25,25,25,65,65,65,15,15,15,10,10};
	private static int loopCounter=0;
	
	public static void main(String[] args) {
		int ele = 0;
		int matchCount =0;
		
		for(int i=0;i<arr.length;i++) {
			ele = arr[i];
			matchCount = 0;
			loopCounter++;
			for(int j=arr.length-1;j>=i;j--) {
				loopCounter++;
				if(ele == arr[j]) {
					matchCount++;
				}
				
				if(matchCount >2) {
					System.out.println("Element \t"+ele+"  more than 2 times.");
					break;
				}
				
				
			}
		}
		System.out.println("Loop Counter "+loopCounter);
	}
	
}
