package com.bridgelabz.inventory;

import java.util.Scanner;

import org.json.simple.JSONObject;
/*************************************************************************************
 * To take all the data from the user and access those data in the controller class
 * 
 * @author Amresh Kumar
 * @since  16-12-219
 * 
 *************************************************************************************
 */
public class View {
	static InventoryController invControllerObject= new InventoryController();
	static Scanner scanner=new  Scanner(System.in);
	static double totalWeight=0;
	static double totalPrice=0;
	/**
	 * To show the menu to the user, it's the main menu of the pogram
	 */
public static void menu() {
	System.out.println("*******Inventory Management******* ");
	System.out.println();
	System.out.println(" ***Option***");
	System.out.println("1 : Manager");
	System.out.println("2 : Client");
	System.out.println("3 : Exit");
	option(scanner.nextInt());
}
private static void option(int choice) {
	
	switch(choice) {
	case 1:
		menu("Manager");
		break;
		
	case 2:
		menu("client");
		break;
	case 3:
		System.out.println("***Thank You****");
		System.out.println("Visit again");
		System.exit(0);
		break;
	default:
		System.out.println("***wrong choice***");
		menu();
		break;
	
	}
}
@SuppressWarnings("static-access")
public static void menu(String choice) {
	switch(choice) {
	case "Manager":
		System.out.println("****your option****");;
		System.out.println("1 : add");
		System.out.println("2 : view");
		System.out.println("3 : home");
		switch(scanner.nextInt()) {
		case 1:
			JSONObject jsonObject=invControllerObject.addDetails();
			
			invControllerObject.writeToFile(jsonObject,"wheat.json");
			menu("Manager");
			break;
		case 2:
			System.out.println("Enter your choice");
			System.out.println("1 : Wheat");
			System.out.println("2 : Rice");
			System.out.println("3 : Pulses");
			switch(scanner.nextInt()) {
			case 1:
				invControllerObject.show("Wheat");
				break;
			case 2:
				invControllerObject.show("Rice");
				break;
			case 3:
				invControllerObject.show("Pulses");
				break;
			case 4:
				menu("Manager");
				break;
			default :
				System.out.println("***Wrong choice***");
				menu("Manager");
				break;
			}
			menu("Manager");
			break;
		case 3:
			menu();
			break;
		default :
			System.out.println("***Wrong input***");
			menu("Manager");
			break;
			
		}
	case "client":
		System.out.println("****your option****");
		System.out.println("1 : Wheat");
		System.out.println("2 : Rice");
		System.out.println("3 : Pulses");
		System.out.println("4 : total price");
		System.out.println("5 : total weight");
		System.out.println("6 : home");
		switch(scanner.nextInt()) {
		case 1:
			invControllerObject.show("Wheat");
			System.out.println("Enter the select your type");
			String Name=scanner.next();
			System.out.println("Enter the weight");
			long wt=scanner.nextLong();
			if(invControllerObject.IsWeight(wt,"wheat.json", Name)) {
				double price=wt*invControllerObject.getPrice("wheat.json",Name,wt);
				invControllerObject.deleteweight("wheat.json",wt,Name);
				totalWeight=totalWeight+wt;
				totalPrice=totalPrice+price;
			}
			else
			{
				System.out.println("not in the inventory try smaller weight");
				menu("client");
			}
			menu("client");
			break;
		case 2:
			invControllerObject.show("Rice");
			System.out.println("Enter the select your type");
			String RName=scanner.next();
			System.out.println("Enter the weight");
			long Rwt=scanner.nextLong();
			if(invControllerObject.IsWeight(Rwt,"wheat.json", RName)) {
				double price=Rwt*invControllerObject.getPrice("wheat.json",RName,Rwt);
				invControllerObject.deleteweight("wheat.json",Rwt,RName);
				totalWeight=totalWeight+Rwt;
				totalPrice=totalPrice+price;
			}
			else
			{
				System.out.println("not in the inventory try smaller weight");
				menu("client");
			}
			menu("client");
			break;
		case 3:
			invControllerObject.show("Pulses");
			System.out.println("Enter the select your type");
			String PName=scanner.next();
			System.out.println("Enter the weight");
			long Pwt=scanner.nextLong();
			if(invControllerObject.IsWeight(Pwt,"wheat.json", PName)) {
				double price= (Pwt*invControllerObject.getPrice("wheat.json",PName,Pwt));
				invControllerObject.deleteweight("wheat.json",Pwt,PName);
				totalWeight=totalWeight+Pwt;
				totalPrice=totalPrice+price;
			}
			else
			{
				System.out.println("not in the inventory try smaller weight");
				menu("client");
			}
			menu("client");
			break;
		case 4:
			
			System.out.println("Total price of all items ="+invControllerObject.totalPrice());
			menu("client");
			
			break;
		case 5:
			System.out.println("Total Weight of all items ="+invControllerObject.totalWeight());
			menu("client");
			break;
		case 6:
			totalPrice=0;
			totalWeight=0;
			menu();
			break;
		default:
			System.out.println("***Wrong Input**");
			System.out.println();
			menu(choice);
		}
	}
	
}
//main method
public static void main(String[] args) {
	menu();
}
}
