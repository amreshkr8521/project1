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
		System.out.println(ll.isEmpty());
		ll.insert(23);
		ll.insert(11);
		ll.insert(34);
		ll.insert(68);
		ll.insertAtStart(1);
		//ll.insertAt(2, 45);
	//	ll.show();
		//ll.deleteAtIndex(1);
	//	ll.show();
		ll.insert("amresh");
		//ll.insertAt(5, "vishal");
		
	//	ll.remove(68);
		ll.show();
	//	ll.remove(68);
		System.out.println(ll.search("amresh"));
	//	System.out.println(ll.size());
	//	System.out.println(ll.isEmpty());
		System.out.println("last item removed is "+ll.pop());
	//	ll.show();
	}

}
