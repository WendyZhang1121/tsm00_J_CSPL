package tsm00_J_CSPL;

import java.util.logging.Level;
import java.util.logging.Logger;

class Derived extends Base {

	private final Object lock = new Object();
	private Logger logger;
	@Override 
	public void doSomething() { 
		synchronized (lock) {
			try { 
				super.doSomething();
			} finally {
				logger.log(Level.FINE, "Did something");
			} 
		}
	} 
}