package week05CodingAssignment;

import java.util.ArrayList;
import java.util.List;

public class SpacedLogger implements Logger {
	
	@Override
	public void log (String input) {
		
			StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < input.length(); i++) {
			result.append(input.charAt(i)); 
			if(i < input.length() - 1) {
				result.append(" "); // append a space to the result for every character except the last character
			
			}
		}
			
			System.out.println( result.toString());
		
		}
					
	
		
	
	@Override
	public void error(String error) {
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i< error.length(); i++) {
			result.append(error.charAt(i));
			if (i < error.length() -1) {
				result.append(" ");
			}
		}
		
		System.out.println ("ERROR: " + result.toString());
	}

}
