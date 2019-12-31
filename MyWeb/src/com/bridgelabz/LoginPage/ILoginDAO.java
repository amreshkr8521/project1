package com.bridgelabz.LoginPage;

import com.bridgelabz.LoginPage.model.LoginModel;

public interface ILoginDAO {
public LoginModel getUser(String name,String pwd);
public int addUser(LoginModel model); 
	

}
