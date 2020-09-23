package com.test;

public class HighestInArray {

	private static int[] arr = {73,54,80,4,9,3,176,177,38,2,-199,-260};
	public static void main(String[] args) {
		Highest(arr);
	}
	private static void Highest(int[] arr) {
		int[] tempArr = new int[arr.length];
		int compareCount =0;
		int sortCounter = 0;
		
		if(arr.length == 0) {
			System.out.println("Empty Array");
		}else if(arr.length ==1) {
			System.out.println("Small element \t"+arr[0]);
		}else {
			int highest = arr[0];
			int secondHighest = arr[0];
			int thirdHighest = arr[0];
			int fourthHighest = arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]> highest) {
					compareCount++;
					fourthHighest = thirdHighest;
					thirdHighest = secondHighest;
					secondHighest = highest;					
					tempArr[sortCounter++]= highest;
					highest = arr[i];
				}	
				}
			System.out.println("Highest element is \t"+highest);
			System.out.println("Second Highest element is \t"+secondHighest+ "\t comparisions "+compareCount);
			System.out.println("thirdHighest element is \t"+thirdHighest);
			System.out.println("fourthHighest element is \t"+fourthHighest);
			}
		
		}
	


}
