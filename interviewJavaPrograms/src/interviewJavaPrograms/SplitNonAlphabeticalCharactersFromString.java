package interviewJavaPrograms;

public class SplitNonAlphabeticalCharactersFromString {    // only words will be printed //
	
	public static void nonAlphabetics(String str) {
		
	    String delimiter = "\\W+";  // ( "\\W+" --> excludes symbols ). ( "\\w+" --> excludes alphabets ) //
	    String[] string_array =  str.split(delimiter);
	    
	    for(String tokens:string_array) {
	    	System.out.println(tokens);
	    }
	    
	    System.out.println(" ");
	    System.out.println("----------------------------------------------------------------------------");
	    
	    for(int ix=0; ix<=string_array.length-1; ix++) {          // using index fetch //
	    	System.out.println(string_array[ix]);
	    }	    
	}
	
	public static void main(String[] args) {	
		nonAlphabetics("This,  is my automation:: project class and this? is my last; class");
	}
}
