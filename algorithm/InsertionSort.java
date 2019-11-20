package com.bridgelabz.algorithm;
/**
 * purpose is to sort an array using Insertion sort technique in a effective way 
 * in this sorting technique each element will take it place one by one   
 *
 * @author amresh kumar
 * @since 18-11-2019
 * @version 1.0
 *
 */
public class InsertionSort {
	/**
	 * to sort an array using insertion sorting technique
	 * 
	 * @param array
	 * @since 18-11-2019
	 */
public static void insertionSort(int[] array) {
	for(int count=0;count<array.length;count++) {
		int temp=array[count];
		
		for(int count1=count+1;count1<array.length;count1++) {
			
			if(temp>array[count1]) {
				array[count]=array[count1];
				for(int count2=count;count2<count2;count++) {
					array[count2]=array[count];
				}
				
			}
			
		}
		
	}
	for(int i=0;i<array.length;i++) {
		System.out.print(array[i]);
	}
}
public static void main(String[] args) {
	int[] array= {9,8,7,4,5,6};
	insertionSort(array);
}
}
