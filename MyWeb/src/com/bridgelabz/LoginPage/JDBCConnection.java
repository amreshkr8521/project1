package com.bridgelabz.LoginPage;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection extends JDBCProvider {
	/**
	 * To create the connection between the mysql and the application
	 * 
	 * @param 	link 		--> String
	 * @param 	name 		--> String
	 * @param 	password 	--> String
	 * @return 	Connection
	 */
public Connection jdbcConnection(String link,String name,String password)
{
	try {
		
		Class.forName("com.mysql.jdbc.Driver");		
		Connection connction=DriverManager.getConnection(link,name,password);	
		return connction;		
	}
	catch(Exception e) {
		System.out.println("Connection failed");
		e.printStackTrace();
		}
	return null;	
}
}

