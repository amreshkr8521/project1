package com.bridgelabz.factorydesign;

import java.util.Scanner;

public class Runner {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter for PC RAM(in GB),HDD(in GB),CPU(in Gz)");
		Computer pc = ComputerFactory.getInstance("pc", scanner.next(), scanner.next(), scanner.next());
		System.out.println("Enter Laptop, RAM(in GB),HDD(in GB),CPU(in Gz)");
		Computer Laptop = ComputerFactory.getInstance("Laptop", scanner.next(), scanner.next(), scanner.next());

//		System.out.println("Enter Server, RAM(in GB),HDD(in GB),CPU(in Gz)");
//		Computer Server = ComputerFactory.getInstance("Server", scanner.next(), scanner.next(), scanner.next());

		System.out.println("PC config     = \t" + pc);
		System.out.println("Laptop config = \t" + Laptop);
	//	System.out.println("Server config = \t" + Server);
	}
}
