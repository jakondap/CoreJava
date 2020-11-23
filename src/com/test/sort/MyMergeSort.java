package com.test.sort;

public class MyMergeSort {
	
	
	static int arr[] = {5,1,-30,45,38,657,0};
	
	public static void main(String[] args) {
		
		mergeSort(0, arr.length-1);
		
		for(int i =0;i<temp.length;i++) {
			   arr[i] = temp[i];
		   }
		
		for(int i=0;i<temp.length;i++) {
			if(i%5 ==0){
				System.out.println();
			}
			System.out.print(temp[i]+"\t");
		}
		
	}
	
	private static void mergeSort(int start, int end) {
		
		if(start >= end)
			return;
		
		int mid =  (start + end)/2;
		
		mergeSort(start, mid);		
		mergeSort(mid + 1, end);
		merge(start, end);
		
	}
	private static int[] temp = new int[arr.length];
	private static void merge(int start, int end) {
	   
	   int mid = (start + end)/2;	
	   int i = start;
	   int j = mid + 1;
	   int k = start;
	   int size = end - start +1;
	   	
		   while(i <= mid && j <= end) {
			   if(arr[i] <= arr[j]) {
				   temp[k] = arr[i];
				   i++;
			   }else {
				   temp[k] = arr[j];
				   j++;
			   }
			   k++;
		   }
		   	   	   
	   while(i<= (mid)) {
		   temp[k] = arr[i];
		   k++;
		   i++;
	   }
		while(j<= (end)) {
		   temp[k] = arr[j];
		   k++;
		   j++;
	   }
				
	System.arraycopy(temp, start, arr, start, size);	
	  
		  
		
	}
}
