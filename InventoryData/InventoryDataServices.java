package com.bridgelabz.InvantoryData;

import org.json.simple.JSONObject;
/********************************************************************************************************************
 * 
 * This is the interface which has all the abstract method which can be inherited by the class which needs it
 * 
 * @author 	Amresh Kumar
 * @since 	5-12-2019
 * @version 1.0
 * 
 **********************************************************************************************************************
 */
public interface InventoryDataServices {
	public JSONObject addDetails();
	public void readFile();
	public double totalWeight();
    public double totalPrice();
	public double price(String item);

}
