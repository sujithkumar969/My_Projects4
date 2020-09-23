package multiThreading;


class MyTask1 implements Runnable{

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



public class RunnableThread {

	public static void main(String[] args) {
		
		// job 1 //
		System.out.println("Main Thread Started");
		
		MyTask1 m = new MyTask1();
		Thread t = new Thread(m);
			t.start();
		
		// job 2 //
		for (int doc = 1; doc<=10; doc++) {
			
			System.out.println("doc is printing from "+doc+" printer 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
				
		// job 3 //
		System.out.println("Mian Thread Finished");

	}

}
