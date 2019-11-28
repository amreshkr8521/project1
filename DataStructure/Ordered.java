package com.bridgelabz.DataStructure;

import java.io.*;

import com.bridgelabz.algorithm.Sorting;
import com.bridgelabz.util.Utility;
/**
 * To take the input in integer and if the input is not found in the file then write or else delete the file.
 *
 *  @author 	amresh kumar
 *  @since 		25-11-2019
 *  @version 	1.0
 */
public class Ordered {
	private static BufferedReader br;
	/*********************************************************************************************************
	 *To take the input in integer and if the input is not found in the file then write or else delete the file. 
	 * 
	 * @throws 	IOException
	 * @param	null
	 * @return	void
	 * 
	 * *******************************************************************************************************
	 */
public static void ordered() throws IOException {
	// object of LinkedList class
			LinkedList<Integer> list = new LinkedList<Integer>();
			System.out.println("Enter the number you want to search :");
			Integer item = Utility.nextInteger();

			// logic to read elements from file and store in string
			String str = Utility.readFromFile("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");
			String[] strArray = str.split(" "); //split the file with blank space
			int size = strArray.length;

			int[] array = new int[size];

			for (int i = 0; i < size; i++) {
				array[i] = Integer.parseInt(strArray[i]);
			}

			// sorting the array
			int[] sortedArray = bubbleSort(array, size);

			// adding in data into linkedlist
			for (Integer num : sortedArray) {
				list.add(num);
			}

			// write into file
			FileWriter fw = new FileWriter("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");
			// logic to search the item into the file
			if (list.search(item) == true) {
				list.remove(item); // removing the item if its already in file
			} else {
				list.add(item); // adding the item into file
			}
			list.show();
			int length = list.size();
			//writing in the file after the process
			for (int i = 0; i <= length; i++) {
				fw.write(list.pop(0) + " ");
			}
			fw.close();//closing the file
}

/********************************************************************************************************************************
 * 
 * to sort the elements of the array using bubble sort technique
 * 
 * @param 	arr    --> integer
 * @param 	length --> integer
 * @return 	integer array
 * 
 * *******************************************************************************************************************************
 */
public static int[] bubbleSort(int[] arr, int length) {
	// Logic to sort the array
	int i, j, temp;
	for (i = 0; i < length; i++) {
		int flag = 0;
		for (j = 0; j < length - 1 - i; j++) {
			if (arr[j] > arr[j + 1]) {
				// swapping the two elements in array to sort the array
				temp = arr[j];
				arr[j] = arr[j + 1];
				arr[j + 1] = temp;
				flag = 1;
			}
		}
		if (flag == 0) {
			break;
		}
	}
	for (i = 0; i < length; i++) {
		System.out.print(arr[i] + " ");
	}
	return arr;
}
}
