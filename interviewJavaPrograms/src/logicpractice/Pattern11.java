package logicpractice;

public class Pattern11 {
	
	public static void main (String[] args) {
		
		int n = 5;
		
		
		for(int ix=1; ix<=n; ix++) {
			
			char chr = 'a';
			
			for(int ixx=1; ixx<=2*(n-ix); ixx++) {
				System.out.print(" ");
			}
			
			for(int jx=1; jx<=ix; jx++) {
				System.out.print(chr + " ");
				chr++;
				chr++;				
			}
			
			System.out.println();
		}
		
	}

}
