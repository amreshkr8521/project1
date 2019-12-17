package com.bridgelabz.StockManagementJSON;

public class StockModel {
	private String NameOfCompany;
	private double priceOfShare;
	private double noOfShare;
	private String logo;
	private long transaction;
	public String getNameOfCompany() {
		return NameOfCompany;
	}
	public void setNameOfCompany(String nameOfCompany) {
		NameOfCompany = nameOfCompany;
	}
	public double getPriceOfShare() {
		return priceOfShare;
	}
	public void setPriceOfShare(double priceOfShare) {
		this.priceOfShare = priceOfShare;
	}
	public double getNoOfShare() {
		return noOfShare;
	}
	public void setNoOfShare(double noOfShare) {
		this.noOfShare = noOfShare;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public StockModel() {}
	public long getTransaction() {
		return transaction;
	}
	public void setTransaction(long transaction) {
		this.transaction = transaction;
	}
	
}
