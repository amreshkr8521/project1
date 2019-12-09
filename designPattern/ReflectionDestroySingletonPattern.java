package com.bridgelabz.designPattern;

import java.lang.reflect.Constructor;

public class ReflectionDestroySingletonPattern {
	public static void main(String[] args) {
		DesignPatternSingletonEagerInitialization  DesignPatternSingletonEagerInitializationInstanceOne =new DesignPatternSingletonEagerInitialization().getInstanceOfDesignPatternSingletonEagerInitialization();
		DesignPatternSingletonEagerInitialization  DesignPatternSingletonEagerInitializationInstanceTwo=null;
		try {
			Constructor[] constructors=DesignPatternSingletonEagerInitialization.class.getDeclaredConstructors(); 
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				DesignPatternSingletonEagerInitializationInstanceTwo=(DesignPatternSingletonEagerInitialization) constructor.newInstance();
				break;
			}
		}catch(Exception e) {
			
		}
		
		System.out.println(DesignPatternSingletonEagerInitializationInstanceOne.hashCode());
		System.out.println(DesignPatternSingletonEagerInitializationInstanceTwo.hashCode());
		
	} 

}
