package com.supurb.java.patterns.bridge;

public class BridgeRunner {

	public static void main(String[] args) {
		
		// Objects of the concrete implementation
		SteeringWheel cSW = new CarSteeringWheel();
		cSW.produce();
		
		SteeringWheel pSW = new PlaneSteeringWheel();
		pSW.produce();
		
		// Objects of the refined Abstraction
		SteeringSystem ss = new WingFlapSteeringSystem(pSW, "Plane");
		ss.produce();
		
		ss = new AxelSteeringSystem(cSW, "Car");
		ss.produce();
		
		ss = new AxelSteeringSystem(pSW, "New Mega car");
		ss.produce();
		
		ss = new WingFlapSteeringSystem(cSW, "Boat");
		ss.produce();
		
	}

}
