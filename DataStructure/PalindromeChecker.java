package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class PalindromeChecker<T> {
	static Dequeue dq=new Dequeue();
	static Scanner scanner=new Scanner(System.in);
public static boolean isPalindrome(String data) {
	char first,  last;
	char[] ch=data.toCharArray();
	for(int count=0;count<data.length();count++) {
		dq.addFront(ch[count]);
		//dq.show();
		//System.out.println(ch[count]);
	}
	boolean option=true;
	while(dq.size()>1 || option) {
		first=(char) dq.RemoveFront();
		last=(char) dq.removeRear();
		System.out.println(last+" and "+first);
		if(first!=last)
			option= false;
	}
	dq.show();
	return option;
}

public static void palindrome() {
	System.out.println("Enter a string");
	System.out.println(isPalindrome(scanner.nextLine()));
	
}
}
