package com.bridgelabz.LoginPage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DAOImplimentation implements ILoginDAO {

	JDBCConnection connection;
	PreparedStatement preparedstatement;
	@Override
	public LoginModel getUser(String Email,String pwd) {
		LoginModel model=new LoginModel();
		try {
	Connection con=	connection.jdbcConnection();
	String qry="Select * from Users where email=? and pwd=?";
		preparedstatement=con.prepareStatement(qry);
		preparedstatement.setString(1,Email);
		preparedstatement.setString(2,pwd);
		
		ResultSet resultSet=preparedstatement.executeQuery();
		while(resultSet.next()) {
			model.setEmail(resultSet.getString(3));
			model.setPwd(resultSet.getString(7));
			model.setFirstName(resultSet.getString(1));
			model.setLastName(resultSet.getString(2));
			model.setID(resultSet.getString(4));
			model.setMobileNo(resultSet.getLong(5));
			model.setGender(resultSet.getString(6));
		}
		
		
		}catch(Exception e) {
			
		}
	
	
	return model;
	}

	@Override
	public int addUser(LoginModel model) {
		int status=0;
		
		try {			
			Connection con=connection.jdbcConnection();
			
			String qry="Insert into Users (firstName,lastName,email,ID,mobileNumber,gender, pwd ) values(?,?,?,?,?,?,?);" ; 
					
			preparedstatement=con.prepareStatement(qry);
			preparedstatement.setString(1,model.getFirstName());
			preparedstatement.setString(2,model.getLastName());
			preparedstatement.setString(3,model.getEmail());
			preparedstatement.setString(4,model.getID());
			preparedstatement.setLong(5,model.getMobileNo());
			preparedstatement.setString(6,model.getGender());
			preparedstatement.setString(7,model.getPwd());
			status=preparedstatement.executeUpdate();
			System.out.println(status);
		}catch(Exception e) {
			
		}
		return status;
	}
}
