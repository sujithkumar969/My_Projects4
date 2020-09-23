package multiThreading;

class MyTask extends Thread {
	
	@Override
	public void run() {
		
		for (int doc = 1; doc<=10; doc++) {
			
			System.out.println("doc is printing from "+doc+" printer 2");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
	}	
}

public class MainThread {
	
	public static void main(String[] args) throws InterruptedException {
		
		// job 1 //
		System.out.println("Main Thread Started");
		
		MyTask mt = new MyTask();
		mt.start();
		
		// job 2 //
		for (int doc = 1; doc<=10; doc++) {
			
			System.out.println("doc is printing from "+doc+" printer 1");
			Thread.sleep(1000);
		}
				
		// job 3 //
		System.out.println("Mian Thread Finished");
	}

}
