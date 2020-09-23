package threadsPrograms;

public class GarbageCollection1 {             // if we press f11, this code will execute. If we run through run button, it will not execute //
	
	public void finalize() {
		
		System.out.println("finalise method is executed");
	}

	public static void main(String[] args) {
		
		
		
		GarbageCollection1 g1 = new GarbageCollection1();
		GarbageCollection1 g2 = new GarbageCollection1();
		
		g1=null;
		g2=null;
		
		//System.out.println("----------");
		
		System.gc();

	}

}
