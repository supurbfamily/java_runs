/**
 *
 */
package com.supurb.java.patterns.singleton;
/**
 * @author Subhojit
 *
 */
public class LazySynchronizedSingleton {
	 
		private static LazySynchronizedSingleton instance;
		
		private LazySynchronizedSingleton()
		{
			 
		}
	
		// watch the use of synchronization
		public static synchronized LazySynchronizedSingleton getInstance() 
		{
			 if (null == instance)
			 {
				 instance = new LazySynchronizedSingleton();
			 }
			 
			 return instance;
		}
 
}
