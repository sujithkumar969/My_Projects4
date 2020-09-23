package interviewJavaPrograms;

public class Swap2NumbWithOnly2Varbl {

	public static void main(String[] args) {
		
		int y = 1;
		int x = 2;
		
		System.out.println("before swapping: the value of y is "+y);
		System.out.println("before swapping: the value of x is "+x);
		
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("---------------------------------------------------");
		System.out.println("after swapping: the value of y is "+y);
		System.out.println("after swapping: the value of x is "+x);


	}

}
