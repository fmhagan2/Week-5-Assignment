package com.promineotech;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		System.out.println("***" + log + "***");		
	}

	@Override
	public void Error(String error) {
		int starLength = 13 + error.length();
		
		for (int i = 1; i <= starLength; i++) {
			System.out.print("*");
		}
		
		System.out.println("\n***Error: " + error + "***" );
		
		for(int i = 1; i <= starLength; i++) {
			System.out.print("*");
		}
		
		System.out.println();
	}
	
	

}
