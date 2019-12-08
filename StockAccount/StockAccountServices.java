package com.bridgelabz.Stock;

import org.json.simple.JSONObject;
/**
 * Interface for the stock Account
 * contain essential method that is to be implemented by the class of stock
 * @author  Amresh Kumar
 * @since	6-12-2019
 *
 */
public interface StockAccountServices {
	public JSONObject addDetails();
	public void readFile();
	public double price(String name);
	public double totalPrice(String companyName);
}
