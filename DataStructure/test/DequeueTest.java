package com.bridgelabz.DataStructure.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.bridgelabz.DataStructure.Dequeue;

class DequeueTest {

	Dequeue test=new Dequeue();
	
	@Test
	
	public void isEmpty_Test_When_empty() {
		assertEquals(true, test.isEmpty(),"shows false when dequeue is empty");
	}
	
	@Test
	public void Testing_size_Method_When_No_Value_Is_There() {
		assertEquals(-1, test.size(),"shows 0 when dequeue is empty");
	}
	
	@Test
	public void Testing_size_Method_When_Value_Is_There() {
		test.addRear(21);
		assertEquals(1, test.size(),"shows 1 when dequeue is empty");
		
		test.addRear(2);
		test.addRear(22);
		assertEquals(3, test.size(),"shows 3 when dequeue is empty");
	}
	
	
	@Test
	
	public void Testing_RmoveRear_Method_With_Three_Element() {
		test.addRear(22);
		test.addRear(21);
		test.addRear(23);
		
		assertEquals(23,test.removeRear());
	}
	
	@Test
	
	public void Testing_Rmovefront_Method_With_Element() {
		test.addRear(22);
		test.addRear(23);
		
		assertEquals(22,test.removeFront());
	}
	
	
	@Test
	@Disabled
	public void Testing_Rmovefront_Method_With__No_Element() {
		
		
		assertEquals(-1,test.removeFront());
	}
}
