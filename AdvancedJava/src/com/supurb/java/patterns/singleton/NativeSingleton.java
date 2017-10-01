/**
 * 
 */
package com.supurb.java.patterns.singleton;

/**
 * 
 * At least one PROBLEM with this code is that it may create many instances of the class if called concurrently by multiple threads. 
 * aka LAZY fashion.
 * @author Subhojit
 *
 */
public class NativeSingleton {

	private static NativeSingleton instNativeSingleton;
	
	private NativeSingleton ()
	{
		
	}
	
	public static NativeSingleton getInstance()
	{
		if (null == instNativeSingleton)
		{
			instNativeSingleton = new NativeSingleton();
		}
		return instNativeSingleton;
	}
}
