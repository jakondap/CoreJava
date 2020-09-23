package com.test.str;

import java.util.HashMap;
import java.util.Map;

public class PrintNum {
	
	private static Map<Integer, String> numMap = new HashMap<>();
	
	static {
		numMap.put(1,"One");
		numMap.put(2,"Two");
		numMap.put(3,"Three");
		
		numMap.put(4,"Four");
		numMap.put(5,"Five");
		numMap.put(6,"Six");
		
		numMap.put(7,"Seven");
		numMap.put(8,"Eight");
		numMap.put(9,"Nine");
		
		numMap.put(10,"Ten");
		numMap.put(11,"Eleven");
		numMap.put(12,"Tweleve");
		
		numMap.put(13,"Thirteen");
		numMap.put(14,"Fourteen");
		numMap.put(15,"Fifteen");
		
		numMap.put(16,"Sixteen");
		numMap.put(17,"Seventeen");
		numMap.put(18,"Eightteen");
		
		numMap.put(19,"Ninetteen");
		numMap.put(20,"Twenty");
		numMap.put(30,"Thirty");
		
		numMap.put(30,"Thirty");
		numMap.put(30,"Thirty");
		numMap.put(30,"Thirty");
		
		numMap.put(40,"Fourty");
		numMap.put(50,"Fifty");
		numMap.put(60,"Sixty");
		
		numMap.put(70,"Seventy");
		numMap.put(80,"Eighty");
		numMap.put(90,"Ninety");
		
		numMap.put(0,"");
		
	}
	private static String numStr = "";
	public static void printNum(int num) {
		
		if(num <=10) {
			numStr = numStr + " " + numMap.get(num);			
		}else if(num >10 && num <=20) {
			numStr = numStr + " " + numMap.get(num);	
		}else if(num > 20 && num < 100) {
			numStr = numStr + " " + numMap.get((num/10)*10);	
			printNum(num%10);
		}/*else if(num >= 10000) {
			numStr = numStr + " " + numMap.get(num/10000) + " Thousand";	
			printNum(num%10000);
		}*/else if(num >= 1000) {
			int temp = num/1000;
			String tempStr = "";
			if(temp >10) {
				tempStr = numMap.get(temp/10*10) + " "+ numMap.get(temp%10);
			}
			numStr = numStr + " " + tempStr + " Thousand";	
			printNum(num%1000);
		}else if(num >= 100 && num < 1000) {
			numStr = numStr + " " + numMap.get(num/100) + " Hundred";	
			printNum(num%100);
		}
	}
public static void main(String[] args) {
	int num = 99999;
	printNum(num);
	System.out.println(numStr);
}
}
