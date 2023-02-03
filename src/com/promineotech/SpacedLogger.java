package com.promineotech;

public class SpacedLogger implements Logger{

	@Override
	public void Log(String log) {
		char[] letters = new char[log.length()];
		for(int i = 0; i < log.length(); i++) {
			letters[i] = log.charAt(i);
			System.out.print(letters[i] + " ");
		}
		System.out.println();
	}

	@Override
	public void Error(String error) {
		System.out.print("ERROR: ");
		char[] letters = new char[error.length()];
		for(int i = 0; i < error.length(); i++) {
			letters[i] = error.charAt(i);
			System.out.print(letters[i] + " ");		
		}
	}

}
