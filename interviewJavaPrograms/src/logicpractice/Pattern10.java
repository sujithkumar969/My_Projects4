package logicpractice;

public class Pattern10 {
	
	public static void main (String[] args) {
		
		int n = 5;
		char chr = 'a';
		
		for(int ix=n; ix>=1; ix--) {
			
			for(int ixx=1; ixx<=2*(n-ix); ixx++) {
				System.out.print(" ");
			}
			
			for(int jxx=1; jxx<=ix; jxx++) {
				System.out.print(chr++ + " ");
			}
			System.out.println();
		}
		
	}

}
