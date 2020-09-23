package threadsPrograms;

public class InterruptedTest3 extends Thread {
	
	public void run() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted and stopped running");
			
			throw new RuntimeException("----------------------------------"+e);
		}
		System.out.println("Thread is running....");
		
	}

	public static void main(String[] args) {
		
		InterruptedTest3 t3 = new InterruptedTest3();
		t3.start();
		
		t3.interrupt();

	}

}
