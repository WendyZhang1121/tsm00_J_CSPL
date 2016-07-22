package tsm00_J_CSPL;

public class TestThread implements Runnable {

	public void run() {
		Base test = new Base();
		test.doSomething();
		
		Derived test2 = new Derived();
		test2.doSomething();
		
	}
	public static void main(String[] args) throws Exception { 
		
		TestThread t = new TestThread();
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}
}

