package com.bridgelabz.DataStructure;
/**
 * All Linked List implementation 
 * linked list is a list which has two part , first part has value and next part has address of the next node
 * unit of linked list is called node. 
 * In this class insertion of elements is done at starting, at any index value and at the end of linked list,
 * deletion of element is also done at the index given by the user
 * 
 * @author 	amresh kumar
 * @since 	22-11-2019
 * @version 1.0
 */

public class LinkedList {
Node head;


/***************************************************************
 * To insert the data in the linked list
 * 
 * @param 	data --> integer
 * @return 	void
 * 
 * *************************************************************
 */
public void insert(int data) {
	Node node=new Node();// creating new node
	node.data=data; //inserting data to new node
	node.next=null;
	
	if(head==null) 
		
		head=node;
	
	else {
		Node n=head;
		while(n.next!=null) //traversing through linked list till last node
		
			n=n.next;
		
		n.next=node; //after the last node is found than the new node is assigned 
	}
}
 /***********************************************************************
  * To Show all the elements of the linked list
  * 
  * @param 	no parameter
  * @return void
  * 
  * *********************************************************************
  */

public void show() {
	Node n=head;
	while(n.next!=null) // loop to traverse till next is null
	{
		
		System.out.println(n.data);
		n=n.next;
	}
	System.out.println(n.data); //will show the last element of the list as its next is null
}


/****************************************************************************
 * To insert the element at given index were the user wants to insert
 * 
 * @param  Index --> integer
 * @param  data	--> integer
 * @return void
 * 
 * ***************************************************************************
 */
public void insertAt(int Index,int data) {
	Node node=new Node();		//temporary node created
	node.data=data;
	node.next=null;
	Node n=new Node();
	n=head;
	if(Index==0) 
		
		insertAtStart(data);		//if index is 0 then this operation is done
	
	else
		
	for(int fact=0;fact<Index-1;fact++) //traversing through the linked list
		n=n.next;
	
	node.next=n.next; 
	n.next=node;
	
}


/************************************************************************
 * To insert the element at the starting point of the linked list 
 * 
 * @param data -->integer
 * @return void
 * 
 * **********************************************************************
 */
public void insertAtStart(int data) {
	Node node=new Node();
	node.data=data;
	node.next=head;				//assign head address to the new node 
	head=node;					// assign head with the new node
}

/*******************************************************************************
 * To delete at a given index from a linked list
 * 
 * @param  index --> integer
 * @return void
 * 
 * *****************************************************************************
 */
public void deleteAtIndex(int index) {
	
	if(index==0) // If index is 0 means deleting the First element
		
		head=head.next;
	
	else
	{
		Node n=head;		//node to traverse the list
		Node n1=null;		// to store the address of the front node of the node which is to be deleted
		
		for(int fact=0;fact<index-1;fact++) 
			n=n.next;
		
		n1=n.next;			
		n.next=n1.next;
	}
	
}


}


