package logicpractice;

public class OddPatternPrint {
	
	public static void main (String[] args) {		
		
		for(int jx=1; jx<=5; jx++) {
			
			int num = 1;
		
		for(int ix=1; ix<=jx; ix++) {
			
			System.out.print(num+" ");
			num = num + 2;
		//	num = num1;
			
		}
		
		System.out.println();
		
		}
		
	}

}
