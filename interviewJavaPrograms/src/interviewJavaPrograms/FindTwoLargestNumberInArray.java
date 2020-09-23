package interviewJavaPrograms;

public class FindTwoLargestNumberInArray {

	public static void main(String[] args) {
		
		int[] num = {4,23,7,67,1,2,73,0,98,120,2,2,4,4,350,1,0};
		int firstLargeNo = 0;
		int secondLargeNo = 0;
		int thirdLargeNo = 0;
		int fourthLargeNo = 0;
		
		for(int i : num) {	
			if(firstLargeNo < i) {
				fourthLargeNo = thirdLargeNo;
				thirdLargeNo = secondLargeNo;
				secondLargeNo = firstLargeNo;
				firstLargeNo = i;
			}
			else if (secondLargeNo < i) { 
				fourthLargeNo = thirdLargeNo;
				thirdLargeNo = secondLargeNo;
				secondLargeNo = i;
			}
			else if (thirdLargeNo < i) {
				fourthLargeNo = thirdLargeNo;  
				thirdLargeNo = i;
			}
			else if (fourthLargeNo < i) {
				fourthLargeNo = i;
			}
		}
		
		System.out.println("First Largest number is "+firstLargeNo);
		System.out.println("Second Largest number is "+secondLargeNo);
		System.out.println("Third Largest number is "+thirdLargeNo);
		System.out.println("Fourth Largest number is "+fourthLargeNo);

	}

}
