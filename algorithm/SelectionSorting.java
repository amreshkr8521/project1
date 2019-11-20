/**
	 * to sort an array by the selection sorting technique
	 *
	 * 
	 * @author amresh kumar
	 * @param array which is to be sorted
	 * @since 16-11-2019
	 * @version 1.0
	 */

package com.bridgelabz.algorithm;

public class SelectionSorting {
	
	/**
	 * To sort the array using selection sort in effective way
	 * @param array => on which sorting is to be done
	 * @return no return value required
	 */
public static void selectionSort(int[] array) {
	int temp;
	//loop runs from 0 to the length of the array
	for(int count1=0;count1<array.length;count1++) 
	{
		//loop runs from count1+1 to length of the array 
	for(int count=count1+1;count<=array.length-1;count++) 
	{
		if(array[count1]>array[count])//comparing the elements
		{
			//replacing the array
			temp=array[count1];
			array[count1]=array[count];
			array[count]=temp;
		}
	}
	}
	//displaying sorted array
	System.out.print("Sorted array= ");
	for(int count=0;count<array.length;count++) {
		System.out.print(array[count]+" ");
	}
		}
public static void main(String[] args) {
	int[] arr= {5,9,7,5,4,8,6};
	selectionSort(arr);
}
}
