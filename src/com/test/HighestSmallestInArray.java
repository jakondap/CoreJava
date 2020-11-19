package com.test;

public class HighestSmallestInArray {
	private static int highest= 0;
	private static int smallest= 0;
	private static int arr[] = {10,14,13,25,2,8,3,-10,0,300};
	
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				highest = arr[i];
				smallest = arr[i];
				continue;
			}else {
				if(arr[i]>highest) {
					highest = arr[i];
				}
				if(arr[i]<smallest) {
					smallest = arr[i];
				}
			}
		}
		System.out.println("Highest\tSmallest\t"+highest+"\t"+smallest);
	}

}
