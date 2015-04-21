package com.oca.chapter6;

public class SwitchStatementScenarios {
	
	public static void main(String[] args) {
		final int f = 0;

		switch (3) {
		case f: // case expressions must be constant expressions
		case 's': // Implicit typecast from int to char
		}
		
		String str = "xyz";
		switch(str.length()) {
		case 1:
		case 3:
		default:
		}
		
		byte bite = 12;
		switch(bite) {
		case 24:
		case (byte)128:
		}
		
		switch(new Integer(21)) {
		case 21: System.out.println("Boxing is OK");
		}
		
		char ch = 'c';
		switch(ch) {
		case 1:
		case 'a':
		case 99: System.out.println("Got c"); 
		}
	}

}

class SwitchStatementBADScenarios {
	static int sta;
	
	public static void main(String[] args) {
		final int f;
		f = 0;
		int a = 0;

		switch (3) {
		case a: // case expressions must be constant expressions
		case f: // case expressions must be constant expressions
		case sta:
		case 's': // Implicit typecast from int to char
		}

		byte bite = 12;
		switch(bite) {
		case 24:
		//case 128: // ERROR: Type mismatch: cannot convert from int to byte
			
		//case 24:	// ERROR: Duplicate case
		}
		
	}

}