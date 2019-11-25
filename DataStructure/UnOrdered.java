package com.bridgelabz.DataStructure;

import java.io.*;
import java.nio.channels.FileChannel;
import java.util.Scanner;

public class UnOrdered {

	static Scanner scanner=new Scanner(System.in);
	
	
public static String readFile(String filename) {
	BufferedReader br;

	try {
		br = new BufferedReader(new FileReader(filename));
	} catch (FileNotFoundException e) {
		System.out.println(e.getMessage());
	}
	StringBuilder sb = new StringBuilder();
	try {
		br = new BufferedReader(new FileReader(filename));
		String line;
		while ((line = br.readLine()) != null)
			sb.append(line);
	} catch (IOException e) {
		System.out.println("Empty file " + e.getMessage());
	} finally {
		try {br = new BufferedReader(new FileReader(filename));

			br.close();
		} catch (IOException e) {
			System.out.println(e.getStackTrace());
		}
	}
	return sb.toString();

}



public static void fileToList() throws IOException {
	LinkedList<String> list = new LinkedList<String>();
	System.out.println("Enter the word you want to search :");
	String str=scanner.nextLine();
	//read from file and assign into String s
	String s =readFile("C:/Users/amitv/Desktop/bridgelabz/test.txt");

	String []words = s.split(" ");
	//adding in data into linkedlist
	for (String word : words) 
		list.insert(word);
	
	
	
	
	if (list.search(str)) {
		list.remove(str);  
		System.out.println("test");
	
	} 
	
	else
	{
		list.insert(str);
		
	}
	list.show();
	
	
	
	
	
	
	FileWriter fw = new FileWriter("C:\\Users\\amitv\\Desktop\\bridgelabz\\test.txt");
	//logic to search the word,remove and add
	System.out.println(list.size());
	int size=list.size();
	for(int count=0;count<=size;count++) {
	fw.write(list.pop() +" ");
	}
	fw.close();
	
	
	
}
public static void main(String[] args) throws IOException {
	fileToList();
}
}

