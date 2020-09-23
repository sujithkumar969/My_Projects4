package interviewJavaPrograms;

public class SplitAlphaNumSymbFrmString {
	
	public static void split(String str) {
		
		StringBuffer alpha = new StringBuffer();
		StringBuffer num = new StringBuffer();
		StringBuffer special = new StringBuffer();
		
		for (int i=0; i<str.length(); i++) 
		{ 
			if (Character.isDigit(str.charAt(i))) {
				num.append(str.charAt(i)); 
			}
			else if(Character.isAlphabetic(str.charAt(i))) {
				alpha.append(str.charAt(i)); 
			}
			else {
				special.append(str.charAt(i)); 
			}
		} 
		
		System.out.println(alpha);
		System.out.println(num);
		System.out.println(special);
	}
	// split numbers, alphabets, symbols from string //
	public static void main(String[] args) {
		
		split("!@#sujith$kumar$s()-123456");
	}

}
