package com.bridgelabz.function;


import java.util.Scanner;
/**
 *To take 2D array input and print them to the user 
 *
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class TwoDimensionalArray {
	static Scanner scanner=new Scanner(System.in); //scanner object created
public static void twoDimensionalArray() {
	
	System.out.println("Enter the row");
	int row=scanner.nextInt();// number of row taken by the user
	System.out.println("Enter the coulmn");
	int column=scanner.nextInt();// number of column is taken by user
	int matrix[][]= new int[row][column];
	System.out.println("Enter the 2D array elements");
	for(int row_traverse=0;row_traverse<row;row_traverse++)//Row is used to traverse through row
	{
		for(int column_traverse=0;column_traverse<column;column_traverse++)//column is used to traverse through column
			{
			matrix[row_traverse][column_traverse]=scanner.nextInt();
		}
	}
	 

	System.out.println("Entered 2D array is ");
	for(int row_traverse=0;row_traverse<row;row_traverse++)//Row is used to traverse through row
	{
		for(int column_traverse=0;column_traverse<column;column_traverse++) //column is used to traverse through column
		{
			System.out.print(matrix[row_traverse][column_traverse]+" ");// print each value of 2D array
		}
	}
	
}

public static void main(String[] args) {
	twoDimensionalArray();
}
}
