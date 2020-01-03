package com.bridgelabz.LoginPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.bridgelabz.LoginPage.model.LoginModel;


public class DAOImplimentation implements ILoginDAO {
	JDBCConnection connection =new JDBCConnection() ;
	PreparedStatement preparedstatement;
	static LoginModel model=new LoginModel();
	@Override
	public LoginModel getUser(String email,String pwd) {		
		try {			
	Connection con=	connection.jdbcConnection();	
	String qry="SELECT * FROM customers WHERE email='"+email+"' and password='"+pwd+"';";
		preparedstatement=con.prepareStatement(qry);		
		ResultSet resultSet=preparedstatement.executeQuery(qry);		
		while(resultSet.next()) {				
			model.setEmail(resultSet.getString(4));
			model.setPwd(resultSet.getString(7));
			model.setFirstName(resultSet.getString(2));
			model.setLastName(resultSet.getString(3));			
			model.setMobileNo(resultSet.getLong(5));
			model.setGender(resultSet.getString(6));
			
		}		
		}catch(Exception e) {
			e.printStackTrace();
		}
	return model;
	}
	@Override
	public int addUser(LoginModel model) {
		int status=0;
		try {			
			
			Connection con=connection.jdbcConnection();
			
			String qry="insert into customers (FirstName,LastName,email,mobile,gender, password )  values('"+model.getFirstName()+"','"+model.getLastName()+"','"+model.getEmail()+"','"+model.getMobileNo()+"','"+model.getGender()+"','"+model.getPwd()+"');" ; 			
			preparedstatement=con.prepareStatement(qry);	
			status=preparedstatement.executeUpdate();				
		}catch(Exception e) {
			e.getStackTrace();
		}
		return status;
	}
	public boolean IsEmail(String email) {
		Connection con=	connection.jdbcConnection();
		String qry="SELECT email FROM customers WHERE email='"+email+"';";
		try {
			
		preparedstatement=con.prepareStatement(qry);
		ResultSet resultSet=preparedstatement.executeQuery();
		resultSet.next();
		
		if(resultSet.getString(1).equals(email)) {
			
			return true;
		}else
			return false;
		}catch(Exception e) {
			e.getStackTrace();
		}
		return false;
	}	
	

}
