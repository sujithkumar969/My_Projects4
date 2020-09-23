package interviewJavaPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int fact = 1;
		
		System.out.println("enter number and press enter...");
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		/*
		 * 4!=4x3x2x1 => 24
		 */					
			for(int j=1; j<=num; j++) {
				
				 fact = fact*j;
				
			}
			
		System.out.println(fact);

	}

}
