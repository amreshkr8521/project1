package com.bridgelabz.DataStructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bridgelabz.DataStructure.PalindromeChecker;

class PalindromeCheckerTest {

	static PalindromeChecker test=new PalindromeChecker();
	
	@Test

	public static void isPalindrome_If_radar_Is_passed() {
		assertEquals(true,test.isPalindrome("radar"));
	}

	@Test
	public static void isPalindrome_If_madam_Is_passed() {
		assertEquals(true,test.isPalindrome("madam"));
		
	}
		@Test
		public static void isPalindrome_If_Sir_Is_passed() {
			assertEquals(true,test.isPalindrome("sir"));
		}
	
}
