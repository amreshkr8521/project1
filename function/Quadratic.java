package com.bridgelabz.function;
/**
 * To calculate roots of the expression aX*X + b*X +c
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class Quadratic {
	/**
	 * To calculate roots of the expression aX*X + b*X +c
	 * @param a
	 * @param b
	 * @param c
	 * @since 19-11-2019
	 */
public static void roots(double a,double b,double c) {
	double delta=Math.abs(b*b-4*a*c); //calculating the delta
	double root1=(-b+Math.sqrt(delta))/(2*a); //calculating the root1
	double root2=(-b-Math.sqrt(delta))/(2*a); //calculating the root2
	System.out.println("root1 ="+root1);    //root1
	System.out.println("root2 ="+root2);	//root2
}
public static void main(String[] args) {
	roots(2,3,4);
}
}
