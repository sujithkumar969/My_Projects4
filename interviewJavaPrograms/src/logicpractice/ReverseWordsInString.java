package logicpractice;

public class ReverseWordsInString {
	
	public static void main(String[] args) {
		
		String str = "QSpider is a best one. QSpider is quality one. QSpider is hardwork.";
		
		String[] str_ary = str.split(" ");
		
		for(int ix=0; ix<=str_ary.length-1; ix++) {
			
			char[] chr = str_ary[ix].toCharArray();
			
			for(int jx=chr.length-1; jx>=0; jx--) {
				
				char c= chr[jx];
				System.out.print(c);
			}
			
			System.out.print(" ");
		}
	}

}
