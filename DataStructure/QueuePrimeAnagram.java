package com.bridgelabz.DataStructure;

import com.bridgelabz.util.Utility;
/********************************************************************************
 * 
 * To print the prime number which are anagram by implementing the queue method
 * 
 * @author 	amresh kumar
 * @since 	28-11-2019
 * @version 1.0
 *
 ********************************************************************************
 */
public class QueuePrimeAnagram {

	/******************************************************************************
	 * 
	 * To print the prime number which are anagram by implementing the queue method
	 * 
	 * @param 	null
	 * @return 	void
	 * 
	 * *****************************************************************************
	 */
	public static void queuePrimeAnagram() {
		Queue<Integer> q = new Queue<Integer>();

		// Logic to check the number is prime or not
		for (int i = 2; i <= 1000; i++) {
			if (Utility.isPrime(i)) {
				q.enqueue(i);
			}
		}

		int size = q.size();
		int[] array = new int[size];

		// Logic to dequeue the number and store the numbers into array
		for (int i = 0; i < size; i++) {
			array[i] = q.deQueue();
		}

		// Logic to check the prime numbers are anagram and store in queue
		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (Utility.isAnagram(array[i], array[j]) && array[i] != 0 && array[j] != 0) {
					q.enqueue(array[i]);
					q.enqueue(array[j]);
				}
			}
		}
		q.show();
	}
	public static void main(String[] args) {
		queuePrimeAnagram();
	}
}
