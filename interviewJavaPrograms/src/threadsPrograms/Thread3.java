package threadsPrograms;                     // Daemon Thread //

public class Thread3 extends Thread {
	
	public void run() {
		
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon thread running");
		}
		else {
			System.out.println("user thread running");
		}
	}

	public static void main(String[] args) {
		
		Thread3 t1 = new Thread3();
		Thread3 t2 = new Thread3();
		Thread3 t3 = new Thread3();
		
		t1.setDaemon(true);
		t1.start();
		
		t2.start();
		t3.start();

	}

}
