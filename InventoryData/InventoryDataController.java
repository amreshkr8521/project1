package com.bridgelabz.InvantoryData;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.utility.utility;

/*****************************************************************************************************
 * 
 * It is a class which controlles all the data flow from the user and the file
 * 
 * @author  Amresh kumar
 * @since   5-12-2019
 * @version 1.0
 *
 ******************************************************************************************************
 */
public class InventoryDataController {
	
	
	/************************************************************************************************
	 * 
	 *To add details in the Inventory Data System
	 * 
	 * @param  null	
	 * @return JSONObject
	 * 
	 * *********************************************************************************************
	 */
	public JSONObject addDetails() {
		JSONObject jsonObject = new JSONObject();

		System.out.print("Enter a name : ");
		String nameOfInventoryItem = utility.next();
		utility.nextLine();

		System.out.print("Enter a price : ");
		double priceOfINventoryItem = utility.nextDouble();

		System.out.print("Enter a weight(in kg) :");
		double weightOfInventoryItem = utility.nextDouble();

		jsonObject.put("Name", nameOfInventoryItem);
		jsonObject.put("Price", priceOfINventoryItem);
		jsonObject.put("Weight", weightOfInventoryItem);

		return jsonObject;
	}

	/******************************************************************
	 * to read the data from Inventory Data System file 
	 * which is in the form of json
	 * 
	 * @param  null
	 * @return void
	 * 
	 * ****************************************************************
	 */
	public void readFile() {
		String string = utility.readFromFile("Inventory.json");
		JSONParser parser = new JSONParser();

		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}

		System.out.printf("Rice Details %s", objectFile.get("Rice"));
		System.out.println();
		System.out.printf("Pulses Details %s", objectFile.get("Pulses"));
		System.out.println();
		System.out.printf("Wheats Details %s", objectFile.get("Wheats"));
		System.out.println();
	}

	/***************************************************************************************************
	 * define function to calculate the total weight of items in Inventory Data
	 * System
	 * 
	 * @param  null
	 * @return double
	 * 
	 * *************************************************************************************************
	 */
	public double totalWeight() {
		double totalWeightOfAllTheItem = 0;

	
		String stringFileOfInventory = utility.readFromFile("Inventory.json");
		
		JSONParser jsonParser = new JSONParser();

		JSONObject objectFileOfInventory = null;
			try {
				objectFileOfInventory = (JSONObject) jsonParser.parse(stringFileOfInventory);
			} catch (org.json.simple.parser.ParseException e) {
				
				e.printStackTrace();
			}
	

		JSONObject riceObjectOfInventory = (JSONObject) objectFileOfInventory.get("Rice");
		double riceWeight = (double) riceObjectOfInventory.get("Weight"); //geting Weight of Rice

		JSONObject pulsesObjectOfInventory = (JSONObject) objectFileOfInventory.get("Pulses");
		double pulsesWeight = (double) pulsesObjectOfInventory.get("Weight");//geting Weight of Pulses

		JSONObject wheatsObjectOfInventory = (JSONObject) objectFileOfInventory.get("Wheats");
		double wheatsWeight = (double) wheatsObjectOfInventory.get("Weight");//geting Weight of Wheats

		totalWeightOfAllTheItem = riceWeight + pulsesWeight + wheatsWeight;

		return totalWeightOfAllTheItem; //return total weight
	}

	/************************************************************************************************
	 * 
	 * To calculate the total price of all the items
	 * 
	 * @param  null
	 * @return double
	 * 
	 * ***********************************************************************************************
	 */
	public double totalPrice() {
		double totalPriceOfTheInventoryProductAccordingToTheWeight = 0;
	
		String stringFile = utility.readFromFile("Inventory.json");
		// creating a JSONParser object
		JSONParser jsonParser = new JSONParser();

		JSONObject jsonObjectFile = null;
		try {
			jsonObjectFile = (JSONObject) jsonParser.parse(stringFile);
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}

		JSONObject jsonRiceObject = (JSONObject) jsonObjectFile.get("Rice");
		double ricePrice = (double) jsonRiceObject.get("Price");
		double riceWeight = (double) jsonRiceObject.get("Weight");

		JSONObject jsoPpulsesObject = (JSONObject) jsonObjectFile.get("Pulses");
		double pulsesPrice = (double) jsoPpulsesObject.get("Price");
		double pulsesWeight = (double) jsoPpulsesObject.get("Weight");

		JSONObject jsonWheatsObject = (JSONObject) jsonObjectFile.get("Wheats");
		double wheatsPrice = (double) jsonWheatsObject.get("Price");
		double wheatsWeight = (double) jsonWheatsObject.get("Weight");

		totalPriceOfTheInventoryProductAccordingToTheWeight = (ricePrice * riceWeight) + (pulsesPrice * pulsesWeight) + (wheatsPrice * wheatsWeight);
		return totalPriceOfTheInventoryProductAccordingToTheWeight;
	}

	/***********************************************************************************
	 * 
	 * to recive the price of item
	 * 
	 * @param  item --> String
	 * @return double
	 * 
	 * *********************************************************************************
	 */
	public double price(String item) {

		String itemRiceFromTheInventory = "Rice";
		int rice = itemRiceFromTheInventory.compareToIgnoreCase(item);
		String itemWheatsFromTheInventory = "Wheats";
		int wheats = itemWheatsFromTheInventory.compareToIgnoreCase(item);
		String itemPulsesFromTheInventory = "Pulses";
		int pulses = itemPulsesFromTheInventory.compareToIgnoreCase(item);

		
		String stringOfJsonFile = utility.readFromFile("Inventory.json");

		JSONParser parser = new JSONParser();

		JSONObject jsonObjectFile = null;
		
		//try catch block as file can give exception if file is not found
		try {
			jsonObjectFile = (JSONObject) parser.parse(stringOfJsonFile);
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		double itemPrice = 0;
		if (rice == 0) {
			JSONObject itemObject = (JSONObject) jsonObjectFile.get("Rice");
			itemPrice = (double) itemObject.get("Price");
			return itemPrice;
		}
		if (pulses == 0) {
			JSONObject itemObject = (JSONObject) jsonObjectFile.get("Pulses");
			itemPrice = (double) itemObject.get("Price");
			return itemPrice;
		}
		if (wheats == 0) {
			JSONObject itemObject = (JSONObject) jsonObjectFile.get("Wheats");
			itemPrice = (double) itemObject.get("Price");
			return itemPrice;
		}
		return 0;
	}
}
