package threadsPrograms;


class Method1 {
	
	synchronized public void table(int num) {            // synchronized method //
		
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
	
	synchronized public void print(int i) {
		  for(int j=1; j<=5; j++) {
		System.out.println("Sujith "+i);
		  }
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}
}

class Thread11 extends Thread {            // Thread 1 //
	
	Method1 m1;
	
	Thread11(Method1 m1){                  // constructor //
		this.m1 = m1;
	}
	
	public void run() {
		m1.table(2);
		m1.print(2);
	}
	
}


class Thread12 extends Thread {            // Thread 2 //
	
	Method1 m1;
	
	Thread12(Method1 m1){                  // constructor //
		this.m1 = m1;
	}
	
	public void run() {
		m1.table(100);
		m1.print(100);
	}
	
}


public class SynchronisedMethod1 {

	public static void main(String[] args) {
		
		Method1 m1 = new Method1();
		
		Thread11 t11 = new Thread11(m1);
		Thread12 t12 = new Thread12(m1);
		
		t11.start();
		t12.start();

	}

}
