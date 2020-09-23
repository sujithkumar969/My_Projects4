package testInterface;                      // public abstract non static method //


// super java interface type //
interface TestAbstractConcept {

      void testNonStaticMethod(int a, int b);          // by default public and abstract method // 
}

// subclass type //
class TestClass implements TestAbstractConcept {

      public void testNonStaticMethod(int a, int b) {
    	  
           int sum = a + b;
           System.out.println("sum of a and b is " + sum);
           System.out.println("overrided nonstatic method is executed");
      }
}

// main class //
public class TestAbstractConcept01 {

	public static void main(String[] args) {
		
		   TestClass t = new TestClass();
		   t.testNonStaticMethod(10, 15);
	}
}
