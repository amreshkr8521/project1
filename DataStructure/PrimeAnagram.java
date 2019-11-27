package com.bridgelabz.DataStructure;
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
 
	/**
	 * To check the number if it is both prime and anagram between 0-1000 
	 */
	public static void primeAnagram() {
		//initialization of array
				int arr[] = new int[1000];
				//logic to check the prime numbers
				int number = 2;
				for (int i = 0; i < arr.length; i++) {
					if (isPrime(number)) {

						arr[i] = number;
					}
					number++;
				}
				System.out.println("Numbers which are prime and anagram : ");
				
				//logic to check prime numbers are anagram or not
				for (int k = 0; k < arr.length; k++) {
					for (int j = k + 1; j < arr.length; j++) {
						if (IsAnagram(arr[k], arr[j]) && (arr[k] != 0 && arr[j] != 0)) 
						{
							System.out.println(arr[k] + " " + arr[j]);
							
						}
					}
				}
	}
		
	/*****************   Prime Number   ***************************

	/*
	 * 
	 * to check the number is prime or not
	 * if number is not prime than it will return false and if prime than return true
	 * 
	 * @param		 arg --> integer
	 * @returnType	 boolean
	 */
		public static boolean isPrime(int arg) {
		// to traverse each number till half of the arg	
		for(int num=2;num<=arg/2;num++)
		
			if(arg%num==0)
				return false;
			
		
		return true;
	}
		/*************************** ANAGRAM *******************
		 * 
		 * 
		 * to check two word if they are anagram or not
		 * 
		 *
		 * @param param1 -->integer
		 * @return boolean
		 * 
		 * @since 18-11-2019
		 * 
		 * ******************************************************
		 */
		public  static boolean IsAnagram(int param1,int param2) {
			int temp=param1;
			int sum=0;
			while(param1!=0) {
				int temp2=param1%10;
				sum=temp2*10 +temp2;
				param1=param1/10;
				
			}
			if(sum==param2)
				return true;
			else
				return false;
		}
	
		
		/**
		 * 
		 */
		public static void show() {
			primeAnagram();
			
		}
}
