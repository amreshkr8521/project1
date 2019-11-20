package com.bridgelabz.algorithm;

/**
 * purpose is to sort the given array using the bubble sort in a effective way
 * and arrange it in assending order 
 * 
 * @author amresh kumar
 * @since 18-11-2019
 * @version 1.0
 */

public class BubbleSorting {
	/*
	public static void bubbleSorting(int[] arr) {
	
		int temp;
		for(int count1=0;count1<arr.length;count1++) {
			for(int count=0;count<arr.length;count++) {
				if(arr[count]>=arr[count1] ) {
			
					temp=arr[count1];
					arr[count1]=arr[count];
					arr[count]=temp;
					
				
				}
					
			}
		}
		System.out.print("Sorted array =");

		for(int count=0;count<arr.length;count++) {
		
			System.err.print(arr[count]+" ");
		}
		
	}
	*/
public static void main(String[] args) {
	int[] arr= {4,8,6,2,3,4};
	
	/**
	 *  calling the bubbleSorting() 
	 *  from the class Sorting to sort the array in assending order 
	 */
	Sorting.bubbleSorting(arr);
}
}
