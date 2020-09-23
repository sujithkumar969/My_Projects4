package interviewJavaPrograms;

// check for return true, if only alphabets(letters) in string //
public class CheckForOnlyAlphbtInString {
	
 
	
	public static void main(String[] args) {
		
		String str = "asdfghmtyr2tydytd";
				
		if(str.chars().allMatch(Character::isLetter)) {	// checking only for letters in stream of string //
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
