package multiThreading;


class AA implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
		Thread thread = Thread.currentThread();
		thread.setName("Class AA Thread");
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

class BB implements Runnable{

	@Override
	public void run() {
		
		for(int i=1; i<=10; i++) {
		Thread thread = Thread.currentThread();
		thread.setName("Class BB Thread");
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

public class MultipleThreadsUsingRunnable {

	public static void main(String[] args) {
		
		AA aa = new AA();
		Thread t1 = new Thread(aa);
		t1.start();
		
		BB bb = new BB();
		Thread t2 = new Thread(bb);
		t2.start();
		
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
