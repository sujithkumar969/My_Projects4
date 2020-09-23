package logicpractice;

public class EvenPatternPrint {
	
	public static void main (String[] args) {
	
	
	for(int ix=1; ix<=5; ix++) {
		
		int num = 2;
		
		for(int jx=1; jx<=ix; jx++) {
			
			System.out.print(num+" ");
			 num = num + 2;
		//	num = num1;
			
		}
		
		System.out.println();
	}
	
	}

}
