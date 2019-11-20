package com.bridgelabz.junit;
/**
 * Purpose: to calculate the minimum number of notes given by the vending machine
 * 
 * @since 		: 13-11-2019
 * @version		: 1.0
 * @author 		:amresh kumar
 */
public class VendingMachine {
	/**
	 * To calculate number of notes needed to give out the consumer in the best way
	 * @since 	:13-11-2019
	 */
static void notes(int money) {
	int notes[]= {1000,500,100,50,20,10,5,2,1};//notes present in the vending machine
	int noteCounter[] = new int[9]; //new array to store the number of notes  
	for(int i=0;i<9;i++)//loop to traverse all the notes
	{
		if(money>notes[i]) {
			noteCounter[i]=money/notes[i];//counting number of notes
			money=money-noteCounter[i]*notes[i];
		}
	}
	System.out.println("currency count");
	for(int i=0;i<9;i++)//to print the number of notes required
	{
		System.out.println(notes[i]+" = "+noteCounter[i]);
	}
}
public static void main(String[] args) {
	notes(12348);
}
}
