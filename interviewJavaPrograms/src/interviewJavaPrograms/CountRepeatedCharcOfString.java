package interviewJavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class CountRepeatedCharcOfString {
	
	public static void main(String[] args) {
		
		String str = "This is my automation project class and this is my last class";
		
		// converting string to characters array //
		char[] chars = str.toCharArray();
		
		// create HashMap object //
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		/*
		 * logic: inserting chars as keys and count as value.
		 * If chars already exist in map, then increment by 1.
		 */
		for(Character ch : chars ) {		
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);					
				}
			else {
				map.put(ch, 1);			
			}
		}
		
		/*
		 * Obtaining the set of keys from HashMap(returning all keys from HashMap)
		 * If count(value) is greater than 1 are printing.
		 */
		Set<Character> keys = map.keySet();	
		for(Character c : keys) {			               // to get the character from map and print it //
		    if(map.get(c) > 1) {		    	
			    System.out.println("duplicate counts: "+ c + "=" + map.get(c));		
		    }
		}		
	}
}