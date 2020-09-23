package finalise;

public class CallToFinaliseMethod1 {
	
	public static void main(String[] args) {
		
		String s = new String();
		s = null;
		
		CallToFinaliseMethod1 c = new CallToFinaliseMethod1();
		c.test1();
		
		c=null;	        // mandatory to make object as null //
		System.gc();    // mandatory to call garbage collector //
		System.out.println("main method");
		
	}
	
	public void test1() {
		
		System.out.println("test one");
	}
	
	public void finalize() {                  
		
		System.out.println("finalise method");
	}

}
