package logicpractice;

public class Pattern2 {
	
	public static void main (String[] args) {
		
		
		for(int ix=1; ix<=5; ix++) {
			int num = 1;
			
			for(int jx=1; jx<=ix; jx++) {
				
				System.out.print(num+" ");
				num++;
			}
			
			System.out.println(" ");
		}
		
	}

}
