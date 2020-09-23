package multiThreading;                     // using "Thread" class //


class A extends Thread{                          // thread 1 //
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
		Thread thread = Thread.currentThread();
		thread.setName("Class A Thread");
		System.out.println(thread.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

class B extends Thread{                          // thread 2 //
	
	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
		Thread thread = Thread.currentThread();
		thread.setName("Class B Thread");
		System.out.println(thread.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	}
}

public class MultipleThreads {

	public static void main(String[] args) {           // main thread //
		A a = new A();
		a.start();
		
		B b = new B();
		b.start();
		
		for(int i=1; i<=10; i++) {
		Thread thread = Thread.currentThread();
		thread.setName("Mian Thread");
		System.out.println(thread.getName());
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}