package com.bridgelabz.DataStructure;

import java.util.Scanner;
/**
 * To check if the string is palindrome using dequeue
 * 
 * @author amresh kumar
 * 
 *
 * @param <T> generic type
 */
public class PalindromeChecker<T> {
	
	static Scanner scanner=new Scanner(System.in);
	
/***************************************************************************************
 * 	Return true if the string is palindrome or else return false
 * 
 * @param 	data -->String
 * @return	boolean
 * 
 * *************************************************************************************
 */
public static boolean isPalindrome(String data) {
	// creating an object of Deque class
			Dequeue<Character> d = new Dequeue<Character>();
			
			for (int i = 0; i < data.length(); i++) {
				char ch = data.charAt(i);//converting to array
				d.addFront(ch);
			}

			String reverse = "";
			for (int i = 0; i < data.length(); i++) {
				reverse = reverse + d.removeFront();//reverse the string
			}

			if (reverse.equals(data)) {
				return true;
			} else
				return false;
}

/*******************************************************************************************
 * 
 * To take input as String and calling isPalindrome() to check if it is palindrome or not
 * @param 	null
 * @return 	void 
 * 
 * *******************************************************************************************
 */
public static void palindrome() {
	System.out.println("Enter a string");
	System.out.println(isPalindrome(scanner.nextLine()));//calling isPalindrome()  
	
}
}
