package interviewJavaPrograms;

public class ReverseStringUsingReverseMethod {

	public static void main(String[] args) {
		
		String str = "I'm a senior automation engineer in cmm-5 level mnc";
		
		StringBuffer strbf = new StringBuffer(str);
		strbf.reverse();
		
		System.out.println(strbf);

	}

}
