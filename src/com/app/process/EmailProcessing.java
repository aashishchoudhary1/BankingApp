package com.app.process;

public interface EmailProcessing  {
	
	boolean validateEmail();
	
	static boolean sendEmail() {
		
		System.out.println("sending emails");
		
		return true;
	}

	default void intializeEmailServer() {
		System.out.println("intialize server");
	}
	
}
