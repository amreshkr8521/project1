package com.bridgelabz.utility;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class utility {
	private static final Scanner scanner = new Scanner(System.in);
	private static BufferedReader bufferedReader = null;
	private static FileWriter fileWriter = null;

	public static int nextInteger() {
		return scanner.nextInt();
	}

	public static double nextDouble() {
		return scanner.nextDouble();
	}

	public static float nextFloat() {
		return scanner.nextFloat();
	}

	public static String nextLine() {
		return scanner.nextLine();
	}

	public static String next() {
		return scanner.next();
	}

	public static long nextlong() {
		return scanner.nextLong();
	}

	/**
	 * define function to write a data into file
	 * 
	 * @param jsonObject
	 * @param filename
	 */
	public static void writeToFile(JSONObject jsonObject, String filename) {
		File file = null;
		try {
			file = new File(filename);
			if (!file.exists())
				file.createNewFile();
			fileWriter = new FileWriter(file);
			fileWriter.write(jsonObject.toJSONString());
			fileWriter.flush();
			System.out.println(jsonObject.toJSONString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * to read the data from file using buffered reader
	 * 
	 * @param filename
	 * @return String
	 */
	public static String readFromFile(String filename) {
		try {
			bufferedReader = new BufferedReader(new FileReader(filename));
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		StringBuilder sb = new StringBuilder();
		try {

			String line;
			while ((line = bufferedReader.readLine()) != null)
				sb.append(line);
		} catch (IOException e) {
			System.out.println("Empty file " + e.getMessage());
		} finally {
			try {

				bufferedReader.close();
			} catch (IOException e) {
				System.out.println(e.getStackTrace());
			}
		}
		return sb.toString();
	}

	/**
	 * to sort the elements of the array using bubble sort technique
	 * 
	 * @param array
	 * @param length
	 * @return array
	 */
	public static int[] bubbleSort(int[] array, int length) {
		// Logic to sort the array
		int i, j, temp;
		for (i = 0; i < length; i++) {
			int flag = 0;
			for (j = 0; j < length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					// swapping the two elements in array to sort the array
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		for (i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		return array;
	}

	/**
	 * define function to read details from file using JSON
	 * 
	 * @param FILENAME
	 * @return JSONObject
	 */
	public JSONObject readDetails(String filename) {
		String string = utility.readFromFile(filename);
		JSONParser parser = new JSONParser();
		JSONObject objectFile = null;
		try {
			objectFile = (JSONObject) parser.parse(string);
			return objectFile;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	/*****************************************************************
	 * To make the connection to the database. 
	 * 
	 * @param link --> string
	 * @param name --> string
	 * @param password --> string
	 * @return connection
	 * ***************************************************************
	 */
	public Connection jdbcConnection(String link,String name,String password ) {
		try {
			//forName is used to load the driver 
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
