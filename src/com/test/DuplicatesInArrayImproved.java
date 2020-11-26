package com.test;

public class DuplicatesInArrayImproved {
	static int arr[] = {12,12,15,87,15,65,47,36,65,47};
	
	public static void main(String[] args) {
		int compareCount = 0;
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				compareCount++;
				if(arr[i] == arr[j]) {					
					System.out.print(arr[i]+"\t");
				}
			}
		}
		System.out.println("\ncompareCount\t"+compareCount);
	}

}
