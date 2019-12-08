package com.bridgelabz.InvantoryData;

import java.io.FileWriter;


import org.json.simple.JSONObject;

import com.bridgelabz.utility.utility;
/**
 * It contains the main method which the user uses so that the user can manipulate the 
 * inventory objects
 * 
 * @author Amresh Kumar
 * @since  5-12-2019
 *
 */
public class InventoryDataView {
public static void main(String[] args) {
	// creating a JSON object
			JSONObject InventoryDataViewjsonObject = new JSONObject();
			InventoryDataController inventoryDataControllerObject = new InventoryDataController();
			int temporaryNumber = 0;
			do {
				System.out.println("Inventory Data");
				System.out.println("1. Add ");
				System.out.println("2. View ");
				System.out.println("3. Total Weight");
				System.out.println("4. Price(per kg)");
				System.out.println("5. Total Price");
				System.out.println("6. Exit");

				int choice = utility.nextInteger();
				switch (choice) {
				case 1: // logic to add details in inventory data
					System.out.println("Enter the details of Rice");
					InventoryDataViewjsonObject.put("Rice", inventoryDataControllerObject.addDetails());

					System.out.println("Enter the details of Pulse");
					InventoryDataViewjsonObject.put("Pulses", inventoryDataControllerObject.addDetails());

					System.out.println("Enter the details of Wheat");
					InventoryDataViewjsonObject.put("Wheats", inventoryDataControllerObject.addDetails());
					
					try {
						FileWriter fileWriter = new FileWriter("Inventory.json");
						fileWriter.write(InventoryDataViewjsonObject.toString());
						fileWriter.flush();
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;

				// for reading the inventory data from the file 
				case 2:
					inventoryDataControllerObject.readFile();
					break;

				// for calculating the total weight of items from the json file
				case 3:
					System.out.println("Total Weight of Rice,Pulses and Wheats : " + inventoryDataControllerObject.totalWeight());
					break;

				// for calculating the individual price of rice,wheat and pulses from the file
				case 4:
					System.out.println("Item name : ");
					String item = utility.next();
					System.out.println(item + " is " + inventoryDataControllerObject.price(item) + " Rs per kg.");
					break;

				// for calculating the total price of items which are present in the json file
				case 5:
					System.out.println("Total Price of Rice,Pulses and Wheats : " + inventoryDataControllerObject.totalPrice());
					break;

				case 6:
					System.out.println("*******Thank You********");
					System.exit(0);

				default:
					System.out.println("*******Wrong Input*******");
					break;
				}

			} while (temporaryNumber < 6);
}

}
