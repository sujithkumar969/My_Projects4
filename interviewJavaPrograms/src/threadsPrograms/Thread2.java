package threadsPrograms;

public class Thread2 extends Thread {
	
	public void run() {
		
		for(int i=1; i<=3; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}

	public static void main(String[] args) {
		
		Thread2 t = new Thread2();
		
		t.start();
		
		//Thread.yield();
		
		for(int j=1; j<=3; j++) {
			
			System.out.println(Thread.currentThread().getName());
			
		}

	}

}
