

 /**
 *  To store all logics of program which an be further used
 * 
 * @author Amresh kumar
 * @version 1.0
 * @since 15-11-2019
 */

package com.bridgelabz.util;
import java.util.Scanner;

public class utility {
public static Scanner scanner=new Scanner(System.in);


 
/*****************   Prime Number   ***************************

/*
 * 
 * to check the number is prime or not
 * if number is not prime than it will return false and if prime than return true
 * @parameter arg it will accept an int type argument
 * @returnType boolean
 */
	public static boolean isPrime(int arg) {
	// to traverse each number till half of the arg	
	for(int num=2;num<=arg/2;num++)
	{
		if(arg%num==0)
		{
			return false;
		}
		else
			return true;
	}
	return true;
}
	/***************************  Leap Year  *************************
	 *
	 *
	 * To check the year is leap year or not
	 * @param the year given by the user
	 * @return true for leap year and false for not leap year
	 */
public static boolean isLeapYear(int year) {
	if(year%4==0 || (year%10!=0) || year%400==0) {
		return true;
	}
	else
		return false;
}
/**
 * to check the year is correct or not, if year is correct then it will call isleapyear() 
 * 
 * @param the year to be checked
 */
public static void leapYearCheck(int year) {
	if(year>1000 && year<100000) {
		System.out.println(isLeapYear(year));
	}
	else
		System.out.println("Invalid Year");
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


/**
 * to check the factorial of a given number
 * @param type is integer 
 * @since 15-11-2019
 * 
 */
public static void factorial(int parameter) {
	int calculate=1;
	while(parameter!=0) {
		System.out.print(parameter+"* ");
		parameter--;
		calculate=calculate*parameter;
	}
System.out.print(calculate);	
}

/************************* Binary Search*********************
 * 
 * to search a number from an array using binary search
 * @param an array from which the number is searched, number to be searched, first index and last index
 * @since 15-11-2019 
 * 
 */
public static int binarySearchIntiger(int[] arr,int searchednumber, int lastIndex, int firstIndex) {
	//checking if last index is greater than first index.
	if(lastIndex >=firstIndex)														
	{
		 //getting the middle index
		int middle=firstIndex +(lastIndex-firstIndex)/2;
		 //comparing the middle index number to the number to be searched
		if(arr[middle]==searchednumber)											    
		{
			//returning the index of the searched number
			return middle; 															 
		}
		//checking if number is greater than middle index number or not
		else if(searchednumber>arr[middle]) 										
		{	
			//recurtion of binarySearchIntiger() with new first,last index
			binarySearchIntiger(arr, searchednumber, lastIndex, middle);			
		}
		else if(searchednumber<arr[middle])											
		{
			//recurtion of binarySearchIntiger() with new first,last index
			binarySearchIntiger(arr, searchednumber, middle, firstIndex);			
		}
	}
	return -1;					//returning -1 if number not found 
	}

/*************************** ANAGRAM *******************
 * 
 * 
 * to check two word if they are anagram or not
 * 
 * @param param1 => the first word
 * @param param2 => the second word with which first word is to check
 * @return true or false: true if words are anagram and vice versa
 * 
 * @since 18-11-2019
 */
public  static boolean IsAnagram(String param1,String param2) {
	if(param1.length()==param2.length()) {
		// converting both string to char type
		char[] string1=param1.toCharArray();
		char[] string2=param2.toCharArray();
		//to traverse character of first string
		for(int count=0;count<param1.length();count++)
		{
			int flag=0; //Used as indicator 
			
			//traverse the second string
			for(int count1=0;count1<param2.length();count1++) {
				if(string1[count]==string2[count1])//comparing two letters
				{
					flag=1;//changing the indicator value. 
				}
			}
			if(flag==0) 
			{
				return false; //returns false if letter was not found on other string
			}
		}

	}
	else
		return false; //returns false if both of the string does not have same number of letters
	return true; //returns true if all conditions are verified
}



/**************************** Square Root ******************
 * 
 * To find the square root of the passed value 
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



/****************** TO BINARY NUMBER ***********************
 * 
 * 
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
	 //Return the binary number by calling the intReverse() method from utility class
	return ((utility.intReverse(bin))*10); 
	}
	else {
		while(num!=0) {
			//calculation for the binary number
			int temp=num%2; // store the reminder value 
			bin=bin*10+temp; 
			num=num/2;    //divide the num with 2
			
		}
		//Return the binary number by calling the intReverse() method from utility class
	return utility.intReverse(bin);
	}							
}




/************************ TO DECIMAL *******************
 * 
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

}
