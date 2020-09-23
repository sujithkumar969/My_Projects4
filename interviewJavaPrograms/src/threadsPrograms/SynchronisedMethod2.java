package threadsPrograms;


class Method2 {
	
	synchronized public void table(int num) {            // synchronized method using anonymous class //
		
		for(int i=1; i<=10; i++) {
			System.out.println(i*num);
		}
		
		System.out.println("------------------------------------------------");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class SynchronisedMethod2 {

	public static void main(String[] args) {
		
		Method2 m2 = new Method2();
		
		Thread t1 = new Thread() {           // thread 1 //
			
			public void run() {
				m2.table(2);
			}
			
		};
		
		Thread t2 = new Thread() {          // thread 2//
			
			public void run() {
				m2.table(100);
			}
			
		};
		
		t1.start();
		t2.start();

	}

}
