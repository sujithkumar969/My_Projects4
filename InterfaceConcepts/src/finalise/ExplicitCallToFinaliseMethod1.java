package finalise;

public class ExplicitCallToFinaliseMethod1 {

	public static void main(String[] args) {
		
		ExplicitCallToFinaliseMethod1 e = new ExplicitCallToFinaliseMethod1();
		
//		e.finalize();
//		e.finalize();
		
		e=null;
		System.gc();
		System.out.println("main method");

	}
	
	public void finalize() {                  
		int i ;
		int a = 1;
		int b = 0;
		
	//	i=a/b;
		
		System.out.println("finalise method");
		
		i=a/b;

	}

}
