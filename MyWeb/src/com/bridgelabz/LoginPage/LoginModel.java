package com.bridgelabz.LoginPage;

public class LoginModel {
private String firstName;
private String lastName;
private String email;
private String ID;
private long mobileNo;
private String gender;
private String pwd;
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getID() {
	return ID;
}
public void setID(String iD) {
	ID = iD;
}
public long getMobileNo() {
	return mobileNo;
}
public void setMobileNo(long mobileNo) {
	this.mobileNo = mobileNo;
}
public LoginModel() {}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
}
