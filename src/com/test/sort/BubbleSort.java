package com.test.sort;

public class BubbleSort {
	private static int[] arr = {100,54,5,15,32,21,2};
	
	public static void main(String[] args) {
		int loopCounter = 0;
		int temp = 0;
		
		while(loopCounter<arr.length-1) {
			for(int i=0;i<arr.length-1;i++) {
				temp = arr[i];
				if(arr[i]>arr[i+1]) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
			System.out.println("loopCounter  "+loopCounter);
			loopCounter++;
			
		}
		System.out.println();
		for(int i=0;i<arr.length;i++) {
			System.out.print("  "+arr[i]+"\t");
		}
	}
}
