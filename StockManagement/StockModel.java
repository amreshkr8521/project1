package com.bridgelabz.StockManagement;
/**
 * model class for the stock containing all the esential data required in stock
 * using getter and setter
 * 
 * @author amresh kumar
 *
 */
public class StockModel {

	private String NameOfCompany;
	private double priceOfShare;
	private double noOfShare;
	private String logo;
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
	public StockModel(String nameOfCompany,double priceOfShare,double noOfShare) {
		this.NameOfCompany=nameOfCompany;
		this.noOfShare=noOfShare;
		this.priceOfShare=priceOfShare;
	}
	public StockModel() {}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	
}
