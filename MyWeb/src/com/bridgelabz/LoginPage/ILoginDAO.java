package com.bridgelabz.LoginPage;

public interface ILoginDAO {
public LoginModel getUser(String name,String pwd);
public int addUser(LoginModel model); 
	

}
