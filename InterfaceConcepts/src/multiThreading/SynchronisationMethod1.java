package multiThreading;        // multiple thread working on same Object again & again - then synchronization is needed (another way to implement) //

class AAAA{
	
	 void method1(String name) {               // this is called by thread //
		
		Thread thread = Thread.currentThread();
		thread.setName(name);
		
		for(int i=1; i<=5; i++) {		
		System.out.println(thread.getName()+" working on method1()");
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
	
	 void method2() {                   // this is not called by thread //
		
		Thread thread = Thread.currentThread();
		for(int i=1; i<=5; i++) {
		System.out.println(thread.getName()+" form method2()");
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}

class BBBB implements Runnable {
	
	AAAA aaa;
	String name = "Tommy";
	
	BBBB(AAAA a3){                  // constructor for initialization //
		this.aaa = a3;
	}

	@Override                   // thread 1 //
	public void run() {	
		synchronized (aaa) {                  // synchronised method //
			aaa.method1(name);
		}
	}	
}

class CCCC implements Runnable{
	
	AAAA aaa;
	String name = "john";
	
	CCCC(AAAA a3){                  // constructor for initialization //
		this.aaa = a3;
	}

	@Override                   // thread 2 //
	public void run() {
		synchronized (aaa) {
			aaa.method1(name);
		}
	}	
}

public class SynchronisationMethod1 {

	public static void main(String[] args) {
		AAAA aaa = new AAAA();
		
		BBBB bbb = new BBBB(aaa);
		Thread t1 = new Thread(bbb);
		t1.start();
		
        CCCC ccc = new CCCC(aaa);
        Thread t2 = new Thread(ccc);
        t2.start();
	}
}