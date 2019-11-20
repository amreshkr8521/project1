/**
 * to check weather the two Stings are anagram or no using the IsAnagram method
 *  
 * @author amresh kumar
 * @since 18-11-2019
 * @version 1.0
 */

package com.bridgelabz.algorithm;

public class Anagram {

	/**
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
			
			char[] string1=param1.toCharArray();
			char[] string2=param2.toCharArray();
			for(int count=0;count<param1.length();count++) {
				int flag=0;
				for(int count1=0;count1<param2.length();count1++) {
					if(string1[count]==string2[count1]) {
						flag=1;
					}
				}
				if(flag==0) {
					return false;
				}
			}

		}
		else
			return false;
		return true;
	}
	public static void main(String[] args) {
		System.out.println(IsAnagram("ajd","bca"));
		
	}
}
