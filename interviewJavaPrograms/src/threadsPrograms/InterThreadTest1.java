package threadsPrograms;

class Chat{
	
	boolean flag = false;
	
	synchronized public void question(String msg) {     // when flag is "false", question method will execute //
		if(flag) {
			try {
				System.out.println("---questionThread - invoking wait() method---");
				wait();
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println(msg);
		this.flag = true;
		notify();
		System.out.println("---questionThread - executed notify() method---");
	}
	
	synchronized public void answer(String msg) {       // when flag is "true", answer method will execute //
		if(!flag) {
			try {
				System.out.println("---answerThread - invoking wait() method---");
				wait();
			} catch (InterruptedException e) { e.printStackTrace(); }
		}
		System.out.println(msg);
		this.flag = false;
		notify();
		System.out.println("---answerThread - executed notify() method---");
	}
	
}



public class InterThreadTest1 {

	public static void main(String[] args) {
		
		String q[] = {"Hi", "How are you ?", "I am also doing fine!"};
		String a[] = { "Hi", "I am good, what about you?", "Great!" };
		
		Chat c = new Chat(); 
		
		Thread questionThread = new Thread() {
			public void run() {
				for(int i=0; i<q.length; i++) {
				    c.question(q[i]);
				}
			}
		};
		
		Thread answerThread = new Thread() {
			public void run() {
				for(int j=0; j<a.length; j++) {
				    c.answer(a[j]);
				}
			}
		};
		
		questionThread.start();
		answerThread.start();

	}

}
