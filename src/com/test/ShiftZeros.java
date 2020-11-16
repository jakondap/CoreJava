package com.test;

public class ShiftZeros {
	static int arr[] = {0,0,2,15,30,0,15,20,0,35,500,30,0};
	static int pos =0;
	public static void main(String[] args) {
		
		getMovePos();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+"\t");			
		}
		System.out.println();
		
		
		
	}
	private static void rotateArr() {
		int temp = arr[pos]; 
		for(int i = pos;i>0;i--) {
			arr[i] = arr[i-1]; 
		}
		arr[0]= temp;		
	}

	private static void getMovePos() {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i] == 0 && arr[i+1] !=0) {
				pos = i;
				rotateArr();
			}			
		}
		if(arr[arr.length-1] == 0) {
			pos = arr.length-1;
			rotateArr();
		}
	}
	
}
