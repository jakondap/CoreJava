package com.test;

public class NthBiggestInArr {

	private static int arr[] = {10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,3
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,6
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36
			,10,15,35,78,12,65,5,100,2,36,10,15,35,78,12,65,5,100,2,36};
	private static int prArr[] = new int [arr.length];
	
	
	public static void main(String[] args) {
		nthBiggerElement(3);
	}
	private static void nthBiggerElement(int n) {
		populatePriorityArr();
		if(n>prArr.length || n<0) {
			System.out.println("Invalid number");
			System.exit(0);
		}
		System.out.println(n+"th Bigger is "+ prArr[n-1]);
		
		for(int i=0;i<prArr.length;i++) {
			System.out.print(prArr[i]+"\t");
		}
		
	}
	private static void populatePriorityArr() {
		int ele = 0;
		for(int i=0;i<arr.length;i++) {
			ele = arr[i];
			for(int j=0;j<prArr.length;j++) {
				if(ele > prArr[j]) {
					reOrderPriority(j);
					prArr[j] = ele;
					break;
				}else if(ele < prArr[j]) {
					if(prArr[j] == 0) {
						prArr[j] = ele;
					}else 
						continue;
				}else 
					break;
			}
		}
	}
	private static void reOrderPriority(int elePos) {
		int endOfPriority = 0;
		for(int i=0;i<prArr.length;i++) {
				if(prArr[i] == 0) {
					endOfPriority = i;
					break;
				}	
			}
		for(int i=endOfPriority;i>=elePos;i--) {
			if(i>0)
				prArr[i] = prArr[i-1];
		}
		}
		
}

