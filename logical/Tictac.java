

/** 
 * TicTac is a game which is a matrix of 3*3 and played with the computer
 * one player has "X" and other has "O"
 * the player who makes first three marks in a straight wins
 * 
 * @Author amresh kumar
 * @version 1.0
 * @since 13-11-2019
 */
package com.bridgelabz.logical;
import java.lang.Math;
import java.util.Scanner;


public class Tictac {
static String[] arr= {"_","_","_","_","_","_","_","_","_"};
static int pass=1;
static Scanner sc=new Scanner(System.in);

/**
 * This method is to mark "X" or "O" for human turn
 * 
 * @param place at which the mark is to be made
 * @since 13-11-2019
 * @return null
 */
public static void HumanMove(int place) {
	if(place>9 && place<1) {
		HumanMove((int)Math.random()*10);	
	}
	if((arr[place]=="O"||arr[place]=="X") || place>8 || place<1) // to check if the given position is valid or not
	{
		System.out.println("invalid place");
	System.out.println("Enter valid position ");
	int newPosition=sc.nextInt(); //valid position taken by user 
	HumanMove(newPosition); //Human makes his/her move.
	 
	}
	else
	arr[place-1]="X";
	show();
	System.out.println("****************");
	System.out.println("");
	pass=-pass;
}

/**
 * This method is to mark "X" or "O" for computer turn
 * 
 * @param place at which the mark is to be made
 * @since 13-11-2019
 * @return null
 */
public static void ComputerMove(int p) {
	
	if(p>8) {
		ComputerMove((int)Math.random()*10);
	}
	else if(arr[p]=="O"||arr[p]=="X"  ||p<1) {
		
		ComputerMove((int)Math.random()*10); //recursive method used
	
	}
	else {
	arr[p-1]="O";
	
	show();
	System.out.println("****************");
	System.out.println("");
	pass=-pass;
	}
	
}

/**
 * to check every row to check if anyone is winner or not
 * @param a 
 * 
 */
public static void rowWin(String[] a) {
	if((a[0]=="O" && a[1]=="O" & a[2]=="O") || (a[3]=="O" && a[4]=="O" & a[5]=="O") || (a[6]=="O" && a[7]=="O" & a[8]=="O")) {
		System.out.println("wins");
	}
	
}
public static void coulmnWin(String[] a) {
	if((a[0]=="O" && a[3]=="O" & a[6]=="O") || (a[1]=="O" && a[4]=="O" & a[7]=="O") || (a[3]=="O" && a[5]=="O" & a[8]=="O")) {
		System.out.println("wins");
	}
	
}
public static void diagonalWin(String[] a) {
	if((a[0]=="O" && a[4]=="O" & a[8]=="O") || (a[2]=="O" && a[4]=="O" & a[6]=="O")) {
		System.out.println("Wins");
	}
	
}
static void show() {
	System.out.println(arr[0] +" "+ arr[1] +" "+ arr[2]);
	System.out.println(arr[3] +" "+ arr[4] +" "+ arr[5]);
	System.out.println(arr[6] +" "+ arr[7] +" "+ arr[8]);
}
public static void ticTac(int pass) {
	for(int i=0;i<9;i++) {
		if(pass==1) {
			
			ComputerMove((int)(Math.random() * 10));
		}
		else
		{
			
			System.out.println("Enter the place to fill");
			int x=sc.nextInt();
			HumanMove(x); //calling HumanMove() to make the human take its call
		}
	}	
}
public static void main(String[] args) {
	
	ticTac(pass); // calling ticTac() to play Tic tac
}
}
