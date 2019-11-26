package com.bridgelabz.DataStructure;
/**
 * DeQueue is an abstract data structure, somewhat similar to Stacks.
 *   Unlike stacks, a queue is open at both its ends. In this both end are used to insert data and remove data
 *   
 * @author amresh kumar
 * @since  26-11-2019
 * @param  <T> Generic
 * 
 */
public class Dequeue<T> {
Node head;



public Dequeue() //constructor to initializing the DeQueue object
{
	head=null;
}

/******************************************************************************************
 * 
 * To insert at the front of the Dequeue 
 * 
 * @param  item
 * @return void
 * 
 * ****************************************************************************************
 */
public void addFront(T item) {

	 
	  
	  Node node = new Node(); //new node
	  node.data = item;
	  node.next = null;

	  if (head==null) {
	    head=node; //if node is null means new item will be the first element
	  } else {
	    node.next = head;
	    head=node;
	   
	  }

	 
	}

/******************************************************************************************
 * 
 * To add element at the rear of the dequeue
 * 
 * @param  item
 * @return void
 * 
 * ****************************************************************************************
 */
public void addRear(T item) {
	Node node=new Node();// creating new node
	node.data=item; //inserting data to new node
	node.next=null;
	
	if(head==null) 
		
		head=node;
	
	else {
		Node n=head;
		while(n.next!=null) //traversing till last node
		
			n=n.next;
		
		n.next=node; //after the last node is found than the new node is assigned 
	}
}

/*******************************************************************************************************
 * To remove the element from the rear side
 * 
 * @param 	null
 * @return  void
 * 
 * *****************************************************************************************************
 */
public T removeRear() {
	T removed=null;
	Node n=head;
	if(size()==0) // If index is 0 means deleting the First element
		
		head=head.next;
	
	else
	{
				
		Node n1=null;		// to store the address of the front node of the node which is to be deleted
		int size=size();
		for(int fact=0;fact<size;fact++) 
			n=n.next;
		removed=(T)n.data;
		//System.out.println(removed);
		n.next=null;			
		
	}
	return removed;
}	

/*******************************************************************************************************
 * To remove the element from the front side
 * 
 * @param 	null
 * @return  void
 * 
 * *****************************************************************************************************
 */
	public T RemoveFront() {
		Node node=head;
		T removed=null;
		if(node==null)
			System.out.println("Empty");
		else {
			
			 node=head;
			 removed=(T) head.data;  
			head=node.next;
			
		}
		return removed;
	}
	
	
	/***************************************************************************************************
	 * 
	 * To check if dequeue is empty or not
	 * 
	 * @param  null
	 * @return void
	 * 
	 * *************************************************************************************************
	 */
public boolean isEmpty() {
	if(size()==0)
		return false; //return false if there is any element
	else
		return true; // return true if there is no element
}
	
	
	/**********************************
	 * to find the size of the list
	 * 
	 * @return integer
	 * 
	 * ********************************
	 */
	public int size() {
		Node node=head; //creating the node object to store the head
		int count=0;
		while(node.next!=null) // traverse all the element of the list
		{
			count++;
			node=node.next;
		}
		return count++; //return the size of list
	}
	
	
	/**************************************************************************************************
	 * 
	 * TO show all the elements in the Dequeue
	 * 
	 * @param  null
	 * @return void
	 * 
	 * ***********************************************************************************************
	 */
	public void show() {
		Node n=head;
		while(n.next!=null) // loop to traverse till next is null
		{
			
			System.out.print(n.data+" "); //will show the elements 
			n=n.next;
		}
		System.out.print(n.data+"\n"); //will show the last element its next is null
	}


}
