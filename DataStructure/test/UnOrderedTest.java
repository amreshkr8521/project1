package com.bridgelabz.DataStructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bridgelabz.DataStructure.UnOrdered;

class UnOrderedTest {
UnOrdered test=new UnOrdered();


	@Test
	@Disabled
	public void Testing_For_readFile_Method_and_Returning_The_correct_sting() {
		String fileName="C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt";
		String[] expected= {"a", "b", "d", "h", "l" };
		assertEquals(expected, test.readFile(fileName));
	}

}
