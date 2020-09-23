package customizedException;


class MyTestException extends Exception {              // we can extend either Exception/Throwable class //

	MyTestException() {	
		 System.out.println("No Arg constructor executed successfully");
	} 
	 MyTestException(String message){	 
		 super(message);
		 System.out.println(message);
		 System.out.println("Arg constructor executed successfully");
	 }
} 

public class MyException {

	static String[] name = {"sujith0","sujith1","sujith2","sujith3","sujith4","sujith5"};
	static double[] amount = {3000.00,2000.00,2500.00,7000.00,100.00,5000.00,};
	
	public static void main(String[] args) {
		
		System.out.println("Start");
		try {
			for(int i=0; i<=5; i++) {
										
					if(amount[i]<1000.00)  {
					String message = "amount is less than 1000.00 > "+name[i]+" = "+amount[i];
				/*	MyException me = new MyException(message);
					throw me;  */
					throw new MyTestException(message);
				}
					else {
						System.out.println(name[i]+" is greater than 1000.00 balance");
						System.out.println(name[i]+" = "+amount[i]);
					}
			}	
		} catch (MyTestException me) {
//			me.printStackTrace();
		}
		System.out.println("End1");	
	}

}
