package logicpractice;

public class Pattern8 {
	
	public static void main (String args[]) {
		
		int n = 5;
		char chr = 'a';
		
		for(int ix=1; ix<=n; ix++) {
			
			for(int jx=1; jx<=ix; jx++) {
				
				System.out.print(chr++ +" ");
				
			}
			
			System.out.println();
		}
		
	}

}
