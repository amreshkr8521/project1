package com.bridgelabz.StockAccount;




import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import com.bridgelabz.utility.utility;


/***********************************************************************************************************************
 * 
 * To impliment StockAccountServices and to controlle all the data manipulation of the stock Account of the company
 * 
 * @author  Amresh Kumar
 * @since   6-12-2019
 * @version 1.0
 *
 ************************************************************************************************************************
 */
public class StockAccountController implements StockAccountServices {

	
	
	/************************************************************************************************
	 * 
	 * define function to add details
	 * 
	 * @param	null
	 * @return  JSONObject
	 * 
	 * **********************************************************************************************
	 */
	
	public JSONObject addDetails() 
	{
		StockAccountServicesModel StockAccountServicesModelObject = new StockAccountServicesModel();
		JSONObject jsonObjectOfAddDetails = new JSONObject();
	
		System.out.println("Enter company name : ");
		StockAccountServicesModelObject.setNameOfCompany(utility.next());
		jsonObjectOfAddDetails.put("Name", StockAccountServicesModelObject.getNameOfCompany());
			
		System.out.println("Enter a price per share : ");
		StockAccountServicesModelObject.setPriceOfShare(utility.nextDouble());
		jsonObjectOfAddDetails.put("PricePerShares", StockAccountServicesModelObject.getPriceOfShare());
			
		System.out.println("Enter a number of shares : ");
		StockAccountServicesModelObject.setNoOfShare(utility.nextInteger());
		jsonObjectOfAddDetails.put("NumberOfShares", StockAccountServicesModelObject.getNoOfShare());

		return jsonObjectOfAddDetails;
	}
	
	
	

	/***************************************************************************************
	 * 
	 * to read data from file 
	 * 
	 * @param   null
	 * @return  void
	 * 
	 * *************************************************************************************
	 */
	public void readFile() {
		String stringOfReadFileFromJson = utility.readFromFile("Stock.json");
		JSONParser Jsonparser = new JSONParser();

		JSONObject JSONobjectFile = null;
		try {
			JSONobjectFile = (JSONObject) Jsonparser.parse(stringOfReadFileFromJson);
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		System.out.println(JSONobjectFile.toJSONString());
	}

	/**********************************************************************************************
	 * 
	 * to calculate price of individual share
	 * 
	 * @param  name --> string
	 * @return double
	 * 
	 * ********************************************************************************************
	 */
	
	public double price(String name) {
		String stringOfPriceFromJson = utility.readFromFile("Stock.json");
		JSONParser Jsonparser = new JSONParser();

		JSONObject JsonObjectFile = null;
		try {
			JsonObjectFile = (JSONObject) Jsonparser.parse(stringOfPriceFromJson);
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		double pricePerShare = 0;
		JSONArray arrayItems = (JSONArray) JsonObjectFile.get("Stock");
		Iterator<?> iteratorToIteratorFromArrayItems = arrayItems.iterator();
		while (iteratorToIteratorFromArrayItems.hasNext()) {
			JSONObject jsonObject = (JSONObject) iteratorToIteratorFromArrayItems.next();
			if(jsonObject.get("Name").equals(name)) {
				String companyName = (String) jsonObject.get("Name");
				pricePerShare = (double) jsonObject.get("PricePerShares");
			}			
		}
		return pricePerShare;
	}
	
	/************************************************************************************************
	 * 
	 * to calculate total price of all shares
	 * 
	 * @param  companyName --> String
	 * @return double
	 * 
	 * **********************************************************************************************
	 */
	
	public double totalPrice(String companyName) {
		String string = utility.readFromFile("Stock.json");
		JSONParser JSONparser = new JSONParser();

		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) JSONparser.parse(string);
		} catch (org.json.simple.parser.ParseException e) {
			e.printStackTrace();
		}
		
		double totalPrice = 0;
		double temporaryPrice = 0;
		long totalShare = 0;
		JSONArray JSONarrayItems = (JSONArray) objectFile.get("Stock");
		Iterator<?> JSONarrayItemsIterator = JSONarrayItems.iterator();
		while (JSONarrayItemsIterator.hasNext()) {
			JSONObject jsonObject = (JSONObject) JSONarrayItemsIterator.next();
			if(jsonObject.get("Name").equals(companyName)) {
				String name = (String) jsonObject.get("Name");
				temporaryPrice = (double) jsonObject.get("PricePerShares");
				totalShare = (long) jsonObject.get("NumberOfShares");
			}	
			totalPrice = temporaryPrice * totalShare;
		}
		return totalPrice;
	}
}
