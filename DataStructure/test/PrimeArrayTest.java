package com.bridgelabz.DataStructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.DataStructure.PrimeArray;

class PrimeArrayTest {
PrimeArray test=new PrimeArray();
	

    @Test
	public void Testing_for_IsPrime_When_Number_Is_Prime_Returns_True() {
		int number=23;
		int number1=13;
		int number2=7;
		assertEquals(true,test.isPrime(number));
		assertEquals(true,test.isPrime(number1));
		assertEquals(true,test.isPrime(number2));
				
	}
    
    @Test
	public void Testing_for_IsPrime_When_Number_Is_Not_Prime_Returns_False() {
		int number=22;
		int number1=15;
		int number2=6;
		assertEquals(false,test.isPrime(number));
		assertEquals(false,test.isPrime(number1));
		assertEquals(false,test.isPrime(number2));
				
	}

}
