package com.bridgelabz.designPattern;

public class DesignPatternSingletonStaticBlockInitialization {

	
	private static DesignPatternSingletonStaticBlockInitialization DesignPatternSingletonStaticBlockInitialization_Instance;
	private static String Messege="";
	private DesignPatternSingletonStaticBlockInitialization() {}
	
	static {
		try {
			DesignPatternSingletonStaticBlockInitialization_Instance=new DesignPatternSingletonStaticBlockInitialization();
		}
		catch(Exception e) {
			e.getMessage();
		}
	}
	
	public static DesignPatternSingletonStaticBlockInitialization getInstanceOfDesignPatternSingletonStaticBlockInitializatin() {
		return DesignPatternSingletonStaticBlockInitialization_Instance;
	}
	
	public static String getDesignPatternSingletonStaticBlockInitializationMessege() {
		return Messege;
	}
	
	public static void setDesignPatternSingletonStaticBlockInitializationMessege(String ReadMessege) {
		Messege=ReadMessege;
	}
	

}
