package interviewJavaPrograms;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicateNumber {             // display only unique elements from given list //

	public static void main(String[] args) {
		
		// using basic logic //
		ArrayList<Object> al = new ArrayList<Object>();
		al.add('a');
		al.add('b');
		al.add('a');
		al.add("software testing");
		al.add(30.5);
		al.add(14);
		al.add('c');
		al.add("software testing");
		al.add(true);
		al.add(true);
		
		System.out.println(al);
     	System.out.println("------------------------------------------------------------------------------------------------------------------");
		for(int i=0; i<=al.size()-1; i++) {
			
			for(int j=i+1; j<=al.size()-1; j++) {
				
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
					j--;
				}
			}			
		}
        System.out.println(al);
        
     	System.out.println("------------------------------------------------------------------------------------------------------------------");
     	
     	// using set class //
     	String[] s = {"a","b","a","software testing","30.5","14","c","software testing","true","true"}; 
     	HashSet<Object> a2 = new HashSet<Object>();
     	for(int ix=0; ix<=s.length-1; ix++) {
        a2.add(s[ix]);
	    }
        System.out.println(a2);
        
     	System.out.println("------------------------------------------------------------------------------------------------------------------");

	}
}
