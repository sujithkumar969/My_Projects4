package threadsPrograms;

public class MultiTaskInMultiThread1 {

	public static void main(String[] args) {
		
		
		Thread t1 = new Thread() {
			
			public void run() {
				
				System.out.println(Thread.currentThread().getName());
			}
			
		};
		
		Thread t2 = new Thread() {
			
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
			
		};
		
		t1.start();
		t2.start();

	}

}
