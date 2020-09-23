package logicpractice;

public class ReverseTheString {
	
	public static void main(String[] args) {
		
		String str = "QSpider is a best one. QSpider is quality one. QSpider is hardwork.";
		
		String[] str_ary = str.split(" ");
		
		for(int ix=str_ary.length-1; ix>=0; ix--) {
			
			String s = str_ary[ix];
			
			System.out.print(s);
			System.out.print(" ");
			
		}
		
		
		
	}

}
