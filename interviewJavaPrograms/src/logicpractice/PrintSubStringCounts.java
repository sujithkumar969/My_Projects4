package logicpractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class PrintSubStringCounts {
	
	public static void main(String[] args) {
		
		String str = "QSpider is a best one. QSpider is quality one. QSpider is hardwork.";

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		String[] str_ary = str.split(" ");
		
		for(int ix=0; ix<=str_ary.length-1; ix++) {
			
			if(map.containsKey(str_ary[ix])) {
				map.put(str_ary[ix], (map.get(str_ary[ix])+1));
			}
			else {
				map.put(str_ary[ix], 1);
			}
		}
		
		Set<String> k = map.keySet();  // returns all strings. but values will not return //
		
		for(String s : k) {
			
			if(map.get(s)>=1) {
				System.out.println("Duplicate words are "+s+"="+map.get(s));		
			}
		}
		
		
		
	}

}
