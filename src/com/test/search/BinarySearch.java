package com.test.search;

public class BinarySearch {
	public static int[] arr = {10,20,25,30,39,45};
	public static void  doSearch(int l, int h, int ele) {
		int m = (l+h)/2;
		
		if(arr[l] == ele)
			System.out.println("Element found at \t"+l);
		else if(arr[h] == ele)
			System.out.println("Element found at \t"+h);
		else if(arr[m] == ele)
			System.out.println("Element found at \t"+m);
		else if(l >= h){   // I search till end unable to find
			System.out.println("element not found ");
		}else if(arr[l]<ele && arr[m]>ele) { //will be between l and m 
			h = m-1;
			doSearch(l,h,ele);
		}else if(arr[m]<ele) { // will be between h and m 
			l = m+1;
			doSearch(l,h,ele);
		}else if( arr[l] > ele || arr[h] < ele) { // element beyond the data set
			System.out.println("element not found ");
		}
		
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//{10,20,25,30,39,45};
		doSearch(0,5,45);
	}
}
