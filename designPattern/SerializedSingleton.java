package com.bridgelabz.designPattern;

import java.io.Serializable;

public class SerializedSingleton implements Serializable{
	
	 private static final long Id=-546835164;
	 
	 private SerializedSingleton() {}
	 
	 private static class InnerHelper{
		 private static SerializedSingleton instance=new SerializedSingleton(); 
	 }

	 public static SerializedSingleton getSerializedSingleton() {
		 return InnerHelper.instance;
	 }
}
