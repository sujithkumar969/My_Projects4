package threadsPrograms;


class Customer{
	long amount=10000;
	
	synchronized public void withDrawal(long amount) {             // Method 1 //
		
		System.out.println("Going to withdrawal");
		
		if (this.amount < amount) {
			System.out.println("Less Balance; cannot withdrawal");
			
			try {
				System.out.println("withdrawalThread enters into waiting state...");
				wait();                                            // thread enters into waiting state //
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
		    System.out.println("withdrawalThread enters into runnable state...");
			this.amount-=amount;
			System.out.println("withdrawal completed");
			System.out.println("Balance is\t"+this.amount);

	}
			
	synchronized public void deposit(long amount) {           // Method 2 //
		    System.out.println("depositThread enters into runnable state...");
			this.amount+=amount;
			System.out.println("Deposit Completed");
			notify();                                             // depositThread invokes notify() method - resumes the waiting thread //
		}
				
}

/*
class WithDrawalThread extends Thread{                  // withdrawal thread //
	Customer c;
	WithDrawalThread(Customer c){
		this.c = c;
	}
	public void run() {
		c.withDrawal(15000);
	}
}

class DepositThread extends Thread{                  // Deposit thread //
	Customer c;
	DepositThread(Customer c){
		this.c = c;
	}
	public void run() {
		c.deposit(10000);
	}
}

*/

public class InterThreadTest {

	public static void main(String[] args) {
		
		Customer c = new Customer();
	/*	WithDrawalThread w = new WithDrawalThread(c);
		DepositThread d = new DepositThread(c);
		
		w.start();
		d.start();  */
		
		Thread w = new Thread() {                  // Anonymous class - reduces the lines of code //
			public void run() {
				c.withDrawal(15000);
			}
		};
		
		Thread d = new Thread() {                  // Anonymous class - reduces the lines of code //
			public void run() {
				c.deposit(10000);
			}
		};
		
		w.start();
		d.start();
	}
}
