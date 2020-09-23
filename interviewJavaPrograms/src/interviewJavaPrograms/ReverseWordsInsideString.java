package interviewJavaPrograms;

public class ReverseWordsInsideString {               // reverse only words //

	public static void main(String[] args) {

		String str = "I'm a senior automation engineer in cmm-5 level mnc";
		
		String[] str_array = str.split(" ");
		
		for (int i=0 ; i<=(str_array.length-1) ; i++) {
			
			String sub = str_array[i];
			System.out.print(" ");
			
			for(int j=(sub.length()-1) ; j>=0 ; j--) {
				
				char ch = sub.charAt(j);
				System.out.print(ch);
			}	
		}
	}
}