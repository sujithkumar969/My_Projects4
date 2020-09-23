package testInterface;

interface InterfaceTwo {
	
	void test();
	default void sum(int a, int b) {                // default method - available in 1.8 or above versions //
		System.out.println(a+b);
	}
}

class subClassTwo implements InterfaceTwo {

	public void test() {
		
		System.out.println("from test() method");
	}
}

public class TestAbstractConcept03 {

	public static void main(String[] args) {
		
		subClassTwo sc = new subClassTwo();
		sc.test();
		sc.sum(10,15);
	}
}