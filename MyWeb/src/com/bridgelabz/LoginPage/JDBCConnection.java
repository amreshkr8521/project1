package com.bridgelabz.LoginPage;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**************************************************************
 * To create the database connection
 * 
 * @author amresh kumar
 * @since 30-12-2019
 * 
 *        ************************************************************
 */
public class JDBCConnection extends JDBCProvider {
	/**
	 * To create the connection between the mysql and the application
	 * 
	 * @param link     --> String
	 * @param name     --> String
	 * @param password --> String
	 * @return Connection
	 */
	public Connection jdbcConnection() {
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection connction = DriverManager.getConnection(link,name,password);
			
			return connction;
		} catch (Exception e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String[] args) throws SQLException {
		JDBCConnection obj = new JDBCConnection();
		Connection con = obj.jdbcConnection();
		
	}
}
