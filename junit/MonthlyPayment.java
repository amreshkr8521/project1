package com.bridgelabz.junit;
/**
 * to check the monthly payment using math and display it 
 * @author Amresh kumar
 * @since 13-11-2019
 * @version 1.0
 * 
 */

import java.util.Scanner;


public class MonthlyPayment {
static Scanner scanner=new Scanner(System.in);

/**
 * To calculate the monthly payment
 * @param no parameter required to call
 * @return null
 * @since 13-11-2019
 */
static void monthlyPayment() {
	System.out.println("Enter the Principal");
	int principal=scanner.nextInt(); // Input of principal  
	System.out.println("Enter the Intrest Rate");
	int rate=scanner.nextInt(); //Input of rate
	System.out.println("Enter the year");
	int year=scanner.nextInt(); // Input of year
	
	//payment calculation
	double payment=(principal*(rate/(12*100))/(rate-Math.pow(1+(rate/(12*100)), -12*year)));

System.out.println("Monthly Payment = "+ payment);

}
public static void main(String[] args) {
	monthlyPayment(); //calling Monthlypayment() to calculate the payment  
}
}
