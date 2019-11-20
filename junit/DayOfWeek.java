package com.bridgelabz.junit;

import java.util.Scanner;

/**
 * To determine the Day Of The Week
 * 
 * @author amresh kumar
 * @version 1.0
 * 
 */

public class DayOfWeek {
	static Scanner scanner=new Scanner(System.in); //Scanner object created
	
	public static void dayOfWeek() {
		String[] day= {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
		System.out.println("Enter the month :");
		int month=scanner.nextInt();
		System.out.println("Enter the year :");
		int year=scanner.nextInt();
		System.out.println("Enter the day :");
		int day1=scanner.nextInt();
		
		int m=(month-2+12)%12;
		if(m<=2) {
			year--;
		}
		year=5*(year%4)+4*(year%100+6*(year%400));
		int dayOfWeek=(day1+(int)(2.6*month-0.2)+year)%7; //Calculate the day of week.
		System.out.println("day ofthe week is: "+day[dayOfWeek]);
		}
	
	
		public static void main(String[] args) {
			
		dayOfWeek();

}
}
