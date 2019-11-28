package com.bridgelabz.DataStructure;
/***********************************************************************************************
 * Linked List in the  stack form
 * 
 * @author 	amresh kumar
 * @since	26-11-2019
 * @version 1.0
 *
 * @param <T> Generic type
 * 
 * *********************************************************************************************
 */
public class  StackLinked <T>{
	
	Node head;
	//constructor of StackLinked class
	StackLinked(){
		head=null;
	}
	
	/********************************************************************************************
	 * To push the element in the stacked list
	 * 
	 * @param 	item --> generic type
	 * @return 	void
	 * 
	 * *******************************************************************************************
	 */
public void push(T item) {
	Node node=new Node();// creating new node
	node.data=item; //inserting data to new node
	node.next=null;
	
	if(head==null) 
	{  
		head=node;
	}
	else {
		Node n=head;
		while(n.next!=null) //traversing through linked list till last node
		
			n=n.next;
		
		n.next=node; //after the last node is found than the new node is assigned 
	}
}

/*************************************************************
 * 
 * To pop the element from the stack
 * 
 * @param 	null
 * @return 	void
 * 
 **************************************************************
 */
public void pop() {
	Node node=head;
	if(node == null)
		 System.out.println("Stack is Empty");
	 else
	 {
		 Node current = node;
		 Node previous = null;
		 while(current.next != null)
		 {
			 previous = current;
		     current = current.next; 
		 }	
		
		 previous.next = null; 
		
	 }
	
}


/*********************************************************************
 * 
 * To check if the stack is empty or not
 * 
 * @param	-->null
 * @return	-->boolean
 * 
 * *******************************************************************
 */
public boolean isEmpty() {
	 if(head == null)
		 return true;
	 else
		 return false;
}

/***********************************************************
 * 
 * To find the size of the stack
 * 
 * @param	--> null
 * @return	-->integer
 * 
 * ********************************************************
 */
public int size()
{
	 int size = 0;
	 Node current = head;
	 while(current != null)
	 {
		 current = current.next;
		 size++;
	 } 
	 return size;
}


/***********************************************************
 * 
 * To display the stack
 * 
 * @param -->null
 * @return--> void
 * 
 * **********************************************************
 */
public void display()
{
	 Node node =head;
	 while(node != null)
	 {
		 System.out.print(node.data +" ");
		 node = node.next;
	 }    
	 System.out.println();    
}

/*****************************************************************
 * To get the last value of the stack
 * 
 * @return generic type
 * 
 * **************************************************************
 */
public T peek()
{
	 T data = null;
	 if(head == null)
		return data;
	 else
	 {
		 Node current = head;
		 Node previous = null;
		 while(current != null)
		 {
			 previous = current;
			 current = current.next;
		 }
		 data = (T) previous.data;
	 }
	return data;	 
}


}
