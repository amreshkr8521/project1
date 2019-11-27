package com.bridgelabz.DataStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class PalindromeCheckerTest {

	static PalindromeChecker test=new PalindromeChecker();
	
	@Test
	@Disabled
	public static void isPalindrome_If_radar_Is_passed() {
		assertEquals(true,test.isPalindrome("radar"));
	}

	@Test
	public static void isPalindrome_If_madam_Is_passed() {
		assertEquals(true,test.isPalindrome("madam"));
	}
}
