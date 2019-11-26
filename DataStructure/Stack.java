package com.bridgelabz.DataStructure;

public class  Stack <T>{
	
	Node head;
	Stack(){
		head=null;
	}
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

public boolean isEmpty() {
	 if(head == null)
		 return true;
	 else
		 return false;
}
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
