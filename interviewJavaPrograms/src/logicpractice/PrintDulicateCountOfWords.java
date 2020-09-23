package logicpractice;

public class PrintDulicateCountOfWords {
	
	public static void main(String[] args) {
		
		String str = "QSpider is a best one. QSpider is quality one. QSpider is hardwork.";
		
		String[] str_ary = str.split(" ");
		int count = 0;
		String duplicateWord = "";
		
		for(int ix=0; ix<=str_ary.length-1; ix++) {
			
			if(str_ary[ix].equals("is")) {
				
				count++;
				duplicateWord = str_ary[ix];
			}
			
		}
		
		System.out.println("Duplicate word is >"+duplicateWord+"<, and it's count is "+count);

	}

}