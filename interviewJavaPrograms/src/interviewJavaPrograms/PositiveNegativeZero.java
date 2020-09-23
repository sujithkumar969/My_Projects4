package interviewJavaPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PositiveNegativeZero {
	
	// static int a[] = {1,2,3,0,4,1,2};
	static int pCount;
	static int nCount;
	static int zCount;
	static int LargeNum=0;
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		
		
        System.out.println("Please enter 5 digits");
		
		for(int j=0; j<5; j++) {                        // to take the input from keyboard //
			a[j] = sc.nextInt();		
		}
		
		
		for(int i=0; i<a.length; i++) {
			
			if (a[i] > 0) {		
				pCount++;		
			}
			else if (a[i] < 0) {
				nCount++;
			}
			else if (a[i] == 0) {
				zCount++;
			}	
		}
		
		System.out.println(a);
		
		System.out.println("---------------------------------------------------------");
		
		System.out.println("positive numbers count are "+pCount);
		System.out.println("negative numbers count are "+nCount);
		System.out.println("zero numbers count are "+zCount);
		
		System.out.println("---------------------------------------------------------");
		
		HashMap< Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, pCount);
		map.put(1, nCount);
		map.put(2, zCount);
		
		// to find largest number //
		for(int ix=0; ix<map.size(); ix++) {		           // 0=positive counts, 1=negative counts, 2=zero counts //
			if(LargeNum < map.get(ix)) {                      
				LargeNum = map.get(ix);
			}	
		}  
		

		
		Set<Integer> s = map.keySet();
		
		for(Integer ss : s) {
			
			if(map.get(ss) == LargeNum) {
				
				if(ss == 0) {
					System.out.println("This array has more positive numbers");
				}
				if(ss == 1) {
					System.out.println("This array has more negative numbers");
				}
				if(ss == 2) {
					System.out.println("This array has more zeros");
				}
			}
		}
	}
}
