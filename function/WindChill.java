package com.bridgelabz.function;

import java.util.Scanner;

/****************************************************************************************
 * TO determine the effective temperature of an area at a given temperature and velocity
 * 
 * @author 	amresh kumar
 * @since 	19-11-2019
 * @version 1.0
 * 
 * ***************************************************************************************
 */
public class WindChill {
	
	/**
	 *TO determine the effective temperature of an area at a given temperature and velocity
	 * 
	 * @param 	t --> integer 
	 * @param 	v --> integer
	 * @return 	null
	 * 
	 */
	static Scanner scanner=new Scanner(System.in); 
public static double windChill(int t,int v) {
	double w=0;
	if(t<50 || v<120 ||  v>3 )// applying condition to get effective temperature
	
		//calculation for determining the effective temperature
		 w=34.74+0.621*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	
	return w;
	

}
public static void main(String[] args) {
	System.out.println("Enter the temperature");
	int temp=scanner.nextInt();						//temperature input
	System.out.println("Enter the velocity");
	int velocity=scanner.nextInt();					//velocity input
	System.out.println(windChill(temp, velocity));	//calling windChill() and printing the value
}
}
