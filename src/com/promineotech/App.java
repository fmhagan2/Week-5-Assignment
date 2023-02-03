package com.promineotech;

public class App {

	public static void main(String[] args) {
		
		
		Logger astLog = new AsteriskLogger();
		Logger spaceLog = new SpacedLogger();
		
		astLog.Log("Hello");
		astLog.Error("GoodBye");
		spaceLog.Log("STAR");
		spaceLog.Error("COMET");
		
		
		
	}

}
