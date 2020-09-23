package threadsPrograms;

public class InterruptedThreadTest4 extends Thread {
	
	public void run() {
		
		for(int i=1; i<=3; i++) {
			
			if(Thread.interrupted()) {
				System.out.println("Interrupted flag status is - True");
			}
			else {
				System.out.println("Interrupted flag status is - False");
			}
		}
	}

	public static void main(String[] args) {
		
		InterruptedThreadTest4 t4 = new InterruptedThreadTest4();
		t4.start();
		
		t4.interrupt();

	}

}
