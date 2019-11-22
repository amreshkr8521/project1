package com.bridgelabz.DataStructure;
/**
 * Runner class to implement all the method of the linked list
 * 
 * @author amresh kumar
 *
 */
public class Runner {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.insert(23);
		ll.insert(11);
		ll.insert(34);
		ll.insert(68);
		ll.insertAtStart(1);
		ll.insertAt(2, 45);
		ll.show();
		ll.deleteAtIndex(1);
		ll.show();
	}

}
