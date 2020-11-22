package com.test.sort;

public class MyQuickSort {
	private static int arr[] = {51,24,62,8,10,5,45,03,66,-200,56,98,120,86,25,2522,54,53,87,375,93,
			36,5625,474,3674,89752
			};
	//private static int arr[] = {51,3,-200,3,5};
	
	public static void main(String[] args) {
		quickSort(0, arr.length-1);
		for(int i=0;i<arr.length;i++) {
			if(i%5 == 0)
				System.out.println();
			System.out.print(arr[i]+"\t");
		}	 
	}

	private static void quickSort(int low, int high) {
		int pivot = arr[low];
		int temp = 0;
		int pivotIndex = low;
		int i = low;
		int j = high;
		//System.out.println("low\t high\t"+low +"   "+high);
		if(low >= high )
			return;
		
		while(j > i ) {					
			while(!(arr[i] > pivot) && i< arr.length-1) {
					i++;				
			}
			while(!(arr[j] <= pivot) && j > 0) {
					j--;
			}
			
			if(i < j) {		
				temp = arr[j];
				arr[j]= arr[i];
				arr[i]= temp;
			}
		}
		temp = arr[j];
		arr[j] = pivot;
		arr[pivotIndex] = temp;	
		//System.out.println("low\t "+low +" j  "+j+" high  "+high);
		if( j > 0)
			quickSort(low,j-1);
		if( j<arr.length-1 )
			quickSort(j+1, high);
	}
	
}
