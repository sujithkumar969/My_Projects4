package threadsPrograms;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task implements Runnable{
	
	String name;
	
	Task(String name) {
		this.name = name;
		
	}

	@Override
	public void run() {
		
		for(int i=0; i<=5; i++) {
			if(i==0) {
				
		        System.out.println(Thread.currentThread().getName()+" "+"Task - "+name+ " is Initialising "+i);
			}
			else {
				
				System.out.println(Thread.currentThread().getName()+" "+"Task - "+name+ " is Executing "+i);
			}
		
		try{
		Thread.sleep(2000);
		}
		
		catch (Exception e) {
			System.out.println(e);
		}	
	}
	}
}

public class TestThreadPool1 {

	public static void main(String[] args) {
		
		Runnable t1 = new Task("t1");   // create a task(Runnable object) //
		Runnable t2 = new Task("t2");
		Runnable t3 = new Task("t3");
		Runnable t4 = new Task("t4");
		Runnable t5 = new Task("t5");
		
		ExecutorService pool = Executors.newFixedThreadPool(3);   // create a thread pool with size of 3. Now in pool 3 threads will be available //
		
		pool.execute(t1);         // Pass tasks to executor pool //
		pool.execute(t2);
		pool.execute(t3);
		pool.execute(t4);
		pool.execute(t5);
		
		pool.shutdown();      // shutdown executor pool //
		
		}
	}

