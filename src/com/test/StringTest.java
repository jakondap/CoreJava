package com.test;

public class StringTest {
	public static void main(String[] args) {
		//System.out.println(notString("not is not"));
		//reverse("not is not", 9);
		
		/*for(int i=1;i<=10 ;i++) {
			System.out.print(fib(i)+"\t");
		}*/
		System.out.println(reverse("abc"));
		
		
	}
	public static String notString(String str) {
		  if(str.contains("not")){
		    return str;
		  }else {
		    return "not "+ str;
		  }
		}
	
	public static String reverse(String str) {
		char temp;
		char[] strArr = str.toCharArray();
		int j= str.length()-1;
		int length = str.length();
		for(int i=0;i<strArr.length && j>-1;i++) {
			temp = strArr[i];
			j=j-1;
			System.out.println("i value j "+i +"\t"+j);
			strArr[i] = strArr[j];	
			strArr[j]=temp;
		}
		return strArr.toString();
				  
		}	
	
	public static int fib(int n ) {
		if(n==1) {
			return 0;
		}else if(n ==2) {
			return 1;
		}else if(n>2) {
			return fib(n-1)+fib(n-2);
			
		}
		return -1;
		
	}
	


}
