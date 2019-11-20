package com.bridgelabz.function;
/**
 * TO determine the effective temperature of an area at a given temperature and velocity
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 */
public class WindChill {
	
	/**
	 *TO determine the effective temperature of an area at a given temperature and velocity
	 * 
	 * @param t => temperature passed 
	 * @param v => velocity of the wind
	 * @return null
	 * @since 19-11-2019
	 */
public static void windChill(int t,int v) {
	double w=0;
	if(t<50 || v<120 ||  v>3 )// applying condition to get effective temperature
	{
		//calculation for determining the effective temperature
		 w=34.74+0.621*t+(0.4275*t-35.75)*Math.pow(v, 0.16);
	}
	else // If the condition is not satisfied 
	{
		System.out.println("NOT VALID");
	}
	System.out.println("Weather ="+ w); //displaying effective weather 
}
public static void main(String[] args) {
	windChill(40, 50);
}
}
