package finalise;

public class CallToFinaliseMethod {
	
	public static void main(String[] args) {
		
		String s = new String();
		s = null;
		
		System.gc();
		System.out.println("main method");
		
	}
	
	public void finalize() {                  
		
		System.out.println("finalise method");
	}

}
