package com.test;

public class Fibonacci {

	private static int fibSeries(int n) {
		if( n== 0 ) {
			System.out.println(0 +"\t");
			return 0;
		}else if(n==1) {
			System.out.println(1 +"\t");
			return 1;
		}else {
			int temp = (fibSeries(n-1) + fibSeries(n-2));
			//System.out.println(temp +"\t");
			return temp;
		}
	}
	
	private static void printFibs(int n) {
		int n1 = 0;
		int n2 = 1;
		
		if(n == 0) {
			System.out.println(n1);
		}else if(n == 1) {
			System.out.println(n1 + "\t");
			System.out.println(n2 + "\t");
		}else {
			System.out.println(n1 + "\t");
			System.out.println(n2 + "\t");
			for(int i = 2 ;i<n; i++) {
				int n3 = n1 + n2;
				n1 = n2;
				n2 = n3;
				System.out.println(n3+"\t");
			}
		}
		
	}
	
	public static void main(String[] args) {
		//System.out.println(fibSeries(4));
		//fibSeries(4);
		printFibs(8);
	}
}
