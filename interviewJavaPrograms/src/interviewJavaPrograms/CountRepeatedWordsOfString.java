package interviewJavaPrograms;

import java.util.HashMap;
import java.util.Set;

public class CountRepeatedWordsOfString {

	public static void main(String[] args) {
		
		String str = "This is my automation project class and this is my last class";
		
		// converting string to string array(separated by white space) //
		String[] string_array = str.split(" ");
		
		// create HashMap object //
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		 * logic: inserting string as keys and count as value.
		 * If string already exist in map, then increment by 1.
		 */
		for(String key_str : string_array) {
			if(map.containsKey(key_str)) {
				map.put(key_str, map.get(key_str)+1);
			}
			else {
				map.put(key_str, 1);
			}			
		}
		
		/*
		 * Obtaining the set of keys from HashMap(returning all keys from HashMap)
		 * If count(value) of key is greater than 1 are printing.
		 */
		Set<String> key = map.keySet();
		for(String s : key ) {
			if(map.get(s)>1) {
				System.out.println("duplicate words: " + s + "=" + map.get(s));
			}
		}
	}
}