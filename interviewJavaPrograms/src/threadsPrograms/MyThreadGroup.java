package threadsPrograms;

public class MyThreadGroup extends Thread{
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName());
		
	}
	
	

	public static void main(String[] args) {
		
		MyThreadGroup mtg = new MyThreadGroup();      // user defined thread //
		
		
		ThreadGroup tg1 = new ThreadGroup("Parent Group A");  // create parent thread group with name //
		
		
		Thread t1 = new Thread(tg1,mtg,"own");               // set of threads //
		t1.start();
		Thread t2 = new Thread(tg1,mtg,"two");
		t2.start();
		Thread t3 = new Thread(tg1,mtg,"three");
		t3.start();
		
		t1.getThreadGroup();
		
		tg1.list();              // prints thread group information //
		

	}

	

}
