package interviewJavaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CompreTwoArrays {

	public static void main(String[] args) {
		
		String[] s1 = {"sujith","BE","MTech","QA","male" };
		String[] s2 = {"sujith","BE","MTech","QA","male" };
		String[] s3 = {"sujith","BSc","MSc","QA","male" };
		
		System.out.println(Arrays.equals(s1, s2));         // case insensitive //  returns true
		System.out.println(Arrays.equals(s1, s3));        // returns false //

	}

}
