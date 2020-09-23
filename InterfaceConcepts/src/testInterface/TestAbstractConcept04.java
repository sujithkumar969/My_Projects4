package testInterface;


interface InterfaceThree {
	
	void test();
	static void sum(int a, int b) {                // default method - available in 1.8 or above versions //
		System.out.println(a+b);
	}
}

class subClassThree implements InterfaceTwo {

	public void test() {
		
		System.out.println("from test() method");
	}
}

public class TestAbstractConcept04 {

	public static void main(String[] args) {
		
		subClassThree sc = new subClassThree();
		sc.test();
		InterfaceThree.sum(10,15);

	}

}
