package threadsPrograms;

class Test {
	
	synchronized public void method1() {
		method2();
		System.out.println("method1() is executing");
	}
	
	synchronized public void method2() {
		
		System.out.println("method2() is executing");
	}
	
}

public class Reentrant {

	public static void main(String[] args) {
		
		Test t = new Test();
		
		Thread t1 = new Thread() {
			public void run() {
				t.method1();
			}
		};
		
		t1.start();
	}

}
