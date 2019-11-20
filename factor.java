package com.bridgelabz.util;

public class factor {
	/**
	 * to check the factorial of a given number
	 * @param type is integer 
	 * @since 15-11-2019
	 * 
	 */
	public static void factorial(int parameter) {
		int calculate=1;
		while(parameter!=0) //loop will cotinue till the parameter is 0
		{
			System.out.print(parameter+" ");
			parameter--;
			calculate=calculate*parameter; //calculation of factorial
		}
		
	}
	/******************factor****************
	 * 
	 * 
	 * to determine the factor and display it
	 * @param intiger type given by the user to check for its factor
	 * @since 15-11-2019
	 * 
	 */
	
	public static void Factor(int parameter) {
		//loop to traverse from 1 to parameter/2 which divide the parameter
		for(int fact=1;fact<=parameter/2;fact++) 
		{
			//to check if fact is factor of parameter or not
			if(parameter%fact==0) {
				
				System.out.println(fact);//Print the factor
			}
			
		}
		
	}
	public static void main(String[] args) {
		Factor(35);
		factorial(5);
	}

}
