package threadsPrograms;

class MyThread extends Thread{
	
	public void run() {
		
		for(int i=1; i<=3; i++) {
			Thread.yield();	
			System.out.println(Thread.currentThread().getName() + " " + "qspider"+"\t");
		}
			
		
	}
	
}

public class Thread1 {
	
	public static void main(String[] args) {           // main thread //
		
		MyThread t1 = new MyThread();
		MyThread t11 = new MyThread();
		MyThread t111 = new MyThread();
       
		Thread.currentThread().setPriority(10);
		
		t1.start();     	
		
		for(int i=1; i<=3; i++) {
			
			System.out.println(Thread.currentThread().getName() + " " + "qspider"+"\t");
		}


	}

}
