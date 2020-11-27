package com.arrays;

public class ReverseRecursive {
	//private static int[] arr = {10,15,32,78,36,32,01};
	private static int[] arr = {1,20,14,15,18,20};
	public static void main(String[] args) {
		reverseArr(0, arr.length-1);
		reverseArrLoop(0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
		System.out.println("\nloopCounter1\tloopCounter2\t"+loopCounter1+"\t"+loopCounter2);
	}
	static int loopCounter1 = 0;
	static int loopCounter2 = 0;
	private static void reverseArr(int start, int end) {
		if(start == end){
			return;
		}
		int temp =0;
		for(int i=start;i<= (end-1);i++) {
			temp = arr[i+1];
			arr[i+1]= arr[i];
			arr[i] = temp;
			loopCounter1++;
		}
		reverseArr(start, end-1);
	}
	
	private static void reverseArrLoop(int start, int end) {
		int mid = (start + end)/2;
		int i = start;
		int j = end;
		int temp = 0;
		
		while(i<=mid && j>=mid && (i != j)) {
			temp = arr[j];
			arr[j] = arr[i];
			arr[i] = temp;
			i++; j--;
			loopCounter2++;
		}
	}

}
