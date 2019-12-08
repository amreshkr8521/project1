package com.bridgelabz.Stock;
/*******************************************************************************************
 * 
 * To create private data member and to access them getter setter are used
 * 
 * @author  Amresh kumar
 * @since   6-12-2019
 * @version 1.0
 *
 *******************************************************************************************
 */
public class StockAccountServicesModel {
	private String NameOfCompany;
	private double priceOfShare;
	private long noOfShare;
	
	// getter method for the NameOfCompany
	public String getNameOfCompany() {
		return NameOfCompany;
	}
	
	// Setter method for the NameOfCompany
	public void setNameOfCompany(String name) {
		this.NameOfCompany = name;
	}
	
	// Getter methhod for the NoOfShare
	public long getNoOfShare() {
		return noOfShare;
	}
	
	//  Setter methhod for the NoOfShare
	public void setNoOfShare(int noOfShares) {
		this.noOfShare = noOfShares;
	}
	
	
	@Override
	public String toString() {
		return "CompanyDetails [companyName=" + NameOfCompany + ", noOfShares=" + noOfShare + ", pricePerShares ="
				+ priceOfShare + "]";
	}
	
	// Getter methhod for the PriceOfShare
	public double getPriceOfShare() {
		return priceOfShare;
	}
	
	// Setter methhod for the PriceOfShare
	public void setPriceOfShare(double pricePerShares) {
		this.priceOfShare = pricePerShares;
	}
}
