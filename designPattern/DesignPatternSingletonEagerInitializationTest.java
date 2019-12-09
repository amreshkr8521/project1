package com.bridgelabz.designPattern;

import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class DesignPatternSingletonEagerInitializationTest {

	
	// Creating Object Instance to take the instance of DesignPatternSingletonEagerInitialization.getInstanceOfDesignPatternSingletonEagerInitialization() singleton class
	public static DesignPatternSingletonEagerInitialization  forTest=DesignPatternSingletonEagerInitialization.getInstanceOfDesignPatternSingletonEagerInitialization();
	
	
	/**
	 * Test case for the getInstanceOfDesignPatternSingletonEagerInitialization() to check if it is giving the correct instance
	 */
	@Test
	public void testFor_getInstanceOfDesignPatternSingletonEagerInitialization(){
		
		assertSame(forTest,  DesignPatternSingletonEagerInitialization.getInstanceOfDesignPatternSingletonEagerInitialization());
	}
	
	
	@Test
	public void testFor_getDesignpatternsingletonMessege() {
		
		
		 forTest.setDesignpatternsingletonMessege("Test");
		
		assertEquals("Test",forTest.getDesignpatternsingletonMessege());
	}
	

}
