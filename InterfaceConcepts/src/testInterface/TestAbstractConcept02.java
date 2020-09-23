package testInterface;                       // public abstract static method - shows compile time error //

//super java interface type //
interface TestAbstractConceptOne {

 //  static void testStaticMethod(int a, int b); --------  in interface, only "public abstract" allowed. "static" not allowed  // 
}

//subclass type //
class TestClassOne implements TestAbstractConceptOne {

   public void testStaticMethod(int a, int b) {
 	  
        int sum = a + b;
        System.out.println("sum of a and b is " + sum);
        System.out.println("overrided nonstatic method is executed");
   }
}

// main class //
public class TestAbstractConcept02 {

	public static void main(String[] args) {
		
		   TestClassOne t = new TestClassOne();
		   t.testStaticMethod(10, 15);
	}
}
