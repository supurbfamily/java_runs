/**
 * 
 */
package com.supurb.java.patterns.bridge;

/**
 * @author Subhojit
 *
 */
public class AxelSteeringSystem extends SteeringSystem {

	/**
	 * @param steeringWheel
	 * @param transportType
	 */
	
	final static String SteeringType = "Axel";
	private final SteeringWheel steeringWheel;
	private final String transportType;
	
	public AxelSteeringSystem(SteeringWheel steeringWheel, String transportType) {
		super(steeringWheel, transportType);
		this.steeringWheel = steeringWheel;
		this.transportType = transportType;
	}

	/* (non-Javadoc)
	 * @see com.supurb.java.patterns.bridge.SteeringSystem#produce()
	 */
	@Override
	void produce() {
		System.out.println("Producing " + SteeringType + " steering system with " + steeringWheel.getSteeringStyle() + " style for transport type " + transportType  );
	}

}
