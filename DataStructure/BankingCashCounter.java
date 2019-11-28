package com.bridgelabz.DataStructure;

import java.util.Scanner;
/**
 * 	Banking Cash Counter where people  
 *	come  in  to deposit Cash and withdraw cash
 *
 * @author amresh kumar
 *
 */
public class BankingCashCounter {
	public static Scanner scanner=new Scanner(System.in);
	 static Queue queue=new Queue<Integer>();
	
	 
/***************************************************************************************************
 * 
 * To make the user to choose the option and act as per the options
 * 
 * @param  null
 * @return void	 
 * 
 * *************************************************************************************************
 */
public static void banking() {
	BankingCashCounter bcn=new BankingCashCounter();
	System.out.println("**********************************************");
	System.out.println("Enter your option");
	System.out.println("1 : Deposit money");
	System.out.println("2 : Withdraw money");
	System.out.println("3 : Check balance");
	System.out.println("4 : Exit");
	System.out.println("**********************************************");
	bcn.bankingCashCounter((scanner.nextInt()));
}


/**
 * According to the option given by the use task is performed 
 * 
 * @param option
 */
public  void bankingCashCounter(int option) {
	switch(option) 
	{
	case 1 : 
			System.out.println("Enter the money= ");
	 		queue.enqueue(scanner.nextInt());//to deposit the money
	 		
	 		banking();
	 		break;
	 		
	case 2:
			System.out.println("Enter the money= ");
			
			queue.dequeue(scanner.nextInt()); // to withdraw the money
			banking();
			break;
			
	case 3:	
			queue.show(); //show the balance
			banking();	
			break;
	case 4: 
			System.out.println("thank you "); //exit
			break;		
			
	}
	
	
		
	}
	
}



