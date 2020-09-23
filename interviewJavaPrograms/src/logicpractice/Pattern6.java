package logicpractice;

public class Pattern6 {
	
	public static void main (String[] args) {
		
		int n = 5;
		
		for(int ix=n; ix>=1; ix--) {
			
			int count = 2;
			
			for(int ixx=1; ixx<=2*(n-ix); ixx++) {     // to print spaces //				
			    System.out.print(" ");				
			}
			
			for(int jx=1; jx<=ix; jx++) {	
				System.out.print(count+" ");
				int count1 = count + 2;         // or count=count+2
				count = count1;
			}
			
			System.out.println();
		}
		
	}

}
