package interviewJavaPrograms;

public class ReplaceAnotherStringWithStringInString {
	
	
	public static void anotherString(String str, String toBeReplaced, String replacedWith) {
		
		System.out.println("Before replace : "+str);
		System.out.println("--------------------------------------------------------------------");
		String astr = str.replaceAll(toBeReplaced, replacedWith);  // replacing the substring //
		System.out.println("After replace : "+astr);
	}
	
	public static void main(String[] args) {
		
		String data = "We are using Selenium for automation. Selenium has interface";
		String toBeReplaced = "Selenium";
		String replacedWith = "WebDriver";
		
		anotherString(data, toBeReplaced, replacedWith);
	}

}
