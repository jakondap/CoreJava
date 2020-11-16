package com.test;

public class ReverseArray {

	
	public static void main(String[] args) {
		int arr[] = {2,15,30,0,15,35,100};
		int temp =0;
		int j= 0;
		
		for(int i= arr.length-1;i>=0;i--) {
			temp = arr[j];
			if(j<=i) {
				arr[j] = arr[i];
				arr[i] = temp;
			}
			j++;
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");
		}
	}
}
