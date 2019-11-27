package com.bridgelabz.DataStructure;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueTest {

	Queue test=new Queue();
	
	
	@Test
	public void isEmpty_method_To_Check_When_Oueue_is_Not_Empty() {
		test.enqueue(98);
		test.enqueue(90);
		assertEquals(false, test.isEmpty());
	}
	
	@Test
	public void isEmpty_method_To_Check_When_Oueue_is_Empty() {
		
		
		assertEquals(true, test.isEmpty());
	}
	
	@Test
	public void isEmpty_method_To_Check_When_Oueue_Has_One_Element() {
		test.enqueue(98);
		
		assertEquals(false, test.isEmpty());
	}

	
	@Test
	public void index_Method_returns_Valid_Index() {
		test.enqueue(50);
		test.enqueue(2);
		test.enqueue(3);
		test.enqueue(4);
		test.enqueue(5);
		
		
		int passing_50_To_Get_Index_Negetive_1=50;
		assertEquals(-1,test.index( passing_50_To_Get_Index_Negetive_1));
		
		int passing_2_To_Get_Index_1=2;
		assertEquals(1,test.index( passing_2_To_Get_Index_1));
		
		int passing_3_To_Get_Index_2=3;
		assertEquals(2,test.index( passing_3_To_Get_Index_2));
		
		
	}
	
	
}
