package logicpractice;

public class Pattern7 {
	
	public static void main (String[] args) {
		
		int n=5;
		
		for(int ix=1; ix<=n; ix++) {
			
			char chr = 'a';
			
			for(int jx=1; jx<=ix; jx++) {
				
				System.out.print(chr++ +" ");
				
			}
			
			System.out.println();
			
		}
		
	}

}
