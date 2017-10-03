/**
 * 
 */
package com.supurb.java.patterns.bridge;

/**
 * @author Subhojit
 *
 */
abstract public interface SteeringWheel {
	abstract String getSteeringStyle();
	public default void produce()
	{
		System.out.println("Producing " + getSteeringStyle() + "Steering Wheel");
	}
}
