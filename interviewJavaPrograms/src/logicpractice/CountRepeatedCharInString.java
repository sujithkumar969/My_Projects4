package logicpractice;

import java.util.HashMap;
import java.util.Set;

// every pair of characters is counted as 1
//input aaabbbbbcdeffghijjjjk. output a=2, b=4, cdeghik(shouldn't display in console window), f=1, j=3)

public class CountRepeatedCharInString {           
    
	static String s = "aaabbbbbcdeffghijjjjk";
	static int count = 0;
	
	public static void main(String[] args) {
				
		for(int i=0; i<s.length()-1; i++) {
			
			char c = s.charAt(i);
			char cc = s.charAt(i+1);
			
			if (c == cc) {
				count++;
			}
		}
		System.out.println(count);     // repeated counts are summed and display in console //
		
		System.out.println("----------------------------------------------------------------------------");
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	    for(int i=0; i<s.length()-1; i++) {
	    	
			char c1 = s.charAt(i);
			char cc1 = s.charAt(i+1);
			
			if(c1 == cc1) {
				
				if(map.containsKey(cc1)) {
					map.put(cc1, map.get(cc1)+1);
				}
				else {
					map.put(cc1, 1);
				}
			}	
	    }   
	    Set<Character> ch = map.keySet();
	    for(Character s : ch) {
	    	System.out.println(s +"="+ map.get(s));
	    }

	}

}
