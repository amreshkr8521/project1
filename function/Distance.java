package com.bridgelabz.function;
/**
 * To find the distance between the (x,y) coordinate and (0,0) coordinate
 * 
 * @author amresh kumar
 * @since 19-11-2019
 * @version 1.0
 *
 */
public class Distance {
	
	/**
	 * To find the distance between (x,y) coordinate and (0,0) coordinate
	 * @param x_coordinate
	 * @param y_coordinate
	 * @since 19-11-2019
	 */
public static void distance(int x_coordinate,int y_coordinate) {
	//calculating the distance
	double distance=Math.sqrt(x_coordinate*x_coordinate+y_coordinate*y_coordinate);
	System.out.println("Distance ="+distance); //displaying the result
}
public static void main(String[] args) {
	distance(5, 8); //calling the distance method to calculate the distance 
}
}
