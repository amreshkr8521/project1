package com.bridgelabz.inventory;

import org.json.simple.JSONObject;

public interface Iservices {
	public JSONObject addDetails();
	
	public double totalWeight();
    public double totalPrice();
	
}
