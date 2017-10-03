/**
 * 
 */
package com.supurb.java.patterns.bridge;

/**
 * @author Subhojit
 *
 */
public class CarSteeringWheel implements SteeringWheel {

	/**
	 * 
	 */
	public CarSteeringWheel() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.supurb.java.patterns.bridge.SteeringWheel#getSteeringStyle()
	 */
	@Override
	public String getSteeringStyle() {
		return "Round Wheel Driver";
	}


}
