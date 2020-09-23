package interviewJavaPrograms;

public class ReverseStringUsingForLoop {

	public static void main(String[] args) {
		
		String str = "I'm a senior automation engineer in cmm-5 level mnc";	
		System.out.println("----"+str.length());
		
		String[] str_array = str.split(" ");
		
		System.out.println(str_array.length);
		System.out.println(str_array.length-1);
		
	for (int i = 0; i <= (str_array.length-1); i++) {           // directly printing but using split() method //
			
			String stri_1 = str_array[i];
			System.out.print(" ");
			System.out.print(stri_1);
			
		}
	System.out.println();
	System.out.println("------------------------------------------------------------------------");
		
	for (int i = (str_array.length-1); i >= 0; i--) {              // reversing only string, but words not reversed //
			
			String stri_2 = str_array[i];
			System.out.print(" ");
			System.out.print(stri_2);		
		}
	System.out.println();
	System.out.println("------------------------------------------------------------------------");
		
		for (int i = (str.length()-1); i >= 0; i--) {             // reversing both string and words // 
			
			char stri_3 = str.charAt(i);
			System.out.print(stri_3);			
		}
    System.out.println();
	System.out.println("------------------------------------------------------------------------");

	}
}