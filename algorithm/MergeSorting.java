/**
 * to sort an array using merge sorting technique 
 * which is the most effective way to sort any array.
 * In this technique divide and rule method is used 
 * 
 * @author amresh kumar
 * @since 18-11-2019
 * @version 1.0
 */



package com.bridgelabz.algorithm;

public class MergeSorting {
	static int lowerIndex=0,higherIndex=0,middle;
	static int[] array;
	static int[] new_array;
public static void mergeSort(int[] arr) {
	 for(int fact=0;fact<arr.length;fact++) {
		 array[fact]=arr[fact];
	 }
	int arrayLength=array.length;
	
	divideArray(lowerIndex,arrayLength-1);
	 }
	
/**
 * to divide the array to an individual character 
 * 
 * @param lowerIndex
 * @param higherIndex
 */
	public static void divideArray(int lowerIndex , int higherIndex ){
		
		if(lowerIndex<higherIndex) {
			middle=lowerIndex+(higherIndex-lowerIndex)/2;
		divideArray(lowerIndex,middle);	//recurtion to divide further 
		
		divideArray(middle+1,higherIndex);// recurtion to divide further
		merge(lowerIndex,middle,higherIndex); // to merge the divided array
	}
	}
	
	/**
	 * To merge the array into a single array and sort the array while inserting 
	 * 
	 * @param lowerIndex
	 * @param middle
	 * @param higherIndex
	 */
	public static void merge(int lowerIndex,int middle,int higherIndex) {
		int lower=lowerIndex;
		int high=middle+1;
		int index=lowerIndex;
		int[] temp=new int[array.length];
		for(int fact=0;fact<array.length;fact++) {
			temp[fact]=array[fact];
		}
		while(lower<middle && high<higherIndex) {
		if(temp[lower]<=temp[high]) {
			
			array[index]=temp[lower];
			lower++;
		}
		else {
			array[index]=temp[high];
			high++;
		}
		index++;
		}
		while(lower<=high) {
			array[index]=temp[lower];
			index++;
			lower++;
		}
		
		}	
	
	public static void main(String[] args) {
		int[] arr= {89,54,12,47,98,53,12};
		mergeSort(arr);// calling the mergesort() to merge the arr
	}
}

