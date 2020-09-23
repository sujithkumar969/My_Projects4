package logicpractice;

public class Pattern3 {
	
	public static void main(String[] args) {
		
		int num = 1;
		
		for(int ix=1; ix<=5; ix++) {
			
			for(int jx=1; jx<=ix; jx++) {
				
				System.out.print(num+" ");
				num++;
				
			}
			System.out.println();

		}
				
	}

}
