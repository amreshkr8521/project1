package com.bridgelabz.DataStructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.DataStructure.BalancedParentheses;

class BalancedParenthesesTest {
public static BalancedParentheses test=new BalancedParentheses();
	
	@Test
	public void balancedParenthesis_When_NoParanthesis() {
		
		String exp="23*32";
		char ch[]=exp.toCharArray();
		int length=ch.length;
		assertEquals(true, test.balancedParenthesis(ch,length),"Shows true as no parenthesis found");
	
		
		exp="23*32-589+59";
		char ch1[]=exp.toCharArray();
		 length=ch.length;
		assertEquals(true, test.balancedParenthesis(ch1,length),"Shows true as no parenthesis found");
	}
	
	@Test
	public void balancedParenthesis_With_Paranthesis() {
		
		String exp="(23*32)";
		char ch[]=exp.toCharArray();
		int length=ch.length;
		assertEquals(true, test.balancedParenthesis(ch,length),"Shows true as no parenthesis found");
		
		exp="(23*32)-(589+59)";
		char ch1[]=exp.toCharArray();
		 length=ch.length;
		assertEquals(true, test.balancedParenthesis(ch1,length),"Shows true as no parenthesis found");
	}


	@Test
	public void balancedParenthesis_With_One_Paranthesis() {
		
		String exp="23*32)";
		char ch[]=exp.toCharArray();
		int length=ch.length;
		assertEquals(false, test.balancedParenthesis(ch,length),"Shows false as no parenthesis found");
		
		
		exp="(23*32-589+59";
		char ch1[]=exp.toCharArray();
		 length=ch.length;
		assertEquals(false, test.balancedParenthesis(ch1,length),"Shows false as no parenthesis found");
	}


	@Test
	public void isMatchingPair_with_Correct_Pair() {
		char ch='(';
		char ch2=')';
		assertEquals(true, test.isMatchingPair(ch, ch2));
		
		 ch='{';
		 ch2='}';
		assertEquals(true, test.isMatchingPair(ch, ch2));
		
		 ch='[';
		 ch2=']';
		assertEquals(true, test.isMatchingPair(ch, ch2));
		
	}
	
	@Test
	public void isMatchingPair_with_Wrong_Pair() {
		char ch='(';
		char ch2=']';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='{';
		 ch2=']';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='(';
		 ch2='}';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='{';
		 ch2=')';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='[';
		 ch2='}';
		assertEquals(false, test.isMatchingPair(ch, ch2));
	}
	
	@Test
	public void isMatchingPair_with_Same_Sign() {
		char ch='(';
		char ch2='(';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='{';
		 ch2='{';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='}';
		 ch2='}';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch=')';
		 ch2=')';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		 ch='[';
		 ch2='[';
		assertEquals(false, test.isMatchingPair(ch, ch2));
		
		ch=']';
		 ch2=']';
		assertEquals(false, test.isMatchingPair(ch, ch2));
	}
}
