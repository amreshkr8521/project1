/**********
 * 
 * to search a number from the array and return it
 * @author amresh kumar
 * @since 15-11-2019
 * 
 */


package com.bridgelabz.algorithm;

public class BinarySearch {
	
	/************************* Binary Search*********************
	 * 
	 * to search a number from an array using binary search
	 * @param an array from which the number is searched, number to be searched, first index and last index
	 * @since 15-11-2019 
	 * 
	 */
	public static int binarySearchIntiger(int[] arr,int searchednumber, int lastIndex, int firstIndex) {
	
		if(lastIndex >=firstIndex)														//checking if last index is greater than first index.
		{
			int middle=firstIndex +(lastIndex-firstIndex)/2; 							//getting the middle index
			if(arr[middle]==searchednumber)											    //comparing the middle index number to the number to be searched 
			{
				return middle; 															//returning the index of the searched number 
			}
			else if(searchednumber>arr[middle]) 										//checking if number is greater than middle index number or not
			{
				binarySearchIntiger(arr, searchednumber, lastIndex, middle);			//recurtion of binarySearchIntiger() with new first,last index
			}
			else if(searchednumber<arr[middle])											//checking if number is less than middle index number or not
			{
				binarySearchIntiger(arr, searchednumber, middle, firstIndex);			//recurtion of binarySearchIntiger() with new first,last index
			}
		}
		return -1;																		//returning -1 if number not found 
		}
	public static void main(String[] args) {
		int arr[]= {2,3,6,4,7};
		System.out.println(binarySearchIntiger(arr, 4, arr.length-1, 0));
	}
	}


