package com.bridgelabz.StockManagement;

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
/*****************************************************************************
 * Purpose : To take the input for the new Stock by the user
 * 				and show the total price of the stock ,
 * 				show the price of each stock and show number of stock.
 * 
 * @author Amresh kumar
 * @since  17-12-2019
 * @version 1.0
 * 
 ******************************************************************************
 */
public class StockController implements IServices {
	StockModel stockModel=new StockModel();
	Scanner scanner=new Scanner(System.in);
	JSONObject rootObject=new JSONObject();
	/**
	 * To add the data of StockModel class variables by using getter and setter
	 */
	@SuppressWarnings("unchecked")
	@Override
	public JSONObject addDetails() {
		JSONObject jsonObject=new JSONObject();
		System.out.println("Enter name of the company");
		stockModel.setNameOfCompany(scanner.next());
		jsonObject.put("NameOfCompany",stockModel.getNameOfCompany());
		System.out.println("Enter Logo For The company");
		stockModel.setLogo(scanner.next());
		jsonObject.put("Logo",stockModel.getLogo());
		System.out.println("Enter the Share of company");
		stockModel.setNoOfShare(scanner.nextDouble());
		jsonObject.put("NoOfShare",stockModel.getNoOfShare());
		System.out.println("Enter Price of the stock");
		stockModel.setPriceOfShare(scanner.nextInt());
		jsonObject.put("PriceOfShare", stockModel.getPriceOfShare());
		rootObject.put(stockModel.getLogo(), jsonObject);
		return rootObject;
	}
	/**
	 * To read the file
	 * 
	 * @param filename --> String
	 * @param logo     --> string
	 */
	@Override
	public void readFile(String filename,String logo) {
		JSONParser jsonParser=new JSONParser();
		Object object;
		try {
			object=jsonParser.parse(new FileReader("Stock.json"));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
				 String nameD = (String) itr.next();
				 if(nameD.equals(logo)) {
					 JSONObject jsonStock=(JSONObject) jsonObject.get(logo);
						System.out.println("Name of the company \t\t= "+jsonStock.get("NameOfCompany"));
						System.out.println("Logo of the company \t\t= "+jsonStock.get("Logo"));
						System.out.println("Price of share of the company \t= "+jsonStock.get("PriceOfShare"));
						

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
	/**
	 * To return the price of Stock
	 * 
	 * @param name-->string
	 */
	@Override
	public double price(String name) {
		JSONParser jsonParser=new JSONParser();
		Object object;
		try {
			object=jsonParser.parse(new FileReader("Stock.json"));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
				 String nameD = (String) itr.next();
				 if(nameD.equals(name)) {
					 JSONObject jsonStock=(JSONObject) jsonObject.get(name);
					 
						return (double) jsonStock.get("PriceOfShare");
						

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

	/**
	 * To return the total price of the share
	 * 
	 * @param companyName --> string
	 */
	@Override
	public double totalPrice(String companyName) {
		JSONParser jsonParser=new JSONParser();
		Object object;
		try {
			object=jsonParser.parse(new FileReader("Stock.json"));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
				 String nameD = (String) itr.next();
				 if(nameD.equals(companyName)) {
					 JSONObject jsonStock=(JSONObject) jsonObject.get(companyName);
					 
						double share= (double) jsonStock.get("PriceOfShare");
						double noOfshare=(double) jsonStock.get("NoOfShare");
						
							return (share*noOfshare);
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
	
	/**
	 * writting in the Stock.json
	 */
	public void newStock() {
		@SuppressWarnings("unused")
		JSONObject jsonObject=addDetails();
		writeToFile(rootObject, "Stock.json");
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
			System.out.println("***********Uploded************");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * to show the logo of the company
	 */
	public void showLogo() {
		JSONParser jsonParser=new JSONParser();
		Object object;
		try {
			object=jsonParser.parse(new FileReader("Stock.json"));
			JSONObject jsonObject=(JSONObject) object;
			Set<?> set=jsonObject.keySet();
			Iterator<?> itr=set.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("wrong logo");
		} catch (IOException e) {
			
			System.out.println("wrong logo");
		} catch (ParseException e) {
			System.out.println("wrong logo");
			e.printStackTrace();
		}
		
	}
	/**
	 * To return the total share of the company
	 * 
	 * @param logo --> String
	 * @return double
	 */
public double totalShare(String logo) {
	JSONParser jsonParser=new JSONParser();
	Object object;
	try {
		object=jsonParser.parse(new FileReader("Stock.json"));
		JSONObject jsonObject=(JSONObject) object;
		Set<?> set=jsonObject.keySet();
		Iterator<?> itr=set.iterator();
		while(itr.hasNext()) {
			 String nameD = (String) itr.next();
			 if(nameD.equals(logo)) {
				 JSONObject jsonStock=(JSONObject) jsonObject.get(logo);
				 
					return (double) jsonStock.get("NoOfShare");
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
}
