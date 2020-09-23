package interviewJavaPrograms;                              // input  = aaaabbcccccdddefghhh  output = a4b2c5d3efgh3  //

import java.util.HashMap;
import java.util.Set;

public class PrintRepeatedCharOfString {
	
	public static void main(String[] args) {
		
		String s = "aaaabbcccccdddefghhh";
		
	    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
	    char[] chr = s.toCharArray();
	    
	    for (char c : chr) {
	    	if(map.containsKey(c)) {
	    		map.put(c, map.get(c)+1);
	    	}
	    	else {
	    		map.put(c, 1);
	    	}
	    }
	    
	    Set<Character> keySet = map.keySet();
	    
	    for(Character k : keySet) {
	    	if(map.get(k)>1) {
	    		System.out.print(k);
	    		System.out.print(map.get(k));
	    	}
	    	else {
	    		System.out.print(k);
	    	}
	    }
	}

}
