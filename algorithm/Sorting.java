/*****************Sorting******************
 * 
 * to sort an array in different way
 * @author amresh kumar
 * @since 16-11-2019
 * @version 1.0
 */


package com.bridgelabz.algorithm;

public class Sorting {

	/**************
	 * To sort the array in bubble sorting technique 
	 * the biggest value will take its place at first and so on
	 * 
	 * @param 	array -->int[]
	 * @return	void
	 * @since 	16-11-2019
	 */
	public static void bubbleSorting(int[] array) {
		
		int temp;
		//loop running from 0 to length of the array
		for(int count1=0;count1<array.length;count1++)
		{
			for(int count=0;count<array.length;count++) {
				if(array[count]>=array[count1] ) //comparing values of array
				{
			//arranging the array 
					temp=array[count1];
					array[count1]=array[count];
					array[count]=temp;
					
				
				}
					
			}
		}
		System.out.print("Sorted array =");
		for(int count=0;count<array.length;count++)//loop for displaying the array
		{
			System.err.print(array[count]+" ");
		}
		
	}
	
	/**
	 * to sort an array by the selection sorting technique
	 * 
	 * @author amresh kumar
	 * @param  array --> int[]
	 * @return void
	 * @since  16-11-2019
	 * 
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
}
