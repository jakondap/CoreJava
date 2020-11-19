package com.test;

public class SumOf2NumsIs3rd {
	private static int target = 0;
	private static int arr[] = {1,3,5,8,9,13,0,7,0,-1};
	
	public static void main(String[] args) {
		for(int i=0;i<arr.length;i++) {
			int ele = target - arr[i];
			for(int j=arr.length-1;j>i;j--) {
				if(ele == arr[j]) {
					System.out.println("Pair is "+ ele+"  "+arr[i]);
				}
			}
		}
	}
	
	
}
