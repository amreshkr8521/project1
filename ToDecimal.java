/**
 * To convert the binary to decimal number
 * 
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 * 
 */





package com.bridgelabz.util;

public class ToDecimal {
/**
 * To convert binary number to decimal number
 * 
 * 
 * @param num => binary number which is converted to decimal number
 * @return decimal number
 * @since 19-11-2019
 */
	public static int toDecimal(int num) {
	//dec to store the decimal number in the process and count to count the numbers
		int dec=0, count=0; 
	while(num!=0) //loop will run till num is not Zero
	{
		//calculation for converting binary to decimal 
		int temp=num%10;
		dec=(int) (temp*Math.pow(2,count) +dec);
		num=num/10;
		count++;
	}
	return dec; //return the decimal number
}
public static void main(String[] args) {
	System.out.println(toDecimal(1101010));
}
}
