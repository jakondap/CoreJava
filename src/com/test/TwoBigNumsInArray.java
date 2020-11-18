package com.test;

public class TwoBigNumsInArray {
	private static int arr[] = {10,15,32,12,38,8,53,20};
	private static int firstBig = -1;
	private static int secondBig = -1;
	public static void main(String[] args) {
		printFirstSecondBig();
		
	}
	private static void printFirstSecondBig() {
		int ele = 0;
		int temp = 0;
		for(int i=0;i<arr.length;i++) {
		   ele = arr[i];
		   
			if(ele > firstBig) {
				temp = firstBig;
				firstBig = ele;
				secondBig = temp;
			}else if(ele < firstBig && ele > secondBig) {
				secondBig = ele;
			}
		}
		System.out.println("First Big \t"+firstBig +"\tSecondBig\t"+secondBig);
	}
}
