package com.bridgelabz.DataStructure;

import java.util.Scanner;

public class PalindromeChecker<T> {
	
	static Scanner scanner=new Scanner(System.in);
	
	
public static boolean isPalindrome(String data) {
	// creating an object of Deque class
			Dequeue<Character> d = new Dequeue<Character>();
			
			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);
				d.addFront(ch);
			}

			String reverse = "";
			for (int i = 0; i < data.length(); i++) {
				reverse = reverse + d.removeFront();
			}

			if (reverse.equals(data)) {
				return true;
			} else
				return false;
}

public static void palindrome() {
	System.out.println("Enter a string");
	System.out.println(isPalindrome(scanner.nextLine()));
	
}
}
