package tsm00_J_CSPL;

class Base {
	private final Object lock = new Object();
	public void doSomething() { 
		synchronized (lock) {
		}
	}
}
// ...
