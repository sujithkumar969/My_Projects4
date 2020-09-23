package threadsPrograms;


class Shared {                                    // A program for deadLock //            
	
	synchronized public void testA(Shared s2) {
		s2.testB(this);
		System.out.println("testA");
	}
	
	synchronized public void testB(Shared s1) {
		s1.testA(this);
		System.out.println("testB");
	}
	
}


class Test1 extends Thread{
	
	Shared s1;
	Shared s2;
	
	Test1(Shared s1, Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run() {	
		s1.testA(s2);
	}
	
}


class Test2 extends Thread{
	
	Shared s1;
	Shared s2;
	
	Test2(Shared s1, Shared s2){
		this.s1 = s1;
		this.s2 = s2;
	}
	
	public void run() {
		s2.testB(s1);
	}
	
}


public class DLD {

	public static void main(String[] args) {
		
		Shared s1 = new Shared();
		Shared s2 = new Shared();
		
		Test1 t1 = new Test1(s1, s2);
		Test2 t2 = new Test2(s1, s2);
		
		t1.start();
		t2.start();

	}
}
