/**
 * To convert the decimal number to binary number
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 * 
 */


package com.bridgelabz.junit;

import com.bridgelabz.util.Utility;

public class ToBinary {

	/**
	 * To convert the number into the binary number
	 * 
	 * @param num => which is to be converted into the binary number
	 * @return the desired number
	 * @since 19-11-2019
	 */
	public static int toBinary(int num) {
		int bin=0; // to store the reverse of binary number
		if(num%2==0) // to check if number is divided by 2 or not  
		{
		while(num!=0) {
			//calculation for the binary number
			int temp=num%2; // store the reminder value 
			bin=bin*10+temp; 
			num=num/2;    //divide the num with 2
			
		}
		 //Return the binary number by calling the intReverse() method
		return ((Utility.intReverse(bin))*10); 
		}
		else {
			while(num!=0) {
				//calculation for the binary number
				int temp=num%2; // store the reminder value 
				bin=bin*10+temp; 
				num=num/2;    //divide the num with 2
				
			}
			//Return the binary number by calling the intReverse() method
		return Utility.intReverse(bin);
		}							
	}
	public static void main(String[] args) {
		System.out.println(toBinary(106));
	}
}
