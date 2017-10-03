/**
 * 
 */
package com.supurb.java.patterns.bridge;

/**
 * @author Subhojit
 *
 */
public class WingFlapSteeringSystem extends SteeringSystem {

	
	final static String SteeringType = "Wing Flap";
	private final SteeringWheel steeringWheel;
	private final String transportType;
	
	
	/**
	 * @param steeringWheel
	 * @param transportType
	 */
	public WingFlapSteeringSystem(SteeringWheel steeringWheel, String transportType) {
		super(steeringWheel, transportType);
		this.steeringWheel = steeringWheel;
		this.transportType = transportType;
	}

	/* (non-Javadoc)
	 * @see com.supurb.java.patterns.bridge.SteeringSystem#produce()
	 */
	@Override
	void produce() {
		System.out.println("Producing Ultra modern " + SteeringType + " steering system with " + steeringWheel.getSteeringStyle() + " style for transport type " + transportType );

	}

}
