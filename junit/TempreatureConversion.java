package com.bridgelabz.junit;

import java.util.Scanner;

/**
 * To convert temperature from Celsius to Fahrenheit and vice versa.
 *  
 * @author amresh kumar
 * @modified
 * @version 1.0
 * 
 */

public class TempreatureConversion {
static Scanner scanner=new Scanner(System.in);

/*
 * convert celsius to fahrenheit 
 */
static void toFahrenheit() {
	System.out.println("Celsius = ");
	int celsius=scanner.nextInt();
	int fahrenheit=(celsius*9/5)+32;
	System.out.println(celsius+" = "+ fahrenheit);
}

/*
 * convert fahrenheit to celsius
 * no parameter
 * no return type
 */
static void toCelsius() {
	System.out.println("fahrenheit = ");
	int fahrenheit=scanner.nextInt();
	int celsius=(fahrenheit*9/5)+32;
	System.out.println(fahrenheit+" = "+ celsius);
}

/*
 * To call toCelsius and toFahrenheit method 
 * no parameter
 * no return type
 */
static void temperatureConversion() {
	System.out.println("choose your option");
	System.out.println("1 : celsius to fahernheit");
	System.out.println("2 : fahernheit to celsius");
	int option=scanner.nextInt();
	if(option==1) {
		toFahrenheit();
	}
	else if(option==2) {
		toCelsius();
	}
}
public static void main(String[] args) {
	temperatureConversion();
}
}
