package interviewJavaPrograms;

import java.util.Scanner;

public class TableMultiplications {

	public static void main(String[] args) {
		
		System.out.println("enter number and then press enter...");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		System.out.println("-------------------------------------------");
		
		for(int i = 1; i <= 10; i++) {
			
			System.out.println(number + "*" + i + "=" + (number*i));
		}
		sc.close();
	}
}