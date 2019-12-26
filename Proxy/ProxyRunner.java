package com.bridgelabz.Proxy;


/**
 * To run the proxy pattern 
 * 
 * @author Amresh Kumar
 * @since  10-12-2019
 *
 */
public class ProxyRunner {

	public static void main(String[] args) {
		InterfacePoxy executor= new ProxyCommandExecuter("Amreshkr","Amresh123");
		try {
			executor.runCommand("ls -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::"+e.getMessage());
		}
	}
}
