package com.bridgelabz.inventory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/*********************************************************************************************************
 * 
 * Purpose : Inventory management is to manage all the product in the store according to the uses 
 * 				need and display all the products with there weight, price and name.
 * 				To display the total weight and total price of the selected items 
 * 
 * @author Amresh Kumar
 * @since  16-12-2019
 * @version 1.1
 * 
 * 
 **********************************************************************************************************
 */
public class InventoryController implements Iservices {
	static double totalWeight=0;
	static double totalPrice=0;
	static Scanner scanner=new  Scanner(System.in);
	JSONObject rootObject=new JSONObject();
	static Inventory  inventory=new Inventory();
	

	@Override
	public JSONObject addDetails() {
		System.out.println("Object you want to update");
		System.out.println("1 : Wheat");
		System.out.println("2 : Rice");
		System.out.println("3 : Pulses");
		System.out.println("4 : Back");
		switch(scanner.nextInt()) {
		case 1:
			return add();
			
		case 2:
			return add();
			
		case 3:
			 return add();
			
		case 4:
			View.menu("Manager");
		default :
			System.out.println("***wrong Input***");
			View.menu();
		}
		
		return null;
	}

	@SuppressWarnings("unchecked")
	private JSONObject add() {
		Inventory inventoryObject=new Inventory();
		JSONObject jsonObject=new JSONObject();
		
		System.out.println("Enter the details");
		System.out.println();
		System.out.println("Enter the name of the wheat");
		inventoryObject.setName(scanner.next());
		jsonObject.put("Name",inventoryObject.getName());
		System.out.println("Enter the weight you are storing ");
		inventoryObject.setWeight(scanner.nextLong());
		jsonObject.put("Weight",inventoryObject.getWeight());
		System.out.println("Enter the price per kg ");
		inventoryObject.setPrice(scanner.nextInt());
		jsonObject.put("price", inventoryObject.getPrice());
		
		
		 rootObject.put(inventoryObject.getName(),jsonObject);
		
		return rootObject;
		
		
	}

	

	@Override
	public double totalWeight() {
		return totalWeight;
	}

	@Override
	public double totalPrice() {
		
		return totalPrice;
	}

	
	/*******************************************************************************
	 * To read the file and return as the JSON Object which is in the file.
	 *  
	 * @param  filename
	 * @return JSONObject
	 * 
	 * ****************************************************************************
	 */
	public JSONObject readDetails(String filename) {
		String string =readFromFile(filename);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			return objectFile;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;	
		}
	
	public static String readFromFile(String filename) {
		BufferedReader bufferedReader = null;
		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferedReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString();
	}
	
	/***************************************************************************
	 * define function to write a data into file
	 * 
	 * @param jsonObject
	 * @param filename
	 * 
	 * **************************************************************************
	 */
	public static void writeToFile(JSONObject jsonObject, String filename) {
		File file = null;
		try {
			file = new File(filename);
			if (!file.exists())
				file.createNewFile();
			@SuppressWarnings("resource")
			FileWriter fileWriter = new FileWriter(file);
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();
			System.out.println(jsonObject.toJSONString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	/*******************************************************************************
	 * To call the details method to show all the data of the particular thing
	 * 
	 * @param name --> String
	 * 
	 * ****************************************************************************
	 */
	public static void show(String name) {
		switch(name) {
		case "Wheat":
			details("wheat.json");
			break;
		case "Rice":
			details("Rice.json");
			break;
		case "Pulses":
			details("Pulses.json");
			break;
		default :
			System.out.println("Something Went Wrong");
			View.menu("Manager");
		}
	}

	/**************************************************************
	 * 
	 * To display all the details of particular thing
	 * 
	 * @param string --> String
	 * 
	 * ************************************************************
	 */
	private static void details(String string) {
		JSONParser jsonParser=new JSONParser();
		
	try {
		Object	object = (JSONObject) jsonParser.parse(new FileReader(string));
		JSONObject jsonObject=(JSONObject) object;
		Set<?> set=jsonObject.keySet();
		Iterator<?> itr=set.iterator();
		
		while(itr.hasNext()) {
			JSONObject jsonItem=(JSONObject) jsonObject.get(itr.next());
			
			System.out.println("Name \t="+jsonItem.get("Name"));
			System.out.println("price \t="+jsonItem.get("price"));
			System.out.println("weight \t="+jsonItem.get("Weight"));
			System.out.println();
			System.out.println("**************************");
			System.out.println();
			
			
		}
		
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
	
		e.printStackTrace();
	} catch (ParseException e) {
		
		e.printStackTrace();
	}
		
	}
	
	/**********************************************************************************
	 * 
	 * To check if the weight given by the user is present in the inventory or not
	 * 
	 * @param weight --> double
	 * @param fileName --> String
	 * @param Item	--> String
	 * @return  boolean
	 * 
	 * **********************************************************************************
	 */
	public static boolean IsWeight(double weight,String fileName,String Item) {
		JSONParser jsonParser=new JSONParser();
		
		try {
			Object	object = (JSONObject) jsonParser.parse(new FileReader(fileName));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
			  String nameD = (String) itr.next();
			  
				if(nameD.equals(Item)) 
				{
				
					JSONObject json=(JSONObject) jsonObject.get(Item);
					
					
					double temp= (double) json.get("Weight");
					
					if(temp>weight) {
						totalWeight=totalWeight+weight;
						return true;
					}
				
				
			}
			}	
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}
	
	/******************************************************************
	 * 
	 * To get the price of the items 
	 * 
	 * @param fileName --> string
	 * @param name		--> string
	 * @param weight  	--> long
	 * @return long
	 * 
	 * ***************************************************************
	 */
	public static long getPrice(String fileName,String name,long weight) {
JSONParser jsonParser=new JSONParser();
		
		try {
			Object	object = (JSONObject) jsonParser.parse(new FileReader(fileName));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
			  String nameD = (String) itr.next();
			  
				if(nameD.equals(name)) 
				{
				
					JSONObject json=(JSONObject) jsonObject.get(name);
					
					inventory.setPrice(  (long) json.get("price"));
					totalPrice=totalPrice+inventory.getPrice()*weight;
				return inventory.getPrice();
				
			}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		return 0;
	}

	/***********************************************************************************************************
	 * to delete the weight from the item when user has selected the specific amount of weight of the item
	 * 
	 * @param string --> string
	 * @param wt	 --> double
	 * @param name	 --> String
	 * 
	 * *********************************************************************************************************
	 */
	public void deleteweight(String string, double wt, String name) {
JSONParser jsonParser=new JSONParser();
		
		try {
			Object	object = (JSONObject) jsonParser.parse(new FileReader(string));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
			  String nameD = (String) itr.next();
			  
				if(nameD.equals(name)) 
				{
				
					JSONObject json=(JSONObject) jsonObject.get(name);
				double tt=(double) json.get("Weight");
				
					tt=tt-wt;
					
				json.put("Weight",tt);
				writeToFile(jsonObject, string);

				
			}
			}
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
		
	}
}
