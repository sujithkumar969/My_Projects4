package logicpractice;

import java.util.ArrayList;

public class ReverseStringAndPrintReverseWordsAndPrint {
	
	public static void main (String[] args) {
	
	String str = "QSpider is a best one. QSpider is quality one. QSpider is hardwork.";
	
	String[] str_ary = str.split(" ");
	
	ArrayList<String> list = new ArrayList<String>();
	
	for(int ix=str_ary.length-1; ix>=0; ix--) {
		
		System.out.print(str_ary[ix]);
		System.out.print(" ");
		
		String s = str_ary[ix];
		list.add(s);
	}
	
	System.out.println();
	System.out.println("---------------------------------------------------------");
	
    for(int jx=0; jx<=list.size()-1; jx++) {
    	
    	char[] chr = list.get(jx).toCharArray();
    	
    	for(int jxx=chr.length-1; jxx>=0; jxx--) {
    		
    		System.out.print(chr[jxx]);
    	}
		System.out.print(" ");

    }
	
	}


}
