package interviewJavaPrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindPositionOfSubStringInString {
	
	public static void findPosition(String input) {
		
		Pattern p = Pattern.compile("[ !\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]"); // creates the pattern //
		
		Matcher m = p.matcher(input);  // matcher(string); which performs match operation against pattern // 
		
		// m.find(); returns true if matched pattern exist in input sequence //
		// m.start(); returns index of matched pattern in input sequence // 
		
		while(m.find()) {
			
			System.out.println(input.charAt(m.start())+" position at "+m.start());
			
		}
		
	}
	
	public static void main(String[] args) {	
		findPosition("Make%Selenium$Easy#");
	}

}
