package com.test;

public class SmallestInArray {
	private static int[] arr = {73,54,65,4,9,3,176,38,2,-199,-260};
	public static void main(String[] args) {
		smallest(arr);
	}
	private static void smallest(int[] arr) {
		int[] tempArr = new int[arr.length];
		int compareCount =0;
		int sortCounter = 0;
		
		if(arr.length == 0) {
			System.out.println("Empty Array");
		}else if(arr.length ==1) {
			System.out.println("Small element \t"+arr[0]);
		}else {
			int smallest = arr[0];
			int secondSmallest = arr[0];
			int thirdSmallest = arr[0];
			int fourthSmallest = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]< smallest) {
					compareCount++;
					fourthSmallest = thirdSmallest;
					thirdSmallest = secondSmallest;
					secondSmallest = smallest;
					smallest = arr[i];
				}	
				}
			System.out.println("Smallest element is \t"+smallest);
			System.out.println("Second smallest element is \t"+secondSmallest+ "\t comparisions "+compareCount);
			System.out.println("thirdSmallest element is \t"+thirdSmallest);
			System.out.println("fourthSmallest element is \t"+fourthSmallest);
			}
		
		}
	
}
