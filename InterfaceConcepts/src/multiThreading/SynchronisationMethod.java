package multiThreading;            // multiple thread working on same Object again & again - then synchronization is needed //

class AAA{
	
	synchronized void method1(String name) {               // this is called by thread //
		
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
	
	synchronized void method2() {                   // this is not called by thread //
		
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

class BBB implements Runnable {
	
	AAA aaa;
	String name = "Tommy";
	
	BBB(AAA a3){                  // constructor for initialization //
		this.aaa = a3;
	}

	@Override                   // thread 1 //
	public void run() {		
		aaa.method1(name);
	}	
}

class CCC implements Runnable{
	
	AAA aaa;
	String name = "john";
	
	CCC(AAA a3){                  // constructor for initialization //
		this.aaa = a3;
	}

	@Override                   // thread 2 //
	public void run() {		
		aaa.method1(name);
	}	
}

public class SynchronisationMethod {

	public static void main(String[] args) {
		AAA aaa = new AAA();
		
		BBB bbb = new BBB(aaa);
		Thread t1 = new Thread(bbb);
		t1.start();
		
        CCC ccc = new CCC(aaa);
        Thread t2 = new Thread(ccc);
        t2.start();
	}

}