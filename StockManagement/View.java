package com.bridgelabz.StockManagement;

import java.util.Scanner;
/**
 * this class is used to interact with the user by showing verious options
 * 
 * @author amresh kumar
 *
 */
public class View {
	Scanner scanner=new Scanner(System.in);
	StockController controllerObject=new StockController();
	public void menu() {
		
		System.out.println("***STOCK MANAGEMENT***");
		System.out.println();
		System.out.println("Choose your option");
		System.out.println("1 : new stock");
		System.out.println("2 : old stock");
		System.out.println("3 : Exit");
		option(scanner.nextInt());
	}
	private void option(int option) {
		switch(option) {
		case 1:controllerObject.newStock();
		menu();
			break;
		case 2:
			System.out.println("********LOGO********");
			controllerObject.showLogo();
			System.out.println();
			System.out.println("enter the logo");
			String logo=scanner.next();
			controllerObject.readFile("Stock.json",logo);
			System.out.println("*********************");
			System.out.println("your option");
			System.out.println("1 : price of each stock");
			System.out.println("2 : total price of stock");
			System.out.println("3 : Total share of the company");
			switch(scanner.nextInt()) {
			case 1: 
				System.out.println("Price of each stock is = "+controllerObject.price(logo));
				menu();
				break;
			case 2:
				System.out.println("Total Price of stock is = "+controllerObject.totalPrice(logo));
				menu();
				break;
			case 3:
				System.out.println("Total share of the company is = "+controllerObject.totalShare(logo));
				menu();
				break;
			default :
				System.out.println("***wrong choice***");
				menu();
				break;
			}
			
			break;
			
		case 3:
			System.exit(0);
		default :
			System.out.println("**Wrong Input**");
			menu();
			break;
		}
		
	}
//main
	public static void main(String[] args) {
		View object=new View();
		object.menu();
	}
}
