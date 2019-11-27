package com.bridgelabz.DataStructure;
/**
 * to have a node for the Linked List
 * @author  amresh kumar
 * @since   22-11-2019
 * @version 1.0
 */
public class Node<T> {
Node next;
T data;
Node(){
	next=null;
	data=null;
}
 Node(T item){
	next=null;
	data=item;
}
}
