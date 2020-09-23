package com.test.sort;

public class QuickSort {
	private static int arr[]= {12,2,5,13};
	public static void main(String[] args) {
		
		doQuickSort(0,arr.length-1);
		System.out.println(arr);
	}
	private static void doQuickSort(int l, int h) {
		int low = l;
		int high = h;
		int pivotIndex = 0;
		if(low < high) {
			pivotIndex = partition1(low, high);
				doQuickSort(low, pivotIndex);
				doQuickSort(pivotIndex +1, high);
		}
		
		
	}
	private static int partition(int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while (i<j) {
				do {
					i++;
				}while (arr[i]<=pivot);
				
				do {
					j--;
				}while(arr[j]>pivot);
				
				if(i<j)
					swap(i, j);
			}
		swap(low, j);
		return j;
		}
	
	private static int partition1(int low, int high) {
		int pivot = arr[low];
		int i = low;
		int j = high;
		
		while (i<j) {
				
				i++;
				for(; arr[i]<=pivot;i++) {
					
				}
				
				j--;
				for(; arr[j]>pivot;j--) {
					
				}
				
				if(i<j)
					swap(i, j);
			}
		swap(low, j);
		return j;
		}
		
		
	private static void swap(int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i]= arr[j];
		arr[j]=temp;

	}

	
	}

