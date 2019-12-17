package com.bridgelabz.StockManagement;

import org.json.simple.JSONObject;

public interface IServices {
	public JSONObject addDetails();
	public void readFile(String filename,String logo);
	public double price(String name);
	public double totalPrice(String companyName);
}
