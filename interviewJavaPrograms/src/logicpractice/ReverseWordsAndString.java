package logicpractice;

public class ReverseWordsAndString {
	
	public static void main(String[] args) {
		
		String str = "QSpider is a best one. QSpider is quality one. QSpider is hardwork.";
		
		String[] str_ary = str.split(" ");
		
		for(int ix=str_ary.length-1; ix>=0; ix--) {
			
			
			String s = str_ary[ix];
			char[] chr = s.toCharArray();
			
			
			for(int jx=chr.length-1; jx>=0; jx--) {
				
				System.out.print(chr[jx]);
			}
			
			System.out.print(" ");
		}
		
	}

}
