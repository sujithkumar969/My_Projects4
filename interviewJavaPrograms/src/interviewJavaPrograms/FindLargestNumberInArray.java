package interviewJavaPrograms;

public class FindLargestNumberInArray {
	
	public static void main(String[] args) {
		
		int[] num = {4,23,7,67,1,2,73,0,98,120,2,2,4,4,350,1,350};
		int largeNo = 0;
		
		for(int i : num) {	
			if(largeNo < i) {              // for smallest number if(largeNo > i)  //
				largeNo = i;
			}
		} 
		
		System.out.println("Largest number is "+largeNo);
	}
}
