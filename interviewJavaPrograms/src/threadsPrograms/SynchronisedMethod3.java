package threadsPrograms;


class Method3{
	
	public void table(int num) {
		
		for(int i=1; i<=5; i++) {
			System.out.println(i*num);
		}
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}
}

class Thread13 extends Thread{
	
	Method3 m3;
	
	Thread13(Method3 m3){
		this.m3 = m3;
	}
	
	public void run() {
		
		synchronized (m3) {      // synchronized //
			m3.table(2);
		}
	}
}

class Thread23 extends Thread{
	
	Method3 m3;
	
	Thread23(Method3 m3){
		this.m3 = m3;
	}
	
	public void run() {
		
		synchronized (m3) {      // synchronized //
			m3.table(100);
		}
	}
}



public class SynchronisedMethod3 {

	public static void main(String[] args) {
		Method3 m3 = new Method3();
		Thread13 t13 = new Thread13(m3);
		Thread23 t23 = new Thread23(m3);
		t13.start();
		t23.start();

	}

}
