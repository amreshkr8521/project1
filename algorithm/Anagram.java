/**
 * to check weather the two Stings are anagram or no using the IsAnagram method
 *  
 * @author 	amresh kumar
 * @since 	18-11-2019
 * @version 1.0
 */

package com.bridgelabz.algorithm;

import java.util.Scanner;

public class Anagram {

	/**
	 * to check two word if they are anagram or not
	 * 
	 * @param 	param1 --> String
	 * @param 	param2 --> String
	 * @return 	boolean
	 * 
	 * @since 18-11-2019 
	 */
	
	static Scanner scanner=new Scanner(System.in);
	public  static boolean IsAnagram(String param1,String param2) {
		if(param1.length()==param2.length()) //checking the length of both the string
		{
			
<<<<<<< HEAD
			char[] string1=param1.toCharArray(); //converting into char array
			char[] string2=param2.toCharArray(); //converting into char array
			for(int count=0;count<param1.length();count++) //loop will continue till all letters are same or if any of the char is not found same
			{
				int flag=0; //indicator
				for(int count1=0;count1<param2.length();count1++)
				{
					if(string1[count]==string2[count1]) // comparing the characters
						flag=1; //changing the indicator if similar character found
					
				}
				if(flag==0) 
					return false;
				
=======
			char[] string1=param1.toCharArray(); //converting the string into array
			char[] string2=param2.toCharArray(); //converting the string into array
			for(int count=0;count<param1.length();count++) {
				int flag=0; // act as an indicator
				for(int count1=0;count1<param2.length();count1++) {
					if(string1[count]==string2[count1]) {
						flag=1;
					}
				}
				if(flag==0) {
					return false; //return false if two words are not anagram
				}
>>>>>>> 8ad6e390c9134df1393ecf038dea23348196bb13
			}

		}
		else
			return false; //return false if two words are not anagram
		return true;          //return true if two words are not anagram
	}
	public static void main(String[] args) {
<<<<<<< HEAD
		System.out.println("Enter the First word");
		String first_word=scanner.nextLine(); // scanning first string
		System.out.println("Enter the Second word");
		String second_word=scanner.nextLine();  //scanning second string
		 System.out.println(IsAnagram(first_word, second_word)); //calling the IsAnagram() method and checking the two number
		
=======
		System.out.println(IsAnagram("ajd","bca")); //calling IsAnagram() to check the two words and displaying the result
>>>>>>> 8ad6e390c9134df1393ecf038dea23348196bb13
		
	}
}
