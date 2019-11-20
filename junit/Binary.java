package com.bridgelabz.junit;



public class Binary {
	public static int intCount(int num) {
		int count=0;
		while(num!=0) {
			num=num/10;
			count++;
		}
		return count;
	}
public static void swap(int num) {
	int bin1=0,bin2=0;
	int count=intCount(num);
	int temp_num=num;
	while(count!=0) {
		
		if(count<=intCount(temp_num)/2) {
		int temp=num%10;	
		
		bin1=bin1*10+temp;
		num=num/10;
		System.out.print("a");
		count--;
		}
		else {
			int temp=num%10;	
			
			bin2=bin2*10+temp;
			num=num/10;
			count--;
			
			System.out.print("b");
		}
	}
	while(intCount(temp_num)/2!=intCount(bin1)) {
		bin1=bin1*10;
	}
		System.out.println(bin1+" "+bin2);
		
	
}
public static void main(String[] args) {
	System.out.println(110101%10);
	swap(1101010);
	System.out.println(intCount(1101010)/2);
}
}
