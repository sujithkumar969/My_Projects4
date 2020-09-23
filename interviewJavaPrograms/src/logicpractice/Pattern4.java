package logicpractice;

public class Pattern4 {
	
	public static void main (String[] args) {
		
		int n = 5;
		
		for(int ix=1; ix<=n; ix++) {
			
			int num = 2;
			
			for(int ixx=1; ixx<=2*(n-ix); ixx++) {      // to print spaces //
				System.out.print(" ");				
			}
			
			for(int jx=1; jx<=ix; jx++) {
				System.out.print(num+" ");
				int num1 = num + 2;           // or num=num+2
				num = num1;
			}
			
			System.out.println();
			
		}
		
	}

}
