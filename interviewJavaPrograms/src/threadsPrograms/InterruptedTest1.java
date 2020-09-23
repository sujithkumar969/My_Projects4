package threadsPrograms;


public class InterruptedTest1 extends Thread {      // thread does not use sleep or wait, interrupt is called, current thread will not stop, interrupt flag is set to true //
	
	public void run() {
		
		for(int i=0; i<=3; i++) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		
		InterruptedTest1 t1 = new InterruptedTest1();
		t1.start();
		t1.interrupt();
		System.out.println("main method completed");

	}

}
