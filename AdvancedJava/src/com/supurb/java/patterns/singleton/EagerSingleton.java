/**
 * 
 */
package com.supurb.java.patterns.singleton;

/**
 * @author Subhojit
 *
 */
public class EagerSingleton {
	
	private static final EagerSingleton anEagerSingleton = new EagerSingleton();

	private EagerSingleton() 
	{
		//EagerSingleton private constructor.
	}
	
	
	public static EagerSingleton getInstance() 
	{
		return anEagerSingleton;
	}

}
