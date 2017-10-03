/**
 * 
 */
package com.supurb.java.patterns.bridge;

/**
 * @author Subhojit
 *
 */
public class PlaneSteeringWheel implements SteeringWheel {

	/**
	 * 
	 */
	public PlaneSteeringWheel() {
		super();
	}

	/* (non-Javadoc)
	 * @see com.supurb.java.patterns.bridge.SteeringWheel#getSteeringStyle()
	 */
	@Override
	public String getSteeringStyle() {
		return "Half-Moon Handle Bar Driver";
	}

}
