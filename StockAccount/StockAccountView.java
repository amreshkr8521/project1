package com.bridgelabz.Stock;

import java.io.FileWriter;
import java.util.ArrayList;

import org.json.simple.JSONObject;

import com.bridgelabz.utility.utility;
/********************************************************************************************
 * 
 * This
 * 
 * @author  Amresh Kumar
 * @since   6-12-2019
 * @version 1.0
 *
 *
 **********************************************************************************************
 */
public class StockAccountView {
	
		
		public static void main(String[] args) {

			
			JSONObject stockServicesViewJsonObject = new JSONObject();
			StockAccountServices StockAccountServicesObject = new StockAccountServices() {
				
				@Override
				public double totalPrice(String companyName) {
					
					return 0;
				}
				
				@Override
				public void readFile() {
					
					
				}
				
				@Override
				public double price(String name) {
					
					return 0;
				}
				
				@Override
				public JSONObject addDetails() {
					
					return null;
				}
			};
			ArrayList<JSONObject> StockServicesViewArrayList = new ArrayList<JSONObject>();
			int temporaryNumber = 0;
			do {
				System.out.println("*************************Stock Management*************************");
				System.out.println("1. Add Details");
				System.out.println("2. View Deatils");
				System.out.println("3. Price of share");
				System.out.println("4. Total Price of shares");
				System.out.println("5. Exit");

				int choice = utility.nextInteger();
				switch (choice) {
				case 1:
					//logic to add details
					System.out.println("Enter a number how many company's details to add : ");
					int number = utility.nextInteger();
					while (number > 0) {
						StockServicesViewArrayList.add(StockAccountServicesObject.addDetails());
						number--;
					}
					stockServicesViewJsonObject.put("Stock", StockServicesViewArrayList);
					try {
						@SuppressWarnings("resource")
						FileWriter fileWriter = new FileWriter("Stock.json");
						fileWriter.write(stockServicesViewJsonObject.toString());
						fileWriter.flush();

					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				case 2:
					//for reading a data from file
					StockAccountServicesObject.readFile();
					break;

				case 3:
					//for calculating a price of share
					System.out.println("Enter a company name : ");
					String name = utility.next();
					double price = StockAccountServicesObject.price(name);
					System.out.println(price);
					break;

				case 4:
					//for calculating a total price
					System.out.println("Enter a company name : ");
					String companyName = utility.next();
					double totalPrice = StockAccountServicesObject.totalPrice(companyName);
					System.out.println(totalPrice);
					break;

				case 5:
					System.out.println("Thank You");
					System.exit(0);

				default:
					System.out.println("You entered wrong choice");
					break;

				}
			} while (temporaryNumber < 5);
		}
}
