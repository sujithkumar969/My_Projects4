package interviewJavaPrograms;        // input : sujith.kumar@gmail.com //
                                      // output : firstname=sujith length=6 lastname=kumar length=5 domain=gmail lenght=5 //

public class SplitEmailThenPrint {

	public static void main(String[] args) {
		
		String s = "sujith.kumar@gmail.com";
		
		int FN_LastIndex = s.indexOf('.');            // we can also use> s.split("."); //
		String firstName = s.substring(0, FN_LastIndex);
		int FN_Lenght = firstName.length();
		System.out.println("firstname = "+firstName+" , "+"length = "+FN_Lenght);
		
		int LN_LastIndex = s.indexOf('@');
		String lastName = s.substring(FN_LastIndex+1, LN_LastIndex);
		int LN_Lenght = lastName.length();
		System.out.println("lastname = "+lastName+" , "+"length = "+LN_Lenght);
		
		int DN_LastIndex = s.lastIndexOf('.');
		String domainName = s.substring(LN_LastIndex+1, DN_LastIndex);
		int DN_Lenght = domainName.length();
		System.out.println("lastname = "+domainName+" , "+"length = "+DN_Lenght);
		
		
		System.out.println(s.substring(2));
		System.out.println(s.substring(2, 7));

	}

}
