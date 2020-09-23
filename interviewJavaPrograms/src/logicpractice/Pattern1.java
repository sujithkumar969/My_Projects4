package logicpractice;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		for(int ix=1; ix<=5; ix++) {
			
			for(int jx=1; jx<=ix; jx++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		}
	}

}
