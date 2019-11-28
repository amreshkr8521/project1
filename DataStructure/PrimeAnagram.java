package com.bridgelabz.DataStructure;

import com.bridgelabz.util.Utility;

/**
 *   the  Prime  Number  Program  and  store  only  the  numbers  in  that  range  that  are
 *   Anagrams.  For  e.g.  17  and  71  are  both  Prime  and  Anagrams  in  the  0  to  1000  range.
 * 
 * @author 	amresh kumar
 * @since 	27-11-2019
 * @version 1.0
 *
 */
public class PrimeAnagram {
 
	/**********************************************************************
	 * 
	 * To check the number if it is both prime and anagram between 0-1000 
	 * 
	 * @param 	-->null
	 * @return 	-->void
	 * 
	 * ********************************************************************
	 */
	public static void primeAnagram() {
		// initialization of array
				int arr[] = new int[1000];
				// logic to check the prime numbers
				int number = 2;
				for (int i = 0; i < arr.length; i++) {
					if (Utility.isPrime(number)) {

						arr[i] = number;
					}
					number++;
				}
				System.out.println("Numbers that are prime and anagram : ");

				int[] first = new int[arr.length];

				// logic to check prime numbers are anagram or not
				for (int k = 0; k < arr.length; k++) {
					for (int j = k + 1; j < arr.length; j++) {
						if (Utility.isAnagram(arr[k], arr[j]) && (arr[k] != 0 && arr[j] != 0)) {
							System.out.println(arr[k] + " && " + arr[j]);   //displaying numbers which are prime and anagram 
							first[k] = arr[k];
						}
					}
				}
				System.out.println("/////////////////////////////////////////////////////////////");
				int x = 0;
				int[][] f1 = new int[10][100];
				for (int i = 0; i < 10; i++) {
					for (int j = 0; j < 100; j++) {
						f1[i][j] = first[x];
						x++;
						if (f1[i][j] != 0)
							System.out.print(f1[i][j] + "\t"); //displaying 2D Array
					}
					System.out.println();
				}
	}
}
