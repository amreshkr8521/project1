package com.bridgelabz.function;


/**
 * To find three number in a array to determine that the sum of all three number should be Zero 
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class AddsZero {
	
	/**
	 * To find three number in a array to determine that the sum of all three number should be Zero 
	 * 
	 * @param array => from which three numbers are taken to get the numbers whose sum is Zero 
	 * @since 19-11-2019
	 */
	public static void addsZero(int[] array) {
		//i ,j, k are three integer used for the iteration of the number of the array 
		for(int i=0;i<array.length;i++)
		{
			for(int j=i+1;j<array.length;j++) {
				
				for(int k=j+1;k<array.length;k++) {
					if(array[i]+array[j]+array[k]==0) // to check if sum is Zero or not
					{
						
					System.out.println(array[i]+"+"+array[j]+"+"+array[k]+"=0");	// display if sum is Zero
					}
				}
			}
		}
	}
public static void main(String[] args) {
	int[] array={-14,0,0,8,6}; //declaring the array.
	addsZero(array);// calling the addsZero() to find the three numbers whose sum is Zero from the array.
}
}
