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
				
			}

		}
		else
			return false;
		return true;
	}
	public static void main(String[] args) {
		System.out.println("Enter the First word");
		String first_word=scanner.nextLine(); // scanning first string
		System.out.println("Enter the Second word");
		String second_word=scanner.nextLine();  //scanning second string
		 System.out.println(IsAnagram(first_word, second_word)); //calling the IsAnagram() method and checking the two number
		
		
	}
}
