package com.bridgelabz.junit;

/**
 * To calculate the square root of any number using a squreRoot()
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */

public class SqureRoot {
	
	/**
	 * To calculate the square root of any number
	 * 
	 * @param num => of which the square root is to be determine
	 * @return the square root of the pass value 
	 * 			if passed value is less than 0 then it will Zero
	 */
public static double squreRoot(int num ) {
	double temp=num;// temporary number to store the passed value
	//it denotes a very small number that is not negative, approaching zero but staying positive.
	double epsilon=1e-15; 
	if(num>0) // checks the num to be greater than Zero
	{
		//checking the condition to check the accuracy which is desired
	while(Math.abs(temp-num/temp)>epsilon*temp) 
	{
		temp=(temp+num/temp)/2.0; // calculation
	}
	return temp; //returns square root of num after the calculation 
	
}
	else return 0; //returns Zero if num is less than Zero
}
public static void main(String[] args) {
	System.out.println("sqrt of 0 ="+ squreRoot(0));
}
}
