package interviewJavaPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int n1=0, n2=1, n3, num=5;
		
		System.out.print(n1+" "+n2);
		
		/*
		 * Next number is sum of previous 2 numbers. Ex:-  0,1,1,2,3,5,8....
		 */
		for(int i=2; i<=num; i++) {
			
			n3 = n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}

}
