package com.bridgelabz.factorydesign;

import java.util.Scanner;

public class ComputerFactory {
	private static String HDD;
	private static String RAM;
	private static String CPU;
	
	
	static Scanner scanner=new Scanner(System.in); 
public static Computer getInstance(String type,String RAM, String HDD, String CPU) {
	if("Laptop".equalsIgnoreCase(type))
	return new Laptop(RAM,HDD,CPU);
	else if("PC".equalsIgnoreCase(type)) {
		return new PC(RAM,HDD,CPU);
	
	}
	else if("Server".equalsIgnoreCase(type))
		return new Server(RAM,HDD,CPU);
	
	else
		return null;
}



}
