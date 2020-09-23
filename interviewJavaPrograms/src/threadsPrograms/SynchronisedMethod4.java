package threadsPrograms;

class Method4{
	
	synchronized public static void table(int num) {     // synchronized for static method //
		
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


class Thread14 extends Thread{
	
	public void run() {

		Method4.table(2);
	}
}


class Thread24 extends Thread{	
	
	public void run() {

		Method4.table(100);
	}
}


public class SynchronisedMethod4 {

	public static void main(String[] args) {
		
		Thread14 t14 = new Thread14();
		Thread24 t24 = new Thread24();
		t14.start();
		t24.start();


	}

}
