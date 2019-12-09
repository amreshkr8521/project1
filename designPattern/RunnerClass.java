package com.bridgelabz.designPattern;

public class RunnerClass extends DesignPatternSingletonEagerInitialization{
public static void main(String[] args) {
	DesignPatternSingletonEagerInitialization d= DesignPatternSingletonEagerInitialization.getInstanceOfDesignPatternSingletonEagerInitialization();
	
	d.setDesignpatternsingletonMessege("Amresh");
	System.out.println(d.getDesignpatternsingletonMessege());
	
}
}
