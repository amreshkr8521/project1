package com.bridgelabz.DataStructure;

import com.bridgelabz.util.Utility;
/****************************************************************************
 * 
 * To print Prime number which are anagram using stack
 * 
 * @author  amresh kumar
 * @since   28-11-2019
 * @version 1.0
 *
 ****************************************************************************
 */
public class StackPrimeAnagram {

	/************************************************************************
	 * 
	 * To print Prime number which are anagram using stack
	 * 
	 * @param null
	 * @return void
	 * 
	 * **********************************************************************
	 */
	public static void stackPrimeAnagram()
	{

		Stack st = new Stack(1000);

		// logic to push the prime number into stack
		for (int i = 2; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				st.push( (char) i);
			}
		}

		// logic to store prime numbers from stack to array
		int size = st.size();
		int[] array = new int[size];
		for (int i = 0; i < size; i++) {
			array[i] = st.pop();
		}

		// logic to check prime numbers are anagram or not
		for (int i = 0; i < size; i++) {
		
			for (int j = i + 1; j < size; j++) {
				if (Utility.isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0) {
					System.out.println(array[i] + " " + array[j]);
				}
			}
		}
	}
	
	
}
