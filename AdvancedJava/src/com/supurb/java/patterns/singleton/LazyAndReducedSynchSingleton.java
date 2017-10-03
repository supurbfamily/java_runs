/**
 * 
 */
package com.supurb.java.patterns.singleton;

/**
 * @author Subhojit
 *
 */
public class LazyAndReducedSynchSingleton {

	private static volatile LazyAndReducedSynchSingleton larsSingletonInst;
	
	/**
	 * 
	 */
	private LazyAndReducedSynchSingleton() {
		
	}
	
	/** with double check 
	 * 
	 * @return
	 */
	public static LazyAndReducedSynchSingleton getInstance() {
		
		if (null == larsSingletonInst) {
			synchronized (LazyAndReducedSynchSingleton.class) {
				if (null == larsSingletonInst)
				{
					larsSingletonInst = new LazyAndReducedSynchSingleton();
				}
			}
			
			return larsSingletonInst;
			
		}
		else {
			return larsSingletonInst;  
		}
		
	}

}
