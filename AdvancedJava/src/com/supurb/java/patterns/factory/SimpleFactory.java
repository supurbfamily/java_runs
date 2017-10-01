package com.supurb.java.patterns.factory;

public class SimpleFactory {
	
	public enum VehicleType  {
		TRUCK ("Truck", 2001,"Ford"),
		CAR ("Car", 2002, "BMW");
		

		private String name;
		private int make;
		private String model;
		
		VehicleType (String name,
					int make,
					String model)
		{
			this.name = name;
			this.make = make;
			this.model = model;
		}
		
		public String getName() {return name;}
		public int getMake() {return make;}
		public String getModel() {return model;}
		
		
	}
	
	public class Vehicle 
	{
		private String name;
		private int make;
		private String model;
		
		public String getName()
		{
			return name;
		}
		
		public int getMake()
		{
			return make;
		}
		
		public String getModel()
		{
			return model;
		}

		public Vehicle(VehicleType vtype) {
			this.name = vtype.getName();
			this.make = vtype.getMake();
			this.model = vtype.getModel();
		}
		
		@Override
		public String toString()
		{
			return this.getClass().getCanonicalName() + "|" + getName() + "|" + getMake() + "|" + getModel();
		}
	
	}
	
	public class Truck extends Vehicle
	{

		public Truck() {
			super(VehicleType.TRUCK);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public class Car extends Vehicle
	{

		public Car() {
			super(VehicleType.CAR);
			// TODO Auto-generated constructor stub
		}
		
	}
	
	private static class VehicleFactory{
		static SimpleFactory instSimpleFactory;
		public static  Vehicle createVehicle(VehicleType vType)
		{
			if (null == instSimpleFactory)
			{
				instSimpleFactory = new SimpleFactory();
			}
			
			Vehicle v ;
			
			switch(vType)
			{
				case TRUCK:
					v	= instSimpleFactory.new Truck();
					break;
				case CAR:	
					v	= instSimpleFactory.new Car();
					break;
				default:
					v  = null;
					
			}
			return v;
			
		}
		
	}
	
	public static void main (String[] args)
	{
		Vehicle v = VehicleFactory.createVehicle(VehicleType.TRUCK);
		System.out.println(v.toString());
		v = VehicleFactory.createVehicle(VehicleType.CAR);
		System.out.println(v.toString());
	}
	
}
