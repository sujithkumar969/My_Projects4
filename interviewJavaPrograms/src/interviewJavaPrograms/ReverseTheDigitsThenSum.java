package interviewJavaPrograms;

import java.util.ArrayList;

public class ReverseTheDigitsThenSum {
	
	static String digits = "123456789";
	static ArrayList<Integer> list = new ArrayList<Integer>();
	static int sum=0;
	
	public static void main(String[] args) {
		
		char[] chr = digits.toCharArray();          // converting from string to array //
		
		// to perform reverse print operation //
		System.out.print("reversed string is = ");
		for(int ix=chr.length-1; ix>=0; ix--) {
			System.out.print(chr[ix]);	
		}
		
		// to convert from character to integer //
		for(int jx=0; jx<=chr.length-1; jx++) {		
			char c = chr[jx];
			String s = String.valueOf(c);            // converting from character to string //
			int num = Integer.parseInt(s);           // converting from string to integer //
			list.add(num);
		}
		
		// to add the sequence in array list //
		for(int jxx=0; jxx<= list.size()-1; jxx++ ) {			
			sum = sum + list.get(jxx);                 // to add the sequence //
		}
		
		System.out.println();
		System.out.println("sum of given sequence is = "+sum);
		
	}

}
