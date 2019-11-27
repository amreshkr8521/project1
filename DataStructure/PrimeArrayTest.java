package com.bridgelabz.DataStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeArrayTest {

static PrimeArray test=new PrimeArray();
	
	@Test
	public void isPrime_Returns_false_For_Non_Prime() {
		int Passing_6_To_Return_true=6;
		assertEquals(false, test.isPrime( Passing_6_To_Return_true));
		
		int Passing_22_To_Return_true=22;
		assertEquals(false, test.isPrime(Passing_22_To_Return_true));
		
		int Passing_45_To_Return_true=45;
		assertEquals(false, test.isPrime(Passing_45_To_Return_true));
		
		int Passing_102_To_Return_true=102;
		assertEquals(false, test.isPrime(Passing_102_To_Return_true));
		
	}
	
	@Test
	public void isPrime_Returns_true_For_Prime() {
		int Passing_Seven_To_Return_true=7;
		assertEquals(true, test.isPrime(Passing_Seven_To_Return_true));
		
		int Passing_23_To_Return_true=23;
		assertEquals(true, test.isPrime(Passing_23_To_Return_true));
		
		int Passing_41_To_Return_true=41;
		assertEquals(true, test.isPrime(Passing_41_To_Return_true));
		
		int Passing_13_To_Return_true=13;
		assertEquals(true, test.isPrime(Passing_13_To_Return_true));
		
	}
}
