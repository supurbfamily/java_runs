/**
 * 
 */
package com.supurb.java.patterns.bridge;

/**
 * @author Subhojit
 *
 */
public abstract class SteeringSystem {

	public SteeringSystem(SteeringWheel steeringWheel, String transportType) {
	}
	
	abstract void produce();	

}
