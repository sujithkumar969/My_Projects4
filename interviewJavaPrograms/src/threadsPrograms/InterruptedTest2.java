package threadsPrograms;

public class InterruptedTest2 extends Thread {      // thread used sleep or wait, interrupt is called, current thread will not stop //
	
	public void run() {
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			System.out.println("Thread interrupted");
			
		}
		System.out.println("Thread is running....");
		
	}

	public static void main(String[] args) {
		
		InterruptedTest2 t2 = new InterruptedTest2();
		
		t2.start();
		
		t2.interrupt();

	}

}
