/**
 * To reverse a integer type of value
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 */




package com.bridgelabz.util;

public class IntReverse {

	
	/**
	 * To reverse the integer type of value
	 * 
	 * @param num => upon which the reverse claculation is done
	 * @return
	 */
	public static int intReverse(int num) {
		int rev=0; //to save the reverse value
		while(num!=0) //loop will work till the num becomes Zero or less
		{
		//taking the last digit of the number
		int	temp=num%10; 
		//reversing the passed number
		rev =rev*10+temp; 
		//dividing the number with 10 to eliminate the last digit of the number
		num=num/10;		 
		
		}
		return rev; //returning the reversed number
	}
	public static void main(String[] args) {
		System.out.println("1234 ="+intReverse(1234));
		
	}
}
